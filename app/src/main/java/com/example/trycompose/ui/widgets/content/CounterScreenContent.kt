package com.example.trycompose.ui.widgets.content

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Divider
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.trycompose.ui.widgets.counter.Counter
import com.example.trycompose.ui.widgets.greetings.Greeting
import com.example.trycompose.ui.widgets.main.Main

@Composable
fun ScreenContent(names: List<String> = listOf()) {
    val count = remember { mutableStateOf(0) }
    Column(modifier = Modifier.fillMaxHeight()) {
        Column(modifier = Modifier.weight(1f)) {
            names.forEach {
                Greeting(name = it)
                Divider(color = Color.Black)
            }
        }
        Counter(count.value) {
            count.value++
        }
    }
}

@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Main {
        ScreenContent(listOf("Android", "there"))
    }
}
