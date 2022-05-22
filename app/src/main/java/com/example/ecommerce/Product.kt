package com.example.ecommerce

import androidx.annotation.DrawableRes

data class Product(
    val productPrice: String,
    val productName: String,
    @DrawableRes val productImage: Int
)