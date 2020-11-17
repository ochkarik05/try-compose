package pro.shineapp.ea.navutils

import android.os.Bundle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.savedinstancestate.Saver
import androidx.compose.runtime.savedinstancestate.rememberSavedInstanceState

val NavStateSaver: Saver<MutableState<Bundle>, out Any>
    get() = Saver(
        save = { it.value },
        restore = { mutableStateOf(it) }
    )

@Composable
fun navStateSaver() =
    rememberSavedInstanceState(saver = NavStateSaver) { mutableStateOf(Bundle()) }