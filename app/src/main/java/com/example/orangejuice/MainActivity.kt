package com.example.orangejuice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.orangejuice.ui.theme.OrangeJuiceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OrangeJuiceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MakingOrangeJuiceAndImage()
                }
            }
        }
    }
}

@Composable
fun MakingOrangeJuiceAndImage(modifier: Modifier = Modifier
    .fillMaxSize()
    .wrapContentSize(Alignment.Center)){

    var result by remember { mutableStateOf(1) }

    var sum = 0

    var imageResource = when(result){

        1 -> R.drawable.orange_tree
        2 -> R.drawable.orange_fruit
        3 -> R.drawable.orange_drink_full
        else -> R.drawable.orange_drink_empty
    }
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            if(sum==1)(when(sum){
                1->R.drawable.orange_tree
            }
            if (result >=5 && result <=10){
                R.drawable.orange_fruit
            }


        }) {

        }


        Image(painter = painterResource(id = imageResource), contentDescription = "OrangeTree")
        Spacer(modifier = Modifier.height(80.dp))
        Box {
            Button(onClick = {

            }) {

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MakingOrangeJuice(){
        MakingOrangeJuiceAndImage()
}
