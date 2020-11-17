package com.example.trycompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.ui.tooling.preview.Preview
import com.example.trycompose.ui.widgets.main.Main
import com.example.trycompose.ui.widgets.nav.NestedNavCompose

class MainActivity : AppCompatActivity() {
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<ComposeView>(R.id.composeView).setContent {
            Main {
                NestedNavCompose()
            }
        }
    }
}


