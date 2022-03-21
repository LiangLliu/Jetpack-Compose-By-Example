package com.lianglliu.learncompose.compoents.interactive


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SwitchSample() {

    Column() {

        var switch1 by remember { mutableStateOf(false) }
        Switch(
            checked = switch1,
            onCheckedChange = {
                switch1 = !switch1
            },
            modifier =Modifier.padding(5.dp)
        )

        // 使用回参
        var switch2 by remember { mutableStateOf(false) }
        Switch(
            checked = switch2,
            onCheckedChange = {
                switch2 = it
            },
            modifier =Modifier.padding(5.dp)
        )
    }
}

@Preview
@Composable
fun SwitchSamplePreview() {
    SwitchSample()
}

