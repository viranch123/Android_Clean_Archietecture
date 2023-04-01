package com.example.android_clean_acrchietecture.di.component

import android.content.Context
import com.example.android_clean_acrchietecture.MVVMApplication
import com.example.android_clean_acrchietecture.data.api.NetworkService
import com.example.android_clean_acrchietecture.data.repository.TopHeadlineRepository
import com.example.android_clean_acrchietecture.di.ApplicationContext
import com.example.android_clean_acrchietecture.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: MVVMApplication)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getTopHeadlineRepository(): TopHeadlineRepository

}