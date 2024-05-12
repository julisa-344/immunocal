package com.example.ep2.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

//@Preview
@Composable
fun NotificacionesView(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            verticalArrangement = Arrangement.Top
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .background(Color.Cyan),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                ) {
                    Column(
                        modifier = Modifier
                            .width(15.dp)
                    ) {
                    }
                    Button(
                        onClick = {
                                  navController.navigate("miCuenta")
                        },
                        modifier = Modifier
                            .size(50.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Gray.copy(alpha = 0.5f)),
                        shape = CircleShape,
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowLeft,
                            contentDescription = null,
                            modifier = Modifier
                        )
                    }
                    Text(
                        "Notificaciones",
                        modifier = Modifier
                            .padding(10.dp),
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                }

            }

            Spacer(modifier = Modifier
                .height(60.dp)
            )

            Box(modifier = Modifier
                .fillMaxSize(),
                contentAlignment = Alignment.TopCenter
            ){
                Column(modifier = Modifier
                    .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .background(Color.Gray.copy(alpha = 0.1f)),
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Column(
                            modifier = Modifier
                                .width(15.dp)
                        ) {
                        }
                        Button(
                            onClick = {
                                navController.navigate("payment1")
                            },
                            modifier = Modifier
                                .size(50.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Gray.copy(alpha = 0.5f)),
                            shape = CircleShape,
                            contentPadding = PaddingValues(0.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Done,
                                contentDescription = null,
                                modifier = Modifier
                                    .size(32.dp),
                                tint = Color.Green
                            )
                        }
                        Column(
                            modifier = Modifier
                                .width(15.dp)
                        ) {
                        }
                        Column(){
                            Text("System",
                                fontWeight = FontWeight.Bold)
                            Text("Su compra #123456 ha sido procesada")
                        }

                    }

                    Spacer(modifier = Modifier
                        .height(5.dp)
                    )

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .background(Color.Gray.copy(alpha = 0.1f)),
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Column(
                            modifier = Modifier
                                .width(15.dp)
                        ) {
                        }
                        Button(
                            onClick = {},
                            modifier = Modifier
                                .size(50.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Gray.copy(alpha = 0.5f)),
                            shape = CircleShape,
                            contentPadding = PaddingValues(0.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Email,
                                contentDescription = null,
                                modifier = Modifier
                                    .size(32.dp),
                                tint = Color.Gray
                            )
                        }
                        Column(
                            modifier = Modifier
                                .width(15.dp)
                        ) {
                        }
                        Column(){
                            Text("Message",
                                fontWeight = FontWeight.Bold)
                            Text("Has recibido un nuevo mensaje")
                        }

                    }

                    Spacer(modifier = Modifier
                        .height(5.dp)
                    )

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .background(Color.Gray.copy(alpha = 0.1f)),
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Column(
                            modifier = Modifier
                                .width(15.dp)
                        ) {
                        }
                        Button(
                            onClick = {},
                            modifier = Modifier
                                .size(50.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Gray.copy(alpha = 0.5f)),
                            shape = CircleShape,
                            contentPadding = PaddingValues(0.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = null,
                                modifier = Modifier
                                    .size(32.dp),
                                tint = Color.Cyan.copy(alpha = 0.4f)
                            )
                        }
                        Column(
                            modifier = Modifier
                                .width(15.dp)
                        ) {
                        }
                        Column(){
                            Text("Promotion",
                                fontWeight = FontWeight.Bold)
                            Text("Ha recibido un ticket de descuento")
                        }

                    }

                    Spacer(modifier = Modifier
                        .height(5.dp)
                    )

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .background(Color.Gray.copy(alpha = 0.1f)),
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Column(
                            modifier = Modifier
                                .width(15.dp)
                        ) {
                        }
                        Button(
                            onClick = {},
                            modifier = Modifier
                                .size(50.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Gray.copy(alpha = 0.5f)),
                            shape = CircleShape,
                            contentPadding = PaddingValues(0.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Close,
                                contentDescription = null,
                                modifier = Modifier
                                    .size(32.dp),
                                tint = Color.Red
                            )
                        }
                        Column(
                            modifier = Modifier
                                .width(15.dp)
                        ) {
                        }
                        Column(){
                            Text("System",
                                fontWeight = FontWeight.Bold)
                            Text("Su compra #123457 ha sido denegada")
                        }
                    }
                }
            }
        }
    }
}