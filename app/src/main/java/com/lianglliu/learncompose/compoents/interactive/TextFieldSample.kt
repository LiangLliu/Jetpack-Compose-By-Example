package com.lianglliu.learncompose.compoents.interactive


import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Password
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TextFieldSample() {
    Column() {

        var textField by remember { mutableStateOf("") }
        TextField(
            modifier = Modifier.padding(5.dp),
            value = textField,
            onValueChange = {
                textField = it
            },
            label = { Text("label TextField") },
            placeholder = {
                Text("placeholder : TextField 组件")
            },
            leadingIcon = {
                Icon(imageVector = Icons.Default.AccountBox, contentDescription = "头部icon")
            },
            trailingIcon = {
                Icon(imageVector = Icons.Default.Password, contentDescription = "尾部icon")
            },

            keyboardActions = KeyboardActions(
                onDone = {
                    Log.d("========", "按回车键")
                }
            ),
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Done,
                keyboardType = KeyboardType.Text
            ),
            singleLine = true
        )

        var outlinedTextField by remember { mutableStateOf("") }
        OutlinedTextField(
            modifier = Modifier.padding(5.dp),
            value = outlinedTextField,
            onValueChange = {
                outlinedTextField = it
            },
            label = { Text("label OutlinedTextField") },
            placeholder = {
                Text("placeholder : OutlinedTextField 组件")
            },
            leadingIcon = {
                Icon(imageVector = Icons.Default.AccountBox, contentDescription = "头部icon")
            },
            trailingIcon = {
                Icon(imageVector = Icons.Default.Password, contentDescription = "尾部icon")
            },

            keyboardActions = KeyboardActions(
                onDone = {
                    Log.d("========", "按回车键")
                }
            ),
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Done,
                keyboardType = KeyboardType.Text
            ),
            singleLine = true,
            isError = true
        )

        var name by remember { mutableStateOf("") }
        BasicTextField(
            modifier = Modifier.padding(5.dp),
            value = name,
            onValueChange = {
                name = it
            },
            singleLine = true
        )
    }
}


@Preview
@Composable
fun TextFieldSamplePreview() {
    TextFieldSample()
}

