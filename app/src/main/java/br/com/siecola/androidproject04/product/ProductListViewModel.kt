package br.com.siecola.androidproject04.product

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.siecola.androidproject04.persistence.Product

private const val TAG = "ProductListViewModel"

class ProductListViewModel : ViewModel() {

    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>>
        get() = _products

    init {
        getProducts()
    }

    private fun getProducts() {

    }

    override fun onCleared() {
        super.onCleared()
    }
}