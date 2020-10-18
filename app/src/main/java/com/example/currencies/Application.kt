package com.example.currencies
import android.app.Application
import com.example.currencies.ui.home.HomeViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module
import timber.log.Timber


class Application: Application() {

    val appModule = module {
        viewModel { HomeViewModel() }
    }

    override fun onCreate() {
        super.onCreate()
        addLogging()
        startDependencyInjection()
    }

    private fun addLogging() {
        Timber.plant(Timber.DebugTree())
    }


    private fun startDependencyInjection() {
        startKoin {
            androidContext(this@Application)
            modules(appModule)
        }
    }

}
