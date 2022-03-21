package com.lianglliu.learncompose.compoents.base


import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ButtonSample() {
    Column() {
        Button(
            onClick = {
                Log.d("======", "点击了按钮")
            },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Yellow,
                contentColor = Color.Black
            ),
            modifier = Modifier.padding(2.dp)
        ) {
            Text("点击按钮")
        }

        TextButton(onClick = { /*TODO*/ }) {
            Text("这是 TextButton ， 一般是用来显示文字按钮的")
        }

        OutlinedButton(
            onClick = {
                Log.d("========", "OutlinedButton")
            },
        ) {
            Text(text = "这是 OutlinedButton")
        }

        IconButton(
            onClick = {
                Log.d("ButtonSample", "click the button")
            },
        ) {
            Icon(imageVector = Icons.Default.Star, contentDescription = null)
        }

    }
}

@Preview
@Composable
fun ButtonSamplePreview() {
    ButtonSample()
}

