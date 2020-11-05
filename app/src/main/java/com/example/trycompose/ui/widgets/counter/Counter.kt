package com.example.trycompose.ui.widgets.counter

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Counter(value: Int, updateCount: () -> Unit) {
    Button(onClick = updateCount, modifier = Modifier.padding(3.dp)) {
        Text("I've been clicked $value times")
    }
}