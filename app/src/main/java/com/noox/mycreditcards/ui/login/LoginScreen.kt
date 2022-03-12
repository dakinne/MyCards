package com.noox.mycreditcards.ui.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.noox.mycreditcards.ui.component.AppPasswordField
import com.noox.mycreditcards.ui.theme.Gray600
import com.noox.mycreditcards.ui.component.AppTextField
import com.noox.mycreditcards.ui.component.AppTitle
import com.noox.mycreditcards.ui.navigation.Screen

@Composable
fun LoginScreen(navController: NavHostController) {

    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(state = scrollState)
    ) {

        AppTitle(modifier = Modifier.weight(1f))

        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colors.background)
        ) {
            LoginForm()
            Signup(navController)
        }
    }
}

@Composable
private fun LoginForm() {

    val usernameValue = remember { mutableStateOf("") }
    val passwordValue = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(32.dp)
    ) {
        AppTextField(
            text = "Username",
            textValue = usernameValue
        )
        Spacer(modifier = Modifier.padding(8.dp))
        AppPasswordField(
            text = "Password",
            textValue = passwordValue
        )
        Spacer(modifier = Modifier.padding(16.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
        ) {
            Text(
                text = "Log in"
            )
        }
    }
}

@Composable
private fun Signup(navController: NavHostController) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = "Don't have an account?",
            style = MaterialTheme
                .typography.body1,
            color = Gray600,
            modifier = Modifier
                .padding(ButtonDefaults.TextButtonContentPadding)
        )
        TextButton(
            onClick = { navController.navigate(Screen.Signup.route) },
            contentPadding = ButtonDefaults.TextButtonContentPadding,
        ) {
            Text(
                text = "Sign up",
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.primary
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LoginScreen(NavHostController(LocalContext.current))
}
