package com.jhoto_dev.tracker_flix

import android.graphics.Color
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.jhoto_dev.tracker_flix.ui.theme.Tracker_flixTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            Tracker_flixTheme {
                AdvertisingView()
            }
        }
    }
}


@Composable
fun AdvertisingImages(modifier: Modifier) {
    val horizontalPagerState = rememberPagerState(pageCount = { 2 })
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(color = _root_ide_package_.androidx.compose.ui.graphics.Color(Color.LTGRAY))
    ) {
        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            TextButton(
                onClick = {}
            ) {
                Text("Example")

            }

        }
        HorizontalPager(state = horizontalPagerState) {


        }

    }

}

@Composable
fun ButtonsNextAndBack(modifier: Modifier) {
    Row(
        modifier = modifier
            .background(color = _root_ide_package_.androidx.compose.ui.graphics.Color(Color.WHITE))
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        OutlinedButton(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
                .weight(1f),
            onClick = {},
        ) {
            Text("Example")

        }
        Spacer(Modifier
            .fillMaxWidth()
            .weight(1f))
        OutlinedButton(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
                .weight(1f),
            onClick = {},
        ) {
            Text("Example")

        }
    }

}

@Composable
fun AdvertisingView() {
    val currentItem = remember { mutableIntStateOf(0) }

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(color = _root_ide_package_.androidx.compose.ui.graphics.Color(Color.BLACK))
    ) { innerPadding ->
        val topPadding = innerPadding.calculateTopPadding()
        val bottomPadding = innerPadding.calculateBottomPadding()
        Column(modifier = Modifier.padding(innerPadding)) {
            AdvertisingImages(Modifier.weight(0.9f))
            ButtonsNextAndBack(Modifier)

        }

    }

}