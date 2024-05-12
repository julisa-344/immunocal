package com.example.inmunocalju.views

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.navigation.NavController
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.inmunocalju.R


@Composable
fun LoginView (navController: NavController) {
    Box(contentAlignment = Alignment.TopCenter,
        modifier = Modifier
            .fillMaxSize()
    )
    {
        Box(modifier = Modifier)
        {
            Image(painter = painterResource(id = R.drawable.fondo_segunda_pantalla), contentDescription = "",contentScale = ContentScale.FillBounds, modifier = Modifier
                .size(400.dp))

            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = null,
                tint = colorResource(id = R.color.neutral_50),
                modifier = Modifier.align(alignment = Alignment.TopStart)
                    .padding(start = 20.dp, top = 40.dp)

            )

        }

        
        Column (horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
            .padding(25.dp)
            .fillMaxSize()
        )
        {
            Image(painter = painterResource(id = R.drawable.login_imagen), contentDescription = null, modifier = Modifier
                .width(480.dp)
                .height(270.dp)
                .padding(top = 40.dp))

            Text(text = "Inicia Sesion", style = MaterialTheme.typography.titleLarge, fontSize = 28.sp, color = colorResource(
                id = R.color.neutral_50
            ), modifier = Modifier
                .align(alignment = Alignment.Start)
                .padding(start = 50.dp, top = 20.dp, bottom = 50.dp))

            var pass by remember { mutableStateOf(true) }

            Column (modifier = Modifier) {
                Text(text = "correo", style = MaterialTheme.typography.bodyMedium)
                
                Spacer(modifier = Modifier.height(5.dp))
                
                Box(
                ) {
                TextField( value = "", onValueChange = {},
                    placeholder = { Text(text = "example@example.com", style = MaterialTheme.typography.bodySmall) },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    modifier = Modifier
                        .background(Color.Transparent)
                        .fillMaxWidth()
                        .height(50.dp)
                        .clip(RoundedCornerShape(13.dp))
                    )
                }
                Spacer(
                    modifier = Modifier
                        .size(15.dp)
                )

                Text(text = "contraseña", style = MaterialTheme.typography.bodyMedium)

                Spacer(modifier = Modifier.height(5.dp))

                Box(
                ) {
                    TextField( value = "", onValueChange = {},
                        placeholder = { Text(text = "tu contraseña", style = MaterialTheme.typography.bodySmall) },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        trailingIcon = {
                            Icon(
                                imageVector = Icons.Default.Lock,
                                contentDescription = null,
                                modifier = Modifier.padding(end = 15.dp)
                            )
                        },
                        visualTransformation = if (pass) PasswordVisualTransformation() else VisualTransformation.None,
                        modifier = Modifier
                            .background(Color.Transparent)
                            .fillMaxWidth()
                            .height(50.dp)
                            .clip(RoundedCornerShape(13.dp))
                    )
                }

                Text(
                    text = "Olvide mi contraseña!",
                    style = MaterialTheme.typography.bodySmall,
                    textAlign = TextAlign.End,
                    color = colorResource(id = R.color.primary_600),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(7.dp)
                )

                Spacer(
                    modifier = Modifier
                        .size(50.dp)
                )
            }

            BtnEntrar(navController)

            Row () {
                Text(text = "No tienes un cuenta?", style = MaterialTheme.typography.bodySmall, color = colorResource(
                    id = R.color.primary_600
                ))
                Text(text = " Registrarse!", style = MaterialTheme.typography.bodySmall, fontWeight = FontWeight.Bold, color = colorResource(
                    id = R.color.primary_600))
            }

        }
    }
}

@Composable
fun BtnEntrar(navController: NavController) {
    Column(
        modifier = Modifier.padding(15.dp),
    ) {
        Button(
            onClick = {
                navController.navigate("start")
            }
            ,
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.primary_600)),
                shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        )
        {
            Text("Entrar",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold)
        }
        Spacer(modifier = Modifier.height(15.dp))

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewComponente2() {
    val navController = rememberNavController()
    LoginView(navController = navController)
}