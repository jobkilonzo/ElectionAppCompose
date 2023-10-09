package com.example.election.common

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import com.example.election.R

enum class AuthRoutes(@StringRes val title: Int){
    Login(title = R.string.login)
}

enum class HomeRoutes(@StringRes val title: Int){
    Home(title = R.string.home)
}

@Composable
fun Navigation(
    //navControler: NavHostController
){

}