package com.example.android_clean_acrchietecture

import android.app.Application
import com.example.android_clean_acrchietecture.di.component.ApplicationComponent
import com.example.android_clean_acrchietecture.di.component.DaggerApplicationComponent
import com.example.android_clean_acrchietecture.di.module.ApplicationModule

class MVVMApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        injectDependencies()
    }

    private fun injectDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }

}