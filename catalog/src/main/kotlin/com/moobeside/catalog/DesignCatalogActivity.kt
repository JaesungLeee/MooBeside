package com.moobeside.catalog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.jslee.core.designsystem.component.divider.Divider
import com.jslee.core.designsystem.component.divider.DividerVariant
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
                ) { paddingValues ->

//                    Test(
//                        modifier = Modifier.padding(it)
//                            .widthIn(min = 100.dp)
//                            .height(48.dp)
//                    )
                    Divider(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(paddingValues),
                        variant = DividerVariant.Thick
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
        text = if (isDarkMode) "다크모드" else "라이트모드",
        style = MooBesideTheme.typography.baseNormal.copy(
            color = MooBesideTheme.colors.onPrimary,
        )
    )
}