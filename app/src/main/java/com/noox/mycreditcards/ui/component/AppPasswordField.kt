package com.noox.mycreditcards.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation

import com.noox.mycreditcards.R

@Composable
fun AppPasswordField(text: String, textValue: MutableState<String>) {
    val passwordVisible = remember { mutableStateOf(false) }
    OutlinedTextField(
        value = textValue.value,
        onValueChange = { textValue.value = it },
        trailingIcon = {
            IconButton(onClick = { passwordVisible.value = !passwordVisible.value }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_remove_red_eye_24),
                    tint = if (passwordVisible.value) MaterialTheme.colors.primary else Color.Gray,
                    contentDescription = ""
                )
            }
        },
        label = {
            Text(
                text = text,
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onBackground
            )
        },
        singleLine = true,
        visualTransformation = if (passwordVisible.value) VisualTransformation.None else PasswordVisualTransformation(),
        modifier = Modifier.fillMaxWidth()
    )
}
