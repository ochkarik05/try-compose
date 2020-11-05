package com.example.trycompose.ui.widgets.greetings

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview


@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello, $name",
        modifier = Modifier.padding(24.dp),
        style = MaterialTheme.typography.h1.copy(color = Color.Red)
    )
}

@Preview
@Composable
fun GreetingsPreview() {
    Greeting(name = "User")
}