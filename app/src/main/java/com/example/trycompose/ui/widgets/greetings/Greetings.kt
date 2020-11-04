package com.example.trycompose.ui.widgets.greetings

import androidx.compose.foundation.Text
import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview


@Composable
fun Greeting(name: String) {
    Text(text = "Hello, $name")
}

@Preview
@Composable
fun GreetingsPreview(){
    Greeting(name = "User")
}