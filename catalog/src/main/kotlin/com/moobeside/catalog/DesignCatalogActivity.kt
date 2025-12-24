package com.moobeside.catalog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.jslee.core.designsystem.theme.MooBesideAppTheme
import com.jslee.core.designsystem.theme.MooBesideTheme

class CatalogActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            MooBesideAppTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = MooBesideTheme.colors.background
                ) {

                    Test(
                        modifier = Modifier.padding(it)
                            .widthIn(min = 100.dp)
                            .height(48.dp)
                    )
                }
            }
        }
    }
}

@Composable
private fun Test(
    modifier: Modifier = Modifier,
) {
    val isDarkMode = isSystemInDarkTheme()
    Text(
        modifier = modifier.background(
            color = MooBesideTheme.colors.primary,
        ),
        text = if (isDarkMode) "DarkMode" else "LightMode",
        color = MooBesideTheme.colors.onPrimary
    )
}