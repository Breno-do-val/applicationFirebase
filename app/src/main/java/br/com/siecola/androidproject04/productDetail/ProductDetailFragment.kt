package br.com.siecola.androidproject04.productDetail

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.siecola.androidproject04.databinding.FragmentProductDetailBinding

private const val TAG = "ProductDetailFragment"
class ProductDetailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i(TAG, "Creating ProductDetailFragment")

        val binding = FragmentProductDetailBinding.inflate(inflater)

        binding.setLifecycleOwner(this)

        //Fetch the product code and create the ViewModel here
        return binding.root
    }
}