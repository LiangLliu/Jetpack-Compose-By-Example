package com.lianglliu.learncompose.compoents.base


import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lianglliu.learncompose.R

@Composable
fun IconSample() {

    Column() {

        //  官方图标库  https://fonts.google.com/icons
        Icon(
            imageVector = Icons.Default.AccountBox,
            contentDescription = null,
            modifier = Modifier
                .size(30.dp)
                .padding(2.dp)
        )

        // 使用 drawable 里面的图片
        Icon(
            painter = painterResource(id = R.drawable.ic_android_black_24dp),
            contentDescription = null,
            tint = Color.Blue,
            modifier = Modifier
                .size(40.dp)
                .padding(10.dp)
        )

        // 使用 ImageBitmap
        var bitmap: ImageBitmap? = null
        with(LocalContext.current){
            bitmap = ImageBitmap.imageResource(resources, R.drawable.android)
        }
        bitmap?.let { Icon(bitmap = it, contentDescription = null) }

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
fun IconSamplePreview() {
    IconSample()
}

