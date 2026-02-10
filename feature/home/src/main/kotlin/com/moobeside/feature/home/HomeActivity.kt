package com.moobeside.feature.home

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.dropUnlessResumed
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.jslee.core.designsystem.theme.MooBesideAppTheme
import com.jslee.core.designsystem.theme.MooBesideTheme
import com.moobeside.core.common.android.extension.enableEdgeToEdgeConfig
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.serialization.Serializable

@AndroidEntryPoint
class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdgeConfig()
        super.onCreate(savedInstanceState)
        setContent {
            val backstack = rememberNavBackStack(RouteA)

            MooBesideAppTheme {
                NavDisplay(
                    backStack = backstack,
                    onBack = { backstack.removeLastOrNull() },
                    entryProvider = entryProvider {
                        entry<RouteA> {
                            RouteAComponent(
                                modifier = Modifier.background(color = MooBesideTheme.colors.semantic.accent.background.purple),
                                title = it.toString(),
                                onClick = { backstack.add(RouteB(1)) }
                            )
                        }

                        entry<RouteB> { key ->
                            RouteBComponent(
                                modifier = Modifier.background(color = MooBesideTheme.colors.semantic.accent.background.cyan),
                                id = key.id.toString(),
                            )
                        }
                    }
                )
            }
        }
    }
}

@Serializable
private data object RouteA : NavKey

@Serializable
private data class RouteB(val id: Int) : NavKey

@Composable
private fun RouteAComponent(
    title: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .safeDrawingPadding()
            .clip(RoundedCornerShape(48.dp))
    ) {
        Text(
            modifier = Modifier
                .padding(24.dp)
                .align(Alignment.CenterHorizontally),
            text = title
        )
        Button(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            onClick = dropUnlessResumed { onClick() }  // See : https://developer.android.com/jetpack/androidx/releases/lifecycle#2.8.0
        ) {
            Text("Next")
        }
    }
}

@Composable
fun RouteBComponent(
    id: String,
    modifier: Modifier = Modifier,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .safeDrawingPadding()
            .clip(RoundedCornerShape(48.dp))
    ) {
        Text(
            modifier = Modifier
                .padding(24.dp)
                .align(Alignment.CenterHorizontally),
            text = id
        )
    }
}
