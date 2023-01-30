package com.selayar.history.xml.di

import android.app.Application
import com.selayar.history.xml.Util.Session
import com.selayar.history.xml.Util.MyApp
import com.selayar.history.xml.di.module.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import retrofit2.Retrofit
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, AppModule::class, ActivityBuildersModule::class, NetworkModule::class, FragmentBuildersModule::class])
interface AppComponent {
    fun inject(myApp: MyApp)

    //provide untuk dipakai di modul lain
    val sessionCore : Session
    val retrofit : Retrofit

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }
}