package com.example.inmunocalju.views

import android.graphics.drawable.shapes.Shape
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.inmunocalju.R
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
@Composable
fun testimonios(navController: NavController) {
    Box(contentAlignment = Alignment.TopCenter,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()))
    {
        Column (modifier = Modifier.fillMaxWidth()
        ){
            Row (modifier = Modifier
                .height(50.dp)
                .fillMaxWidth()
                .background(colorResource(id = R.color.primary_600)),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "",
                    tint = colorResource(id = R.color.neutral_200)
                )
                Text(text = "Healthy Store", style = MaterialTheme.typography.titleMedium,
                    color = colorResource(id = R.color.neutral_200))
                TextButton(onClick = { }) {
                    Text(text = "Ingresar", style = MaterialTheme.typography.bodySmall,
                        color = colorResource(id = R.color.neutral_200)

                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Column (modifier = Modifier.padding(15.dp)) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Column {
                        Text(
                            text = "Testimonios y calificación",
                            style = MaterialTheme.typography.titleLarge
                        )
                        Text(
                            text = "(4.5 estrellas)",
                            style = MaterialTheme.typography.bodySmall
                        )
                    }

                    Spacer(modifier = Modifier.width(10.dp))

                    IconButton(onClick = { /* TODO: Implementar visualización de testimonios */ }, modifier = Modifier
                        .width(25.dp)) {
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "Testimonios")
                    }
                }

                Spacer(modifier = Modifier.height(40.dp))


                Text(text = "Ana Maria", style = MaterialTheme.typography.bodyLarge, fontWeight = FontWeight.Bold)

                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "¡Estoy encantada con los productos! Son súper prácticos para llevar" +
                        " a cualquier lugar y realmente me ayudan a mantener mi sistema inmunológico en buen estado. Desde" +
                        " que los incorporé a mi rutina diaria, he notado que me enfermo menos. ¡Totalmente recomendados!\"")

                Spacer(modifier = Modifier.height(40.dp))

                // Escribir una reseña
                OutlinedButton(
                    onClick = { /* TODO: Implementar escritura de reseña */ },
                    shape = RoundedCornerShape(4.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),


                    ) {
                    Text("Escribir una reseña", style = MaterialTheme.typography.titleMedium, color = colorResource(
                        id = R.color.neutral_500
                    ))
                }
            }



        }
    }
}