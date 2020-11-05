package com.example.trycompose.ui.widgets.photographer

import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.preferredSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.trycompose.ui.utils.TryComposeTheme

@Composable
fun PhotographerCard(modifier: Modifier) {
    Row(
        modifier
            .padding(8.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(MaterialTheme.colors.surface)
            .clickable(onClick = {})
            .padding(16.dp)

    ) {
        Surface(
            modifier = Modifier.preferredSize(50.dp),
            shape = CircleShape,
            color = MaterialTheme.colors.onSurface.copy(alpha = 0.2f)
        ) {

        }

        Column(modifier = Modifier.padding(start = 8.dp).align(Alignment.CenterVertically)) {
            Text("Alfred Sisley", fontWeight = FontWeight.Bold)
            ProvideEmphasis(emphasis = AmbientEmphasisLevels.current.medium) {
                Text("3 minutes ago", style = MaterialTheme.typography.body2)
            }
        }
        Button(onClick = {}) {
            Column {
                Text("Hello")
                Text("there")
            }
        }
    }

}


@Preview
@Composable
fun DefaultPreview() {
    TryComposeTheme {
        PhotographerCard(Modifier)
    }
}