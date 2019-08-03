package com.catnip.pixabayimage.utils

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

object Coroutines {

    fun main(job: suspend (() -> Unit)) =
        CoroutineScope(Dispatchers.Main).launch {
            job()
        }

    fun io(job: suspend (() -> Unit)) =
        CoroutineScope(Dispatchers.IO).launch {
            job()
        }

}