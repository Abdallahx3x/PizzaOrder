package com.example.pizzaorder.screens.components

import android.annotation.SuppressLint
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.random.Random


@Composable
fun SpicesScreen(state: Boolean, ss: Float, ll: MutableList<Int>) {


    val scale by animateFloatAsState(
        targetValue =
        ss, tween(400)
    )




    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(if (ss == 4f) 0.dp else 270.dp)
            .scale(scale)

    ) {
        val random = Random.Default
        var y = random.nextInt(130) + 50
        var x = random.nextInt(100) + 115
        //val c=create

        for (i in ll) {
            Image(
                painter = painterResource(id = i),
                contentDescription = null,
                modifier = Modifier
                    .size(30.dp)
                    .offset(y = y.dp, x = x.dp)
            )
            y = random.nextInt(130) + 50
            x = random.nextInt(100) + 115
        }
    }
}


@SuppressLint("UnrememberedMutableState")
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun spicesPreview() {
    SpicesScreen(true, 1F, mutableListOf())
}
