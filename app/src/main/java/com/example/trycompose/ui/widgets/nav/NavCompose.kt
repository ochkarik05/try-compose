package com.example.trycompose.ui.widgets.nav

import androidx.compose.foundation.Text
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.compose.*
import pro.shineapp.ea.navutils.navStateSaver

const val PROFILE = "profile"
const val ANDROIDERS = "androiders"
const val EXAMPLES = "examples"

@Composable
fun NestedNavCompose() {

    val navController = rememberNavController()

    val profileNavState = navStateSaver()
    val androidersNavState = navStateSaver()
    val examplesNavState = navStateSaver()

    Scaffold(bottomBar = { BottomBar(navController) }) {


        NavHost(navController, startDestination = PROFILE) {
            composable(PROFILE) {
                NestedNavScreen(PROFILE, profileNavState)
            }
            composable(ANDROIDERS) {
                NestedNavScreen(ANDROIDERS, androidersNavState)
            }
            composable(EXAMPLES) {
                NestedNavScreen(EXAMPLES, examplesNavState)
            }
        }

    }
}


val bottomNavItems = listOf(
    "profile", "androiders", "examples"
)

@Composable
fun BottomBar(navController: NavController) {

    val navBackStackEntry = navController.currentBackStackEntryAsState()

    BottomNavigation(
        backgroundColor = MaterialTheme.colors.surface,
        elevation = 8.dp
    ) {
        bottomNavItems.forEach { screen ->
            BottomNavigationItem(
                selectedContentColor = MaterialTheme.colors.primary,
                unselectedContentColor = MaterialTheme.colors.onSurface.copy(alpha = 0.54f),
                icon = { Icon(Icons.Filled.Favorite) },
                label = {
                    Text(text = screen)
                },
                selected = navBackStackEntry.value?.currentRoute == screen,
                onClick = {
                    navController.popBackStack(
                        navController.graph.startDestination,
                        false
                    )
                    if (navBackStackEntry.value?.currentRoute != screen) {
                        navController.navigate(screen)
                    }
                }
            )
        }
    }
}

val NavBackStackEntry.currentRoute: String?
    get() {
        return arguments?.getString(KEY_ROUTE)
    }
