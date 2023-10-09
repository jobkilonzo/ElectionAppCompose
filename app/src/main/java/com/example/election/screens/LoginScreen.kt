package com.example.election.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LoginScreen(){
    Text(text = "Login")

}

@Preview(showSystemUi = true)
@Composable
fun LoginScreenPreview(){
    LoginScreen()
}