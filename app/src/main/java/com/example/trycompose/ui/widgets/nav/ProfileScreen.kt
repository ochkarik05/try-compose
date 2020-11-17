package com.example.trycompose.ui.widgets.nav

import android.os.Bundle
import androidx.compose.foundation.Text
import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.onCommit
import androidx.compose.runtime.onDispose
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import pro.shineapp.ea.navutils.NavStateController

@Composable
fun NestedNavScreen(root: String, navState: MutableState<Bundle>) {

    val navController = rememberNavController()

    NavStateController(navState, navController) {
        NavHost(
            navController = navController,
            startDestination = "$root/list",
        ) {
            composable("$root/list") {
                Text("${root.capitalize()} List", modifier = Modifier.clickable(onClick = {
                    navController.navigate("$root/item")
                }))
            }
            composable("$root/item") {
                Text("${root.capitalize()} Item", modifier = Modifier.clickable(onClick = {
                    navController.popBackStack()
                }))
            }
        }

        onCommit {
            navController.enableOnBackPressed(true)
        }

        onDispose {
            navController.enableOnBackPressed(false)
        }
    }

}