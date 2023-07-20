package com.example.pizzaorder.screens.components

data class Pizza(
    var list: MutableList<MutableList<Int>>,
    var size: Float,
    var isSelected: MutableList<Boolean>,
    var sizes: MutableList<Float>
)
