package com.example.inmunocalju.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.inmunocalju.R

@Composable
fun payment_metodo (navController: NavController){
    Box(contentAlignment = Alignment.TopCenter,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()))
    {
        Image(painter = painterResource(id = R.drawable.fondo_paymentmethod), contentDescription = "",contentScale = ContentScale.FillBounds, modifier = Modifier
            .width(400.dp)
            .height(200.dp))


        Column(
            modifier = Modifier.fillMaxWidth()
                .padding(15.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Icon(
                    imageVector = Icons.Default.ArrowBack, contentDescription = "",
                    tint = colorResource(id = R.color.neutral_200)
                )
                Text(
                    text = "Mis Pagos", style = MaterialTheme.typography.titleLarge,
                    color = colorResource(id = R.color.neutral_200)
                )
                TextButton(onClick = { System.out.println("PERRRROOOO") }) {
                    Text(
                        text = "Aceptar", style = MaterialTheme.typography.bodySmall,
                        color = colorResource(id = R.color.neutral_200)

                    )
                }
            }

            Image(painter = painterResource(id = R.drawable.cash_default), contentDescription = "", modifier = Modifier
                .width(400.dp)
                .height(200.dp))

            Image(painter = painterResource(id = R.drawable.selection_pay), contentDescription = "", modifier = Modifier.size(400.dp))

            Button(onClick = {  }, colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.primary_600)),
                shape = RoundedCornerShape(10.dp), modifier = Modifier.fillMaxWidth(). height(55.dp)) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "")
                Text(text = "Agregar metodo")
            }
        }

    }
}