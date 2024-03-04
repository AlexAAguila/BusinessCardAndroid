package com.example.buisnesscard

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.buisnesscard.ui.theme.BuisnesscardTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BuisnesscardTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Composable
fun CardName(name: String, title: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.alexaguilar2)

    Column (modifier = modifier) {
        Image(painter = image, contentDescription = "image of Alex")


        Text(
            text = name,
            fontSize = 36.sp
        )
        Text(
            text = title,
            fontSize = 15.sp

        )
    }
}
@Composable
fun CardImage(message: String, modifier: Modifier = Modifier){

    Box {
        CardName(name = "Alex Aguilar", title = "Full Stack Developer")
    }
}

@Preview(name = "Business Card Preview", showSystemUi = true)
@Composable
fun GreetingPreview() {
    BuisnesscardTheme {
        CardImage("Alex Aguilar")
    }
}