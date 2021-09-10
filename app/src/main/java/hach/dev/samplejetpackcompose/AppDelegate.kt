package hach.dev.samplejetpackcompose

import android.app.Application
import hach.dev.samplejetpackcompose.data.AppContainer
import hach.dev.samplejetpackcompose.data.AppContainerImpl

/**
 * Created by Kamil' Abdulatipov on 10.09.2021.
 */
class AppDelegate : Application() {

    // AppContainer instance used by the rest of classes to obtain dependencies
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppContainerImpl(this)
    }
}