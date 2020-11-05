package com.example.trycompose.ui.widgets.main

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.example.trycompose.ui.utils.TryComposeTheme

@Composable
fun Main(content: @Composable () -> Unit){
   TryComposeTheme {

      Surface(color = MaterialTheme.colors.background) {
        content()
      }
       
   } 
}