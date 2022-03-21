package com.lianglliu.learncompose.compoents.layout


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CardSample() {

    Card(
        modifier = Modifier.padding(8.dp),
        backgroundColor = Color.Green,
        contentColor = Color.White,
        elevation = 10.dp,
        border = BorderStroke(5.dp, Color.Red),
    ) {
        Text(
            text = "Cart Content",
            modifier = Modifier.padding(8.dp),
            color = Color.Red,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview
@Composable
fun CardSamplePreview() {
    CardSample()
}

