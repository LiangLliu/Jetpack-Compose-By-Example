package com.lianglliu.learncompose.compoents.interactive


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.RangeSlider
import androidx.compose.material.Slider
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
 * @Link https://docs.bughub.icu/compose/components/Slider/
 */
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SliderSample() {
    Column {
        var value by remember { mutableStateOf(0f) }
        Text(
            text = value.toString(),
            modifier = Modifier
                .padding(top = 20.dp)
                .padding(start = 20.dp)
        )
        Slider(
            modifier = Modifier.padding(horizontal = 10.dp),
            value = value,
            onValueChange = {
                value = it
            },
            valueRange = 0f..100f,
            steps = 10
        )

        var rangeSliderValue by remember { mutableStateOf(5f..10f) }
        Text(
            text = value.toString(),
            modifier = Modifier
                .padding(vertical = 20.dp)
                .padding(start = 20.dp)
        )
        RangeSlider(
            modifier = Modifier.padding(horizontal = 10.dp),
            values = rangeSliderValue,
            onValueChange = {
                rangeSliderValue = it
            },
            valueRange = 0f..30f,
            steps = 3
        )
    }
}

@Preview
@Composable
fun SliderSamplePreview() {
    SliderSample()
}

