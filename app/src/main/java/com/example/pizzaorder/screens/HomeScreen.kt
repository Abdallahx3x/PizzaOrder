package com.example.pizzaorder.screens

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.size.Scale
import com.example.pizzaorder.R
import com.example.pizzaorder.screens.components.Pizza
import com.example.pizzaorder.screens.components.PizzaListUtils
import com.example.pizzaorder.screens.components.SpicesScreen
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun HomeScreen() {
    HomeContent( )
}


@SuppressLint("UnrememberedMutableState", "MutableCollectionMutableState")
@OptIn(ExperimentalPagerApi::class)
@Composable
fun HomeContent(

) {

    val pizzaTypes = PizzaListUtils.lists

    val breads = PizzaListUtils.imageList

    val state = rememberPagerState(0)
    var flag by remember {
        mutableStateOf(false)
    }


    var scaleOut by remember {
        mutableStateOf(4F)
    }


    var itemState by remember {
        mutableStateOf(0)
    }


    val itemStateInPager by rememberSaveable {
        mutableStateOf(
            listOf(
                Pizza(
                    mutableListOf(
                        mutableListOf(),
                        mutableListOf(),
                        mutableListOf(),
                        mutableListOf(),
                        mutableListOf()
                    ), 1f, mutableListOf(false, false, false, false, false),
                    mutableListOf(4f, 4f, 4f, 4f, 4f)
                ),
                Pizza(
                    mutableListOf(
                        mutableListOf(),
                        mutableListOf(),
                        mutableListOf(),
                        mutableListOf(),
                        mutableListOf()
                    ), 1f, mutableListOf(false, false, false, false, false),
                    mutableListOf(4f, 4f, 4f, 4f, 4f)
                ),
                Pizza(
                    mutableListOf(
                        mutableListOf(),
                        mutableListOf(),
                        mutableListOf(),
                        mutableListOf(),
                        mutableListOf()
                    ), 1f, mutableListOf(false, false, false, false, false),
                    mutableListOf(4f, 4f, 4f, 4f, 4f)
                ),
                Pizza(
                    mutableListOf(
                        mutableListOf(),
                        mutableListOf(),
                        mutableListOf(),
                        mutableListOf(),
                        mutableListOf()
                    ), 1f, mutableListOf(false, false, false, false, false),
                    mutableListOf(4f, 4f, 4f, 4f, 4f)
                ),
                Pizza(
                    mutableListOf(
                        mutableListOf(),
                        mutableListOf(),
                        mutableListOf(),
                        mutableListOf(),
                        mutableListOf()
                    ), 1f, mutableListOf(false, false, false, false, false),
                    mutableListOf(4f, 4f, 4f, 4f, 4f)
                )
            )
        )
    }


    var sizeOfPizza by remember {
        mutableStateOf(itemStateInPager[state.currentPage].size)
    }


    val scale by animateFloatAsState(
        targetValue =
        sizeOfPizza
    )

    var sizes by remember {
        mutableStateOf(mutableListOf(4f, 4f, 4f, 4f, 4f))
    }


    Column(
        Modifier
            .fillMaxSize()
            .systemBarsPadding()
            .background(Color.White)
    ) {

        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {

            Box(
                modifier = Modifier
                    .padding(start = 16.dp, top = 16.dp)
                    .clip(CircleShape)
                    .background(Color.White)
            ) {
                Icon(
                    painterResource(id = R.drawable.arrow_back_fill0_wght400_grad0_opsz24),
                    contentDescription = "null", modifier = Modifier
                        .size(48.dp)
                        .padding(horizontal = 8.dp)
                )
            }
            Text(
                text = "Pizza", textAlign = TextAlign.Center, modifier = Modifier
                    .padding(top = 16.dp)
                    .align(
                        Alignment.CenterVertically
                    ),
                fontSize = 24.sp, color = Color.Black, fontFamily = FontFamily.Monospace
            )

            Box(
                modifier = Modifier
                    .padding(end = 16.dp, top = 16.dp)
                    .clip(CircleShape)
                    .background(Color.White)
            ) {
                Icon(
                    painterResource(id = R.drawable.heart),
                    contentDescription = "null", modifier = Modifier
                        .size(48.dp)
                        .padding(horizontal = 8.dp)
                )
            }
        }
        Box(Modifier.fillMaxWidth()) {
            Image(
                painter =
                painterResource(R.drawable.plate),
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 14.dp)
                    .fillMaxWidth()
                    .size(260.dp)
            )

            HorizontalPager(
                state = state,
                modifier = Modifier
                    .height(280.dp)
                    .fillMaxWidth(),
                contentPadding = PaddingValues(horizontal = 16.dp),
                count = 5,
            ) { page ->


                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(breads[page])
                        .crossfade(true)
                        .scale(Scale.FILL)
                        .build(),
                    contentDescription = null,
                    modifier = Modifier
                        .size(180.dp)
                        .scale(scale)
                        .align(Alignment.Center)
                )

                for (i in 0..4) {
                    key(currentPage) {
                        SpicesScreen(
                            flag,
                            itemStateInPager[state.currentPage].sizes[i],
                            itemStateInPager[page].list[i]
                        )

                    }


                }


            }

        }

        var offsetX by remember { mutableStateOf(172.dp) }
        val offsetAnimation by animateDpAsState(targetValue = offsetX, tween(300))

        Text(
            text = "$17", color = Color.Black,
            fontSize = 24.sp, textAlign = TextAlign.Center,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 16.dp),
        )
        Box(
            Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, top = 24.dp)
        ) {

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color.White),
                modifier = Modifier
                    .size(50.dp)
                    .offset(offsetAnimation)
                    .shadow(elevation = 10.dp, shape = CircleShape)
                    .clip(CircleShape)

            ) {
                Text(text = "", fontSize = 16.sp, color = Color.Black)
            }



            Button(
                onClick = {
                    sizeOfPizza = 0.8f
                    offsetX = 244.dp
                },
                colors = ButtonDefaults.buttonColors(Color(0xFFFFFF)),
                modifier = Modifier
                    .size(50.dp)
                    .offset(x = 240.dp)
                    .clip(CircleShape)

            ) {
                Text(text = "S", fontSize = 16.sp, color = Color.Black)
            }
            Button(
                onClick = {
                    sizeOfPizza = 1.1f
                    offsetX = 172.dp
                },
                colors = ButtonDefaults.buttonColors(Color(0xFFFFFF)),
                modifier = Modifier
                    .padding(horizontal = 4.dp)
                    .size(50.dp)
                    .offset(x = 162.dp)
                    .clip(CircleShape)

            ) {
                Text(text = "M", fontSize = 16.sp, color = Color.Black)
            }
            Button(
                onClick = {
                    sizeOfPizza = 1.3f
                    offsetX = 96.dp
                },
                colors = ButtonDefaults.buttonColors(Color(0xFFFFFF)),
                modifier = Modifier
                    .size(50.dp)
                    .offset(x = 94.dp)
                    .clip(CircleShape)
            ) {
                Text(text = "L", fontSize = 16.sp, color = Color.Black)
            }
        }

        Text(
            text = "CUSTOMIZE YOUR PIZZA", color = Color.Black.copy(alpha = 0.6f),
            fontSize = 14.sp, textAlign = TextAlign.Center, modifier = Modifier
                .padding(start = 32.dp, top = 48.dp)
        )


        val boxColor by remember { mutableStateOf(Pair(Color.White, Color(0x5E66D397))) }

        LazyRow(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {

            items(pizzaTypes) { item ->
                val index = pizzaTypes.indexOf(item)

                var isClicked by remember { mutableStateOf(false) }


                Log.i("rerfdgf", state.toString())

                var test by remember {
                    mutableStateOf(false)
                }
                key(flag) {
                    test = itemStateInPager[state.currentPage].isSelected[index]
                }




                Box(modifier = Modifier
                    .padding(horizontal = 8.dp, vertical = 32.dp)
                    .clip(CircleShape)
                    .background(if (itemStateInPager[state.currentPage].isSelected[index]) boxColor.first else boxColor.second)
                    .clickable {
                        itemState = index
                        isClicked = !isClicked
                        scaleOut = if (flag) 4f else 1f
                        sizes[index] = if (sizes[index] == 4f) 1f else 4f
                        itemStateInPager[state.currentPage].sizes[index] =
                            if (itemStateInPager[state.currentPage].sizes[index] == 4f) 1f else 4f
                        itemStateInPager[state.currentPage].isSelected[index] =
                            !itemStateInPager[state.currentPage].isSelected[index]
                        flag = !flag
                        itemStateInPager[state.currentPage].list[index] = item.list

                    }
                ) {

                    Image(
                        painterResource(id = item.imageType),
                        contentDescription = "null", modifier = Modifier
                            .size(55.dp)
                            .padding(8.dp)
                    )

                }

            }

        }



        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color(0xFF2B0C0C)),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 42.dp)
                .size(height = 45.dp, width = 170.dp),
            shape = RoundedCornerShape(16.dp),

            ) {
            Image(
                painter = painterResource(id = R.drawable.shopping), contentDescription = null,
                modifier = Modifier.padding(end = 18.dp)
            )
            Text(text = "Add to cart")
        }


    }


}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomePreview() {
    HomeContent()
}

