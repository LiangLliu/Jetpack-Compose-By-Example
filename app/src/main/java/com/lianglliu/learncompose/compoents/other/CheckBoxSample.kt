package com.lianglliu.learncompose.compoents.other


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CheckBoxSample() {

    Column() {

        Text(text = "一个单选框", modifier = Modifier.padding(start = 5.dp))
        Row(
            modifier = Modifier.padding(horizontal = 5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            var checked by remember { mutableStateOf(false) }

            Checkbox(checked = checked, onCheckedChange = { checked = !checked })
            Text(text = "点击单选框", modifier = Modifier.padding(start = 5.dp))
        }

        Text(text = "多个选框，进行单选", modifier = Modifier.padding(5.dp))
        var selectItems by remember {
            mutableStateOf(
                listOf(
                    SelectItem("Select 1", false),
                    SelectItem("Select 2", true),
                    SelectItem("Select 3", false)
                )
            )
        }
        LazyColumn() {
            items(selectItems.size) { i ->
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(
                        checked = selectItems[i].selected,
                        onCheckedChange = {
                            selectItems = selectItems.mapIndexed { j, item ->
                                if (i == j) {
                                    SelectItem(item.text, !item.selected)
                                } else {
                                    SelectItem(item.text, item.selected)
                                }
                            }
                        }
                    )
                    Text(text = selectItems[i].text, modifier = Modifier.padding(start = 1.dp))
                }
            }
        }
    }
}

@Preview
@Composable
fun CheckBoxSamplePreview() {
    CheckBoxSample()
}

