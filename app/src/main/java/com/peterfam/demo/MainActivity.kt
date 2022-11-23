package com.peterfam.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.peterfam.demo.ui.model.User
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn {
                itemsIndexed(
                    listOf(
                        User("Mohamed", "Salah", 29),
                        User("Leonel", " Messi", 35),
                        User("Christiano", "Ronaldo", 36)
                    )
                ){ index, user ->
                    Text(modifier = Modifier.fillMaxWidth().padding(vertical = 24.dp),

                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,
                        text = "${user.firstName} ${user.lastName} with age ${user.age}")
                }
            }
        }
    }
}





