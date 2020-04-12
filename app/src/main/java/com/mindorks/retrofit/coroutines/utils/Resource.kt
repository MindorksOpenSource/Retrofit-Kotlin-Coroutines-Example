package com.mindorks.retrofit.coroutines.utils

import com.mindorks.retrofit.coroutines.utils.Status.ERROR
import com.mindorks.retrofit.coroutines.utils.Status.LOADING
import com.mindorks.retrofit.coroutines.utils.Status.SUCCESS


data class Resource<out T>(val status: Status, val data: T?, val message: String?) {
    companion object {
        fun <T> success(data: T): Resource<T> = Resource(status = SUCCESS, data = data, message = null)

        fun <T> error(data: T?, message: String): Resource<T> =
            Resource(status = ERROR, data = data, message = message)

        fun <T> loading(data: T?): Resource<T> = Resource(status = LOADING, data = data, message = null)
    }
}