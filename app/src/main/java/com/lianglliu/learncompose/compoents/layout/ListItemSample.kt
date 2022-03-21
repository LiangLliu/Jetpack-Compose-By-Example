package com.lianglliu.learncompose.compoents.layout


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.ListItem
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BrokenImage
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


/*
https://docs.bughub.icu/compose/layout/ListItem/
    icon 设置左侧图标
    text 主文本
    secondaryText 副文本
    singleLineSecondaryText 副文本是否单行显示
    overlineText 显示在主文本上面的文本
    trailing 设置右侧内容，通常是Icon、CheckBox 或 Switch
 */
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ListItemSample() {
    val list = listOf(
        "Item 0", "item 1", "item 2",
        "Item 3", "item 4", "item 6",
        "Item 7", "item 9", "item 9",
        "Item 10", "item 11", "item 12",
        "Item 13", "item 14", "item 15",
    )

    val scrollableState = rememberScrollState()
    Column(modifier = Modifier.verticalScroll(scrollableState)) {
        list.forEach {
            ListItem(
                icon = {
                    Icon(
                        imageVector = Icons.Default.BrokenImage,
                        contentDescription = null,
                        modifier = Modifier.size(50.dp)
                    )
                },
                text = { Text(text = it) },
                secondaryText = {
                    Text("secondaryText")
                }, overlineText = {
                    Text("overlineText")
                }, trailing = {
                    Text("trailing")
                }
            )
        }
    }
}

@Preview
@Composable
fun ListItemSamplePreview() {
    ListItemSample()
}

