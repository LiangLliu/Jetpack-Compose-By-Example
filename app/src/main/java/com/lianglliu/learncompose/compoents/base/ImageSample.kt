package com.lianglliu.learncompose.compoents.base


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lianglliu.learncompose.R

@Composable
fun ImageSample() {
    Image(
        painter = painterResource(id = R.drawable.android),
        contentDescription = null,
        contentScale = ContentScale.Inside,
        modifier = Modifier.size(200.dp),
        colorFilter = ColorFilter.tint(Color.Gray, blendMode = BlendMode.Color)
    )
}

@Preview
@Composable
fun ImageSamplePreview() {
    ImageSample()
}

