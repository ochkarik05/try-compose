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
import com.example.trycompose.ui.widgets.greetings.Greeting

class MainActivity : AppCompatActivity() {
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<ComposeView>(R.id.composeView). setContent {
            TryComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting(name = "User")
                }
            }
        }
    }
}



@Composable
fun LifecycleDemo() {
    val count = remember { mutableStateOf(0) }

    Column {
        Button(onClick = {
            count.value++
        }) {
            Text("Click me")
        }

        if (count.value < 3 || count.value > 5) {
            onActive { Log.d("Compose", "onactive with value: " + count.value) }
            onDispose { Log.d("Compose", "onDispose because value=" + count.value) }
            Text("You have clicked the button: " + count.value.toString())
        }
    }
}

@ExperimentalMaterialApi
@Composable
fun BottomSheet(name: String) {
    BottomSheetScaffold(
            sheetContent = {
                Text(text = "Hello")
                Text(text = "Hello")
                Text(text = "Hello")
                Text(text = "Hello")
                Text(text = "Hello")
                Text(text = "Hello")
                Text(text = "Hello")
                Text(text = "Hello")
                Text(text = "Hello")
                Text(text = "Hello")
                Text(text = "Hello")
            },
            bodyContent = {
                Text(text = "!!!")
                Text(text = "!!!")
                Text(text = "!!!")
            },
            drawerContent = {
                Text(text = "Drawer")
            },
            drawerGesturesEnabled = true,
            sheetGesturesEnabled = true,
            sheetPeekHeight = 60.dp
    )
}

@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TryComposeTheme {
        Surface(color = MaterialTheme.colors.background) {
            LifecycleDemo()
        }
    }
}