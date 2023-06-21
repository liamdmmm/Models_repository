package com.example.moivesbox.Modlse.Register


import com.google.gson.annotations.SerializedName

data class Respons_Users(
    @SerializedName("created_at")
    var createdAt: String, // 2020-10-10 12:12:23
    @SerializedName("email")
    var email: String, // abbas@oveissi.ir
    @SerializedName("id")
    var id: Int, // 23
    @SerializedName("name")
    var name: String, // Abbas Ov
    @SerializedName("updated_at")
    var updatedAt: String,// 2020-10-10 12:12:23
    @SerializedName("password")
    var password: String = ""
)