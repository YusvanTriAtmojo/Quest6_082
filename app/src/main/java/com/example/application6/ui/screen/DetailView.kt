package com.example.application6.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.application6.R
import com.example.application6.model.Mahasiswa
import com.example.application6.model.RencanaStudy

@Composable
fun DetailView(
    modifier: Modifier = Modifier,
    uiStateDetailMahasiswa: Mahasiswa,
    uiStateDetailMatakuliah: RencanaStudy,
    onClickButton: () -> Unit) {
    val listDetail = listOf(
        Pair("NIM", uiStateDetailMahasiswa.nim),
        Pair("Nama", uiStateDetailMahasiswa.nama),
        Pair("Email", uiStateDetailMahasiswa.email),
        Pair("Matakuliah", uiStateDetailMatakuliah.mataKuliah),
        Pair("Kelas", uiStateDetailMatakuliah.kelas),
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.primary)),
        horizontalAlignment = Alignment.CenterHorizontally, ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(25.dp)
            ,verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(
                    id = R.drawable.umy
                ),
                contentDescription = "",
                modifier = Modifier.size(45.dp)
            )
            Spacer(modifier = Modifier.padding(start = 16.dp))
            Column {
                Text(
                    text = "Detail KRS Mahasiswa",
                    color = Color.Red,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
        Box(
            modifier = Modifier
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(
                        topEnd = 15.dp,
                        topStart = 15.dp
                    )
                )
                .fillMaxSize(),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                listDetail.forEach { items ->
                    CardSection(
                        judulParam = items.first,
                        isiParam = items.second
                    )
                }
                Spacer(modifier = Modifier.padding(16.dp))
                Button (onClick = { onClickButton() })
                {
                    Text("Back")
                }
            }
        }
    }
}

@Composable
fun CardSection(judulParam: String, isiParam: String) {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = judulParam, modifier = Modifier.weight(0.8f))
            Text(text = ":", modifier = Modifier.weight(0.2f))
            Text(
                text = "$isiParam",
                modifier = Modifier.weight(2f)
            )
        }
    }
}

