package com.example.shoppinglist.ui.shoppinglist

import com.example.shoppinglist.Data.db.entities.ShoppingItem

interface AddDialogListner {
    fun onAddButtonClicked(Item :ShoppingItem)
}