package com.example.shoppinglist.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun getItemId(shopItem: Int): ShopItem{
       return shopListRepository.getItemId(shopItem)
    }
}