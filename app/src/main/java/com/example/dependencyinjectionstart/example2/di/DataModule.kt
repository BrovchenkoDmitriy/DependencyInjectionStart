package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.data.datasource.*
import dagger.Binds
import dagger.Module
import javax.inject.Named

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @DataSourceQualifier
    @ApplicationScope
    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @TestDataSourceQualifier
    @ApplicationScope
    @Binds
    fun bindTestRemoteDataSource(impl: TestExampleRemoteDataSourceImpl): ExampleRemoteDataSource


}