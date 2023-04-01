package com.example.android_clean_acrchietecture.di.component

import com.example.android_clean_acrchietecture.di.ActivityScope
import com.example.android_clean_acrchietecture.di.module.ActivityModule
import com.example.android_clean_acrchietecture.ui.topheadline.TopHeadlineActivity
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: TopHeadlineActivity)

}