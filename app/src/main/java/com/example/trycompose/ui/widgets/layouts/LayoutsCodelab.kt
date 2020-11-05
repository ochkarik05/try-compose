package com.example.trycompose.ui.widgets.layouts

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.ui.tooling.preview.Preview

@Composable
fun LayoutsCodelab() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Layout Codelab") },
                actions = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(Icons.Filled.Favorite)
                    }
                }
            )


        },

    )
    { innerPadding ->
        BodyContent(Modifier.padding(innerPadding))
    }
}

@Composable
fun BodyContent(modifier: Modifier) {
    Column(modifier) {
        Text("Hi there")
        Text("Thanks for going though the Layouts codelab")
    }
}

@Preview
@Composable
fun DefaultPreview() {

    LayoutsCodelab()
}

