package com.lianglliu.learncompose.compoents.interactive

/**
 * 进度条
 * @link https://docs.bughub.icu/compose/components/ProgressIndicator
 */
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProgressIndicatorSample() {
    Column() {
        // 圆形进度条
        CircularProgressIndicator(
            modifier = Modifier.padding(20.dp),
            color = Color.Red,
            strokeWidth = 5.dp
        )

        CircularProgressIndicator(
            modifier = Modifier.padding(20.dp),
            progress = 0.5f // 进度条
        )

        // 横向进度条
        LinearProgressIndicator(
            modifier = Modifier.padding(20.dp),
            color = Color.Red,
            backgroundColor = Color.Green
        )

        LinearProgressIndicator(
            modifier = Modifier.padding(20.dp),
            progress = 0.5f
        )
    }
}

@Preview
@Composable
fun ProgressIndicatorSamplePreview() {
    ProgressIndicatorSample()
}

