package com.noox.mycreditcards

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.noox.mycreditcards.ui.login.LoginScreen
import com.noox.mycreditcards.ui.login.SignupScreen
import com.noox.mycreditcards.ui.navigation.Screen
import com.noox.mycreditcards.ui.theme.MyCreditCardsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCreditCardsTheme {
                Navigation()
            }
        }
    }
}

@Composable
fun Navigation() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Login.route) {

        composable(Screen.Login.route) {
            LoginScreen(navController = navController)
        }

        composable(Screen.Signup.route) {
            SignupScreen(navController = navController)
        }
    }
}