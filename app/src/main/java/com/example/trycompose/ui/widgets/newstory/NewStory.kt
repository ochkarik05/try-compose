package com.example.trycompose.ui.widgets.newstory

import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.trycompose.R

@Composable
fun NewStory() {
    val image = imageResource(id = R.drawable.header)
    
    Column(modifier = Modifier.padding(16.dp)) {
        val imageModifier = Modifier
            .preferredHeight(180.dp)
            .fillMaxWidth()

        Image(image, modifier = imageModifier, contentScale = ContentScale.Crop)
        Spacer(modifier = Modifier.preferredHeight(16.dp))
        Text("A day in Shark Fin Cove")
        Text("Davenport, California")
        Text("December 2018")
    }
}

@Preview
@Composable
fun DefaultPreview() {
    NewStory()
}

