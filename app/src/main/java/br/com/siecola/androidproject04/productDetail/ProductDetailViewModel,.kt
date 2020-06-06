package br.com.siecola.androidproject04.productDetail

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.siecola.androidproject04.persistence.Product
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

private const val TAG = "ProductDetailViewModel"

class ProductDetailViewModel(private val code: String): ViewModel() {

    private val _product = MutableLiveData<Product>()
    val product: LiveData<Product>
        get() = _product

    init {
        getProduct()
    }

    private fun getProduct() {
        Log.i(TAG, "Preparing to request a product by its code")

        Log.i(TAG, "Product requested by code")
    }

    override fun onCleared() {
        super.onCleared()
    }

}