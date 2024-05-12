package com.example.inmunocalju.views

import android.content.res.Configuration
import androidx.compose.animation.core.EaseInCirc
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.colorspace.WhitePoint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Wallpapers
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.inmunocalju.R

@Composable
fun HomeView (navController: NavController) {
    Box(contentAlignment = Alignment.TopCenter,
        modifier = Modifier.fillMaxSize())
    {
        Image(painter = painterResource(id = R.drawable.fondo_segunda_pantalla), contentDescription = "",contentScale = ContentScale.FillBounds, modifier = Modifier
            .size(400.dp))


        Column (horizontalAlignment = Alignment.CenterHorizontally)
        {
            Image(painter = painterResource(id = R.drawable.logo_principal), contentDescription = null, modifier = Modifier
                .width(300.dp)
                .height(190.dp)
                .padding(top = 40.dp))
            Image(painter = painterResource(id = R.drawable.home1), contentDescription = null, modifier = Modifier
                .width(320.dp)
                .height(250.dp))

            Spacer(modifier = Modifier.height(25.dp))

            BtnEntrarRegistrar(navController)

            Spacer(modifier = Modifier.height(20.dp))

            Text(text = "o Inicia Sesion con", style = TextStyle(fontSize = 13.sp))

            Spacer(modifier = Modifier.height(20.dp))

            BtnLoginRedes()

        }
    }
}

@Composable
fun BtnEntrarRegistrar(navController: NavController) {
    Column(
        modifier = Modifier.padding(15.dp),
    ) {
        Button(
            onClick = {
                navController.navigate("login")
            },
            modifier = Modifier
                .fillMaxWidth()
                .defaultMinSize()
                .clip(RoundedCornerShape(10.dp))
                .background(colorResource(id = R.color.primary_600))
                ,
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color.White,
            )
        ) {

            Text("Entrar", style = TextStyle(fontSize = 18.sp)
            )
        }
        Spacer(modifier = Modifier.height(15.dp))
        Button(
            onClick = {
                navController.navigate("register")
            },
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp))
                .background(Color.Transparent)
                .border(
                    BorderStroke(2.dp, colorResource(id = R.color.primary_600)),
                    RoundedCornerShape(10.dp)
                ),
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = colorResource(id = R.color.primary_600)
            )
        ) {
            Text("Registrarte", style = TextStyle(fontSize = 18.sp)
            )
        }
    }
}

@Composable
fun BtnLoginRedes() {
    Column(
        modifier = Modifier.padding(15.dp),
    ) {
        Button(
            onClick = { /* Handle entrar button click */ },
            modifier = Modifier
                .defaultMinSize()
                .clip(RoundedCornerShape(10.dp))
                .background(Color.White)
                .border(
                    BorderStroke(2.dp, colorResource(id = R.color.neutral_400)),
                    RoundedCornerShape(10.dp)
                )
                .fillMaxWidth()
                .height(42.dp)
                ,
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color.Gray,
            )
        ) {
            Box() {
                Image(painterResource(id = R.drawable.google), contentDescription = null, modifier = Modifier
                    .align(Alignment.TopStart)
                    .size(20.dp)
                )
            }
            Text(text = "Google", style = MaterialTheme.typography.titleSmall)

        }
        Spacer(modifier = Modifier.height(15.dp))
        Button(
            onClick = { /* Handle registrarse button click */ },
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp))
                .background(colorResource(id = R.color.facebook))
                .height(42.dp),
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color.White
            )
        ) {
            Image(painterResource(id = R.drawable.facebook), contentDescription = null, modifier = Modifier
                .size(20.dp))

            Text(text = "Facebook", style = MaterialTheme.typography.titleSmall)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewComponente() {
    val navController = rememberNavController()
    HomeView(navController = navController)
}