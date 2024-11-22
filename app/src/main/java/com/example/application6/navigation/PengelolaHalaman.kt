package com.example.application6.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.application6.model.Mahasiswa
import com.example.application6.ui.screen.DetailView
import com.example.application6.ui.screen.MahasiswaFormView
import com.example.application6.ui.screen.RencanaStudyView
import com.example.application6.ui.screen.SplashView
import com.example.application6.ui.viewmodel.MahasiswaViewModel
import com.example.application6.ui.viewmodel.RencanaStudyViewModel

enum class Halaman {
    Splash,
    Mahasiswa,
    Matakuliah,
    Tampil
}
@Composable
fun MahasiswaApp(
    modifier: Modifier = Modifier,
    mahasiswaViewModel: MahasiswaViewModel = viewModel(),
    krsViewModel: RencanaStudyViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
){
    val mahasiswaUiState = mahasiswaViewModel.mahasiswaUiState.collectAsState().value
    NavHost(
        navController = navController,
        startDestination = Halaman.Splash.name,
        modifier = Modifier.padding()
    ) {
        composable(route = Halaman.Splash.name) {
            SplashView(onMulaiBotton =  {
                navController.navigate(
                    Halaman.Mahasiswa.name
                )
            })
        }
    }
}