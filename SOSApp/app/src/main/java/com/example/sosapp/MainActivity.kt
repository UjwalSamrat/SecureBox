package com.example.sosapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.sosapp.ui.theme.SOSAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SOSAppTheme {
                SOSApp()
            }
        }
    }
}

@Composable
fun SOSApp() {
    val context = LocalContext.current

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = androidx.compose.ui.Alignment.Center) {
            Button(
                onClick = {
                    Toast.makeText(context, "SOS Sent!", Toast.LENGTH_SHORT).show()
                    // TODO: Here you can add your real SOS sending logic (location, SMS, etc.)
                },
                modifier = Modifier.padding(16.dp)
            ) {
                Text(text = "Send SOS")
            }
        }
    }
}



