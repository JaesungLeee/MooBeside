package com.jslee.moobeside

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.jslee.moobeside.navigation.MooBesideApp
import com.moobeside.core.common.android.extension.enableEdgeToEdgeConfig
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdgeConfig()
        super.onCreate(savedInstanceState)
        setContent {
            MooBesideApp()
        }
    }
}
