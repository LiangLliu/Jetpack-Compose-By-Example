package com.lianglliu.learncompose.compoents.other


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DividerSample() {
    Column(
        modifier = Modifier
            .padding(10.dp)
            .background(Color.White),
    ) {
        Text(
            text = "First ", modifier = Modifier
                .background(Color.Red)
        )

        Divider(modifier = Modifier.padding(10.dp))

        Text(
            "Second", modifier = Modifier
                .background(Color.Green)
        )

        Divider(
            modifier = Modifier.padding(10.dp),
            color = Color.Blue
        )

        Divider(
            modifier = Modifier.padding(10.dp),
            color = Color.Yellow,
            thickness = 4.dp
        )

    }
}

@Preview
@Composable
fun DividerSamplePreview() {
    DividerSample()
}

