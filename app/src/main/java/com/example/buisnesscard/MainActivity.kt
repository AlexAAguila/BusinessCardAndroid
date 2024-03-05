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
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone

import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.vector.ImageVector

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
Box(modifier = Modifier.padding(top = 16.dp)) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Image(painter = image, contentDescription = "image of Alex")


        Text(
            text = name,
            fontSize = 36.sp,
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(
            text = title,
            fontSize = 15.sp

        )
    }
}
}

@Composable
fun CardContactItem(icon: ImageVector, text: String){
Row(modifier = Modifier.padding(16.dp)) {
   Icon(imageVector = icon, contentDescription = null)
    
    Text(
        text = text,
        fontSize = 20.sp,
        modifier = Modifier.padding(start = 16.dp)
    )
}
}

@Composable
fun CardContact(phone: String, socialMedia: String, email: String,modifier: Modifier = Modifier) {

    Box(modifier = Modifier.padding(top = 16.dp)) {
        Column(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
          CardContactItem(icon = Icons.Default.Phone, text = phone)
            Divider()
            CardContactItem(icon = Icons.Default.AccountCircle, text = socialMedia)
            Divider()
            CardContactItem(icon = Icons.Default.Email, text = email)

        }
    }
}



@Preview(name = "Business Card Preview", showSystemUi = true)
@Composable
fun GreetingPreview() {
    BuisnesscardTheme {
        CardName(name = "Alex Aguilar", title = "Full Stack Developer")
        CardContact(phone = "604-123-4685", socialMedia = "Github: @AlexAAguila", email = "aaguilar5@my.bcit.ca")
    }
}