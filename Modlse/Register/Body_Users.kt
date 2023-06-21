package com.example.moivesbox.Modlse.Register

import com.google.gson.annotations.SerializedName

data class Body_Users(
    @SerializedName("name")
    var name: String="",
    @SerializedName("email")
    var email: String="",
    @SerializedName("password")
    var password: String=""
)
