/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/

class Implementations {
    object Version {
        const val kotlin = "1.3.50"
        const val coroutines = "1.3.0-M1"
        const val okhttp = "3.14.2"
        const val retrofit = "2.6.0"
        const val moshi = "1.8.0"
        const val exoplayer = "2.10.1"
        const val koin = "2.0.1"
        const val glide = "4.8.0"
    }

    object Retrofit {
        val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
        val moshiConverter = "com.squareup.retrofit2:converter-moshi:${Version.retrofit}"
        val scalarConverter = "com.squareup.retrofit2:converter-scalars:${Version.retrofit}"
        val okHttp = "com.squareup.okhttp3:okhttp:${Version.okhttp}"
        val okHttpLogging = "com.squareup.okhttp3:logging-interceptor:${Version.okhttp}"
        val okHttpURLConnection = "com.squareup.okhttp3:okhttp-urlconnection:${Version.okhttp}"
    }

    object Moshi {
        val moshi = "com.squareup.moshi:moshi-kotlin:${Version.moshi}"
        val moshiKapt = "com.squareup.moshi:moshi-kotlin-codegen:${Version.moshi}"
    }

    object Coroutines {
        val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlin}"
        val coroutinesAndroid =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.coroutines}"
        val coroutinesVersion =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.coroutines}"
    }

    object Koin {
        val koin = "org.koin:koin-android:${Version.koin}"
        val koinViewModel = "org.koin:koin-androidx-viewmodel:${Version.koin}"
    }
    
    object Exoplayer{
        val exoplayer =  "com.google.android.exoplayer:exoplayer:${Version.exoplayer}"
        val exoplayerCore =  "com.google.android.exoplayer:exoplayer-core:${Version.exoplayer}"
        val exoplayerDash =  "com.google.android.exoplayer:exoplayer-dash:${Version.exoplayer}"
        val exoplayerUI =  "com.google.android.exoplayer:exoplayer-ui:${Version.exoplayer}"
    }

    object Glide {
        val glide = "com.github.bumptech.glide:glide:${Version.glide}"
        val compiler = "com.github.bumptech.glide:compiler:${Version.glide}"
    }
}