package com.example.dependencyinjectionstart.example2.di

import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionstart.example2.presentation.ExampleViewModel
import com.example.dependencyinjectionstart.example2.presentation.ExampleViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey


@Module
interface ViewModelModule {

    @Binds
    @StringKey("ExampleViewModel")
    @IntoMap
    fun bindExampleViewModel(impl: ExampleViewModel):ViewModel

    @Binds
    @StringKey("ExampleViewModel2")
    @IntoMap
    fun bindExampleViewModel2(impl: ExampleViewModel2):ViewModel
}