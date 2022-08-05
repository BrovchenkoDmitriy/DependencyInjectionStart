package com.example.dependencyinjectionstart.example2.di

import android.content.Context
import com.example.dependencyinjectionstart.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)

//    @Component.Builder //use your own Builder
//    interface ApplicationComponentBuilder{
//
//        @BindsInstance //annotation for use context in graph of dependencies
//        fun context(context: Context):ApplicationComponentBuilder
//
//        @BindsInstance
//        fun currentTime(time:Long):ApplicationComponentBuilder
//
//        fun build():ApplicationComponent
//    }

    @Component.Factory
    interface ApplicationComponentFactory{
       fun create(
           @BindsInstance context: Context,
           @BindsInstance currentTimeMillis:Long
       ):ApplicationComponent
    }




}