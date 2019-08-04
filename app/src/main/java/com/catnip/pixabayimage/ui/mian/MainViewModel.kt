package com.catnip.pixabayimage.ui.mian

import androidx.lifecycle.ViewModel
import com.catnip.pixabayimage.data.repository.FeedsRepository
import com.catnip.pixabayimage.utils.lazyDeferred

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/
class MainViewModel(repository: FeedsRepository) : ViewModel(){
    val feeds by lazyDeferred {
        repository.getFeeds()
    }
}