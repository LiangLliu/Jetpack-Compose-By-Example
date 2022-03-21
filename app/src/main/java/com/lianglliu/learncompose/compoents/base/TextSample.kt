package com.lianglliu.learncompose.compoents.base

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lianglliu.learncompose.R

@Composable
fun TextSample() {

    Column() {
        Text(text = "我终于要学会Jetpack compose 了")
        Text(text = stringResource(R.string.text))

        Text(
            text = "删除线",
            color = Color.Blue,
            fontSize = 20.sp,
            textDecoration = TextDecoration.LineThrough
        )

        Text(
            text = "组合样式",
            color = Color.Green,
            fontSize = 20.sp,
            textDecoration = TextDecoration.combine(
                listOf(TextDecoration.LineThrough, TextDecoration.Underline)
            )
        )

        SelectionContainer() { // select text
            Text(text = "我是可以被选择的文字")
        }

        ClickableText(text = buildAnnotatedString {
            append("可以被点击的文字")
            withStyle(
                style = SpanStyle(
                    color = Color.Red,
                    textDecoration = TextDecoration.Underline,
                    fontSize = 16.sp
                )
            ) {
                append("设置文字的样式")
            }
            append("文字结束了")
        }, onClick = {
            Log.d("============", "你点击到我了")
        })

        FindAnnotationWithText()

    }

}


@Composable
fun FindAnnotationWithText() {
    val annotationString = buildAnnotatedString {
        append("点击登录即代表你已悉知同意")

        pushStringAnnotation("protocol", "https://docs.bughub.icu/compos")
        withStyle(
            style = SpanStyle(
                color = Color.Blue,
                textDecoration = TextDecoration.Underline,
            )
        ) {
            append("用户须知")
        }
        pop()

        pushStringAnnotation("privacy", "https://github.com/lianglliu")
        append("和")
        withStyle(
            style = SpanStyle(
                color = Color.Blue,
                textDecoration = TextDecoration.Underline,
            )
        ) {
            append("隐私政策")
        }
        pop()
    }

    Text(modifier = Modifier.padding(top = 20.dp), text = "从字符串中查找注解")
    ClickableText(text = annotationString, onClick = { effset ->

        annotationString
            .getStringAnnotations("protocol", start = effset, end = effset)
            .firstOrNull()?.let { annotation ->
                Log.d("============", "你点击到了${annotation.item}")
            }

        annotationString
            .getStringAnnotations("privacy", start = effset, end = effset)
            .firstOrNull()?.let { annotation ->
                Log.d("============", "你点击到了${annotation.item}")
            }

    })
}

@Preview
@Composable
fun TextSamplePreview() {
    TextSample()
}