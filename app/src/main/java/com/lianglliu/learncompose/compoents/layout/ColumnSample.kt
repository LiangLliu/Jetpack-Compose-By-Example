package com.lianglliu.learncompose.compoents.layout


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * 列布局
 * https://docs.bughub.icu/compose/layout/Column/
 */
@Composable
fun ColumnSample() {
    Column(
        modifier = Modifier
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "First ", modifier = Modifier
                .height(100.dp)
                .background(Color.Red)
                .weight(1f)
        )

        Text(
            "Second", modifier = Modifier
                .height(100.dp)
                .background(Color.Green)
                .weight(1f)
        )

        Text(
            "Third", modifier = Modifier
                .height(100.dp)
                .background(Color.Cyan)
                .weight(1f)
        )
    }
}

@Preview
@Composable
fun ColumnSamplePreview() {
    ColumnSample()
}

