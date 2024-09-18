package com.example.lab03

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab03.ui.theme.Lab03Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab03Theme{
                TarjetaDePresentacion()
            }

        }
    }
}

@Composable
fun TarjetaDePresentacion() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFB2FF59)) // Verde claro (Light Green)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Imagen con contorno
        Box(
            modifier = Modifier
                .size(100.dp)
                .border(2.dp, Color.Black)
                .padding(4.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground), // Cambia este recurso por tu logotipo
                contentDescription = "Logo",
                modifier = Modifier.fillMaxSize()
            )
        }
        Spacer(modifier = Modifier.height(16.dp))

        // Nombre y Cargo
        Text(
            text = "Andre Boza",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Desarrollador Android",
            fontSize = 18.sp,
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(16.dp))

        // Información de contacto
        Column(horizontalAlignment = Alignment.Start) {
            Text("📧 gian.boza@tecsup.edu.pe", fontSize = 16.sp)
            Text("📞 +51 999999999", fontSize = 16.sp)
            Text("🏠 Hunter las gardenias", fontSize = 16.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTarjetaDePresentacion() {

    TarjetaDePresentacion()
}
