package com.example.shoppinglist.Data.Repo

import androidx.lifecycle.LiveData
import com.example.shoppinglist.Data.db.ShoppingDatabase
import com.example.shoppinglist.Data.db.entities.ShoppingItem

class ShoppingRepository(
    private val db :ShoppingDatabase
) {
    suspend fun upsert(Item :ShoppingItem)= db.getShoppingDao().upsert(Item)
    suspend fun delete(Item: ShoppingItem) = db.getShoppingDao().delete(Item)


    fun getAllShoppingItems(Item: ShoppingItem) {
        db.getShoppingDao().getAllShoppingItems()
    }
}