package com.example.inmunocalju.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.inmunocalju.R


@Composable
fun RegisterView (navController: NavController) {
    Box(contentAlignment = Alignment.TopCenter,
        modifier = Modifier.fillMaxSize())
    {
            Box () {
                Image(painter = painterResource(id = R.drawable.fondo_tercera_pantalla), contentDescription = "",contentScale = ContentScale.FillBounds, modifier = Modifier
                    .width(420.dp)
                    .height(200.dp)
                    .align(alignment = Alignment.TopStart)
                )

                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = null,
                    tint = colorResource(id = R.color.neutral_50),
                    modifier = Modifier.align(alignment = Alignment.TopStart)
                        .padding(start = 20.dp, top = 40.dp)

                )
            }

            Column (
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(15.dp)
                    .fillMaxHeight()) {



                Text(text = "Registrate", style = MaterialTheme.typography.titleLarge, fontSize = 30.sp, color = colorResource(
                    id = R.color.neutral_200
                ), modifier = Modifier
                    .align(Alignment.Start)
                    .padding(15.dp))

                Spacer(modifier = Modifier.height(70.dp))

                Text(text = "Nombre de usuario", style = MaterialTheme.typography.bodyMedium, modifier = Modifier.align(
                    Alignment.Start))

                Spacer(modifier = Modifier.height(5.dp))

                TextField( value = "", onValueChange = {},
                    placeholder = { Text(text = "usuario", style = MaterialTheme.typography.bodySmall) },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    modifier = Modifier
                        .background(Color.Transparent)
                        .fillMaxWidth()
                        .height(50.dp)
                        .clip(RoundedCornerShape(13.dp))
                )
                Spacer(modifier = Modifier.height(15.dp))

                Text(text = "Nombre completo", style = MaterialTheme.typography.bodyMedium)

                Spacer(modifier = Modifier.height(5.dp))

                TextField( value = "", onValueChange = {},
                    placeholder = { Text(text = "nombres", style = MaterialTheme.typography.bodySmall) },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    modifier = Modifier
                        .background(Color.Transparent)
                        .fillMaxWidth()
                        .height(50.dp)
                        .clip(RoundedCornerShape(13.dp))
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(text = "Ciudad", style = MaterialTheme.typography.bodyMedium)

                Spacer(modifier = Modifier.height(5.dp))

                TextField( value = "", onValueChange = {},
                    placeholder = { Text(text = "ciudad", style = MaterialTheme.typography.bodySmall) },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    modifier = Modifier
                        .background(Color.Transparent)
                        .fillMaxWidth()
                        .height(50.dp)
                        .clip(RoundedCornerShape(13.dp))
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(text = "Correo", style = MaterialTheme.typography.bodyMedium)

                Spacer(modifier = Modifier.height(5.dp))

                TextField( value = "", onValueChange = {},
                    placeholder = { Text(text = "example@example.com", style = MaterialTheme.typography.bodySmall) },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    modifier = Modifier
                        .background(Color.Transparent)
                        .fillMaxWidth()
                        .height(50.dp)
                        .clip(RoundedCornerShape(13.dp))
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(text = "Contraseña", style = MaterialTheme.typography.bodyMedium)

                Spacer(modifier = Modifier.height(5.dp))

                var pass by remember { mutableStateOf(true) }

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

                BtnRegistrarse()

                Row (modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                ) {
                    Text(text = "Tienes un cuenta?", style = MaterialTheme.typography.bodySmall, color = colorResource(
                        id = R.color.primary_600
                    )
                    )
                    Text(text = " Logueate!", style = MaterialTheme.typography.bodySmall, fontWeight = FontWeight.Bold, color = colorResource(
                        id = R.color.primary_600)
                    )
                }

            }
        }
    }


@Composable
fun BtnRegistrarse() {
    Column(
        modifier = Modifier.padding(15.dp),
    ) {
        Button(
            onClick = {

            }
            ,
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.primary_600)
            ),
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
fun PreviewComponente4() {
    val navController = rememberNavController()
    RegisterView(navController = navController)
}