package com.xu.coroutines

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable

/**

@author xu

@create 2022-04-25 15:41

 */
data class User(
    var user_id: Int = 0,
    var account: String? = null,
    var password: String? = null,
    var name: String? = null,
    var sex: String? = null,
    var address: String? = null,
    var signature: String? = null,
    var office_info: String? = null,
    var fans: Int = 0,
    var attentions: Int = 0,
) : Serializable
