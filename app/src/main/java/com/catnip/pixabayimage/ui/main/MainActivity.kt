package com.catnip.pixabayimage.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import androidx.lifecycle.Observer
import com.catnip.pixabayimage.R
import com.catnip.pixabayimage.utils.Coroutines
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val vm: MainViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fetch()
    }

    private fun fetch() = Coroutines.main {
        vm.feeds.await().observe(this, Observer {
            d("MainActivity",it.size.toString())
        })
    }
}
