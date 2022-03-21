package com.lianglliu.learncompose.compoents.base

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ModifierSample() {
    //    https://docs.bughub.icu/compose/ModifiersList/
    Column() {
        Text(
            text = "modifier属性调用具有顺序, 先padding",
            modifier = Modifier
                .padding(8.dp)
                .background(Color.Yellow)
        )

        Text(
            text = "modifier属性调用具有顺序, 后padding",
            modifier = Modifier
                .background(Color.Yellow)
                .padding(8.dp)
        )

        Text(
            text = "clickable 点击",
            modifier = Modifier
                .background(Color.Green)
                .padding(8.dp)
                .clickable {
                    Log.d("==========", "你点击到我了")
                }
        )
    }


}

@Preview
@Composable
fun ModifierSamplePreview() {
    ModifierSample()
}

