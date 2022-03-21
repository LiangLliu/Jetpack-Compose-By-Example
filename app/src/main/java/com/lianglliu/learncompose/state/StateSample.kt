package com.lianglliu.learncompose.state


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * @Link https://docs.bughub.icu/compose/State/
 */
@Composable
fun StateSample() {
    Column() {
        val count = remember { mutableStateOf(1) }

        Text(
            text = "Count: ${count.value} , 点击数量加一",
            modifier = Modifier
                .padding(10.dp)
                .clickable {
                    count.value = count.value + 1
                }
        )

        // by 语法
        var count1 by remember { mutableStateOf(1) }
        Text(
            text = "By语法，可以直接赋值  Count: $count1 , 点击数量加一",
            modifier = Modifier
                .padding(10.dp)
                .clickable {
                    count1++
                }
        )

        // by 语法
        val (count2, setCount2) = remember { mutableStateOf(1) }
        Text(
            text = "set用法，可以直接赋值  Count: $count2 , 点击数量加一",
            modifier = Modifier
                .padding(10.dp)
                .clickable {
                    setCount2(count2 + 1)
                }
        )
    }
}

@Preview
@Composable
fun StateSamplePreview() {
    StateSample()
}

