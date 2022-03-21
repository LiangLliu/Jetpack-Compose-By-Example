package com.lianglliu.learncompose.compoents.layout


import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollBy
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.ListItem
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BrokenImage
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

/**
 * @link https://docs.bughub.icu/compose/layout/LazyColumn/
 * 滚动
 * state 管理列表的状态，可通过这个操作列表滚动
 *
 */
@Composable
fun LazyColumnSample() {
    LazyColumnScrollItem()
}

@OptIn(ExperimentalMaterialApi::class, androidx.compose.foundation.ExperimentalFoundationApi::class)
@Composable
fun LazyColumnScrollItem() {

    val dataList = listOf(
        "Item 0", "item 1", "item 2",
        "Item 3", "item 4", "item 6",
        "Item 7", "item 9", "item 9",
        "Item 10", "item 11", "item 12",
        "Item 13", "item 14", "item 15",
    )

    val lazyScrollState = rememberLazyListState()
    val currentScope = rememberCoroutineScope()

    LazyColumn(state = lazyScrollState) {
        stickyHeader {
            Text(
                text = "sticky Header",
                modifier = Modifier
                    .background(Color.Gray)
                    .fillMaxWidth()
                    .padding(10.dp)

            )
        }
        items(dataList) {
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
                }, modifier = Modifier.clickable {
                    currentScope.launch {
                        lazyScrollState.scrollBy(200f)
                    }
                }
            )
            Divider()
            DisposableEffect(Unit) {
                Log.d("==========", "effect: $it")
                onDispose {
                    Log.d("==========", "onDispose: $it")
                }
            }
        }
    }
}


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ColumnScrollItem() {
    val dataList = listOf(
        "Item 0", "item 1", "item 2",
        "Item 3", "item 4", "item 6",
        "Item 7", "item 9", "item 9",
        "Item 10", "item 11", "item 12",
        "Item 13", "item 14", "item 15",
    )

    val scrollState = rememberScrollState()
    val rememberScope = rememberCoroutineScope()

    Column() {
        Box(modifier = Modifier.weight(10f)) {
            Column(modifier = Modifier.verticalScroll(scrollState)) {
                dataList.forEach {
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

        Row(
            modifier = Modifier
                .weight(1f)
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(onClick = {
                rememberScope.launch {
                    scrollState.scrollTo(0)
                }
            }) {
                Text(text = "第一个")
            }

            Button(onClick = {
                rememberScope.launch {
                    scrollState.scrollBy(100f)
                }
            }) {
                Text(text = "下一页")
            }

            Button(onClick = {
                rememberScope.launch {
                    scrollState.scrollTo(scrollState.maxValue)
                }
            }) {
                Text(text = "最后一个")
            }
        }
    }
}

@Preview
@Composable
fun LazyColumnSamplePreview() {
    LazyColumnSample()
}

