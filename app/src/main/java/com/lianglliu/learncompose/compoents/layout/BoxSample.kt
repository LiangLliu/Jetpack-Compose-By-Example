package com.lianglliu.learncompose.compoents.layout


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * 堆叠布局
 * @link https://docs.bughub.icu/compose/layout/Box/
 */
@Composable
fun BoxSample() {
    Box() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Cyan)
        )

        Box(
            modifier = Modifier
                .matchParentSize()
                .padding(top = 20.dp, bottom = 20.dp)
                .background(Color.Yellow)
        )

        Box(
            modifier = Modifier
                .matchParentSize()
                .padding(40.dp)
                .background(Color.Magenta)
        )

        Box(
            Modifier
                .align(Alignment.Center)
                .size(300.dp, 300.dp)
                .background(Color.Green)
        )
        Box(
            Modifier
                .align(Alignment.TopStart)
                .size(150.dp, 150.dp)
                .background(Color.Red)
        )
        Box(
            Modifier
                .align(Alignment.BottomEnd)
                .size(150.dp, 150.dp)
                .background(Color.Blue)
        )
    }
}

@Composable
fun BoxWithConstraintsSample() {
    BoxWithConstraints(modifier = Modifier.size(100.dp)) {
        if (maxHeight < maxWidth) {
            Box(Modifier.size(50.dp).background(Color.Blue))
        } else {
            Box(Modifier.size(50.dp).background(Color.Red))
        }
    }
}

@Preview
@Composable
fun BoxSamplePreview() {
    BoxSample()
}

