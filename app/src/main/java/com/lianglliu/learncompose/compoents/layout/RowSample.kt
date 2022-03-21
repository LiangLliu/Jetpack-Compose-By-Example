package com.lianglliu.learncompose.compoents.layout


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RowSample() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("First", modifier = Modifier
            .padding(5.dp)
            .background(Color.Red.copy(0.5f)))

        Text("Second", modifier = Modifier
            .padding(5.dp)
            .background(Color.Green.copy(0.5f)))
    }
}

@Preview
@Composable
fun RowSamplePreview() {
    RowSample()
}

