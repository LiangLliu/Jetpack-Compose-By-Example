package com.lianglliu.learncompose.compoents.layout


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.lazy.items

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LazyVerticalGridSample() {
    val datas = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    LazyVerticalGrid(cells = GridCells.Fixed(3)) {
        items(datas) {
            Text("Grid Item $it")
        }
    }
}

@Preview
@Composable
fun LazyVerticalGridSamplePreview() {
    LazyVerticalGridSample()
}

