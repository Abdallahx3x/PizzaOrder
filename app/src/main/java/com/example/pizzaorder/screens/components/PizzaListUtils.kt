package com.example.pizzaorder.screens.components

import com.example.pizzaorder.R

class PizzaListUtils() {
    companion object {

        val imageList = listOf(
            R.drawable.bread_1, R.drawable.bread_2,
            R.drawable.bread_3, R.drawable.bread_4, R.drawable.bread_5
        )

        private val basilList = mutableListOf(
            R.drawable.basil_1, R.drawable.basil_2,
            R.drawable.basil_3, R.drawable.basil_4, R.drawable.basil_5,
            R.drawable.basil_6, R.drawable.basil_7, R.drawable.basil_8,
            R.drawable.basil_9, R.drawable.basil_10
        )

        private val broccoliList = mutableListOf(
            R.drawable.broccoli_1, R.drawable.broccoli_2,
            R.drawable.broccoli_3, R.drawable.broccoli_4, R.drawable.broccoli_5,
            R.drawable.broccoli_6, R.drawable.broccoli_7, R.drawable.broccoli_8,
            R.drawable.broccoli_9, R.drawable.broccoli_10
        )

        private val mushroomList = mutableListOf(
            R.drawable.mushroom_1, R.drawable.mushroom_2,
            R.drawable.mushroom_3, R.drawable.mushroom_4, R.drawable.mushroom_5,
            R.drawable.mushroom_6, R.drawable.mushroom_7, R.drawable.mushroom_8,
            R.drawable.mushroom_9, R.drawable.mushroom_10
        )

        private val onionList = mutableListOf(
            R.drawable.onion_2, R.drawable.onion_3,
            R.drawable.onion_4, R.drawable.onion_5, R.drawable.onion_6,
            R.drawable.onion_7, R.drawable.onion_8, R.drawable.onion_9,
            R.drawable.onion_10, R.drawable.onion_1
        )

        private val sausageList = mutableListOf(
            R.drawable.sausage_1, R.drawable.sausage_2,
            R.drawable.sausage_3, R.drawable.sausage_4, R.drawable.sausage_5,
            R.drawable.sausage_6, R.drawable.sausage_7, R.drawable.sausage_8,
            R.drawable.sausage_9, R.drawable.sausage_10
        )

         val lists = listOf(
            PizzaType(R.drawable.basil_3, basilList), PizzaType(
                R.drawable.broccoli_3, broccoliList
            ), PizzaType(
                R.drawable.onion_3, onionList
            ), PizzaType(
                R.drawable.sausage_1, sausageList
            ), PizzaType(
                R.drawable.mushroom_4, mushroomList
            )
        )
    }

}