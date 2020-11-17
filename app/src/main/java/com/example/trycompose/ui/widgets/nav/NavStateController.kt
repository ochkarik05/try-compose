package pro.shineapp.ea.navutils

import android.os.Bundle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.onCommit
import androidx.compose.runtime.onDispose
import androidx.navigation.NavController

@Composable
fun NavStateController(
    navState: MutableState<Bundle>,
    navController: NavController,
    content: @Composable () -> Unit
) {
    onCommit {
        val callback = NavController.OnDestinationChangedListener { navController, _, _ ->
            navState.value = navController.saveState() ?: Bundle()
        }
        navController.addOnDestinationChangedListener(callback)
        navController.restoreState(navState.value)
        onDispose {
            navController.removeOnDestinationChangedListener(callback)
        }
    }
    content()

}