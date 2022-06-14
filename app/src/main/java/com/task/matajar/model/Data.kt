package com.task.matajar.model

data class Data(
    val arrayOtherImages: List<ArrayOtherImage>,
    val arrayProductDetail: List<ArrayProductDetail>,
    val arrayThumbnail: List<ArrayThumbnail>,
    val blnExpress: Boolean,
    val blnNormal: Boolean,
    val blnStockAvailability: Boolean,
    val fkBrandId: String,
    val intDeliveryTime: Int,
    val intDiscount: Int,
    val intMRP: Double,
    val intMaxQuantity: Int,
    val intMinQuantity: Int,
    val intMinimumAmount: Int,
    val intSellingPrice: Double,
    val objShop: ObjShop,
    val objSubCategory: ObjSubCategory,
    val pkProductId: String,
    val sortNum: Int,
    val strBrandName: String,
    val strDescription: String,
    val strDisclaimer: String,
    val strProductName: String
)