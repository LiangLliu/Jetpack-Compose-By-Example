package com.lianglliu.learncompose.compoents.other


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * 空白
 */
@Composable
fun SpacerSample() {
    Column(modifier = Modifier.background(Color.White)) {
        Row(modifier = Modifier.size(100.dp)) {
            Text("First", modifier = Modifier.background(Color.Red))

            Spacer(modifier = Modifier.weight(1f))

            Text("Second", modifier = Modifier.background(Color.Green))
        }

        Divider()

        Text("Column Item 0", modifier = Modifier.background(Color.Red))

        Spacer(modifier = Modifier.weight(1f))

        Text("Column Item 1", modifier = Modifier.background(Color.Green))
    }
}

@Preview
@Composable
fun SpacerSamplePreview() {
    SpacerSample()
}

