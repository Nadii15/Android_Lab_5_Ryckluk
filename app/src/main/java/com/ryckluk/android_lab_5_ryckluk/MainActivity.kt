package com.ryckluk.android_lab_5_ryckluk

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    MainScreen()
                }
            }


        }
    }
}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleBlock()
        ColorRow()
        CombinedBlock()
    }
}
@Composable
fun TitleBlock() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Пример Compose приложения",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Row, Column, Size, ARGB",
            fontSize = 20.sp,
            color = Color(0xFF666666)
        )
    }
}

@Composable
fun ColorRow() {
    Row(
        modifier = Modifier.height(80.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        ColorBox(color = Color(0xFFFF0000))
        ColorBox(color = Color(0xFF00FF00))
        ColorBox(color = Color(0x800000FF))
    }
}

@Composable
fun ColorBox(color: Color) {
    Box(
        modifier = Modifier
            .size(60.dp)
            .background(color)
    )
}

@Composable
fun CombinedBlock() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color(0xFFF5F5F5))
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(start = 16.dp, bottom = 8.dp)
        ) {
            Text(text = "Левая колонка", fontSize = 14.sp, color = Color(0xFF333333))
            Text(text = "Текст 1", fontSize = 12.sp, color = Color(0xFF666666))
        }

        Column (
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(end = 16.dp, bottom = 8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(text = "Правая колонка", fontSize = 14.sp, color = Color(0xFF333333))
            Text(text = "Текст 2", fontSize = 12.sp, color = Color(0xFF666666))
        }
    }
}

//Сама лабораторная
//setContent {
//    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = { Text(text = "Scaffold example") }
//            )
//        },
//        floatingActionButton = {
//            FloatingActionButton(onClick = {}) {
//                Text(text = "+")
//            }
//        }
//    ) { paddingValues ->
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(paddingValues),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Text(text = "Основное содержимое экрана")
//        }
//    }
//}


//setContent {
//    Column(modifier = Modifier
//        .fillMaxSize()
//        .background(color = Color.White)
//        .padding(top = 16.dp),
//        verticalArrangement = Arrangement.SpaceEvenly,
//        horizontalAlignment = Alignment.CenterHorizontally
//    )
//    {
//        Box(
//            modifier = Modifier
//                .size(100.dp)
//                .background(Color(0xFFF0000))
//        )
//        Box(
//            modifier = Modifier
//                .size(100.dp)
//                .background(Color(0x80FF0000))
//        )
//    }
//}


//setContent {
//    val symbols ="Hello world".filter{it.isLetter()}
//    Column(modifier = Modifier
//        .fillMaxSize()
//        .background(color = Color.Green)
//        .padding(top = 8.dp),
//        verticalArrangement = Arrangement.SpaceEvenly,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceEvenly
//        ){
//            for(char in symbols)
//                Text(
//                    text = char.toString(),
//                    fontWeight = FontWeight.ExtraBold,
//                    color = Color.Blue,
//                    fontSize = 20.sp,
//                    letterSpacing = 24.sp
//                )
//        }
//        Spacer(modifier = Modifier.height(16.dp))
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceEvenly
//        ){
//            for(char in symbols.reversed())
//                Text(
//                    text = char.toString(),
//                    fontWeight = FontWeight.ExtraBold,
//                    color = Color.Red,
//                    fontSize = 20.sp,
//                    letterSpacing = 24.sp
//                )
//        }
//
//    }
//}
