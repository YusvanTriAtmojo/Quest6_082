package com.example.application6.ui.screen


import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
}
