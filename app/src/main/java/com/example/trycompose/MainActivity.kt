package com.example.trycompose

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.trycompose.ui.utils.TryComposeTheme
import com.example.trycompose.ui.widgets.content.ScreenContent
import com.example.trycompose.ui.widgets.greetings.Greeting
import com.example.trycompose.ui.widgets.layouts.LayoutsCodelab
import com.example.trycompose.ui.widgets.main.Main

class MainActivity : AppCompatActivity() {
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<ComposeView>(R.id.composeView).setContent {
            Main {
                LayoutsCodelab()
            }
        }
    }
}


@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Main {
        LayoutsCodelab()
    }
}