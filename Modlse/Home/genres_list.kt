package com.example.moivesbox.Modlse.Home


import com.google.gson.annotations.SerializedName

class genres_list : ArrayList<genres_list.genres_lisItem>(){
    data class genres_lisItem(
        @SerializedName("id")
        var id: Int, // 1
        @SerializedName("name")
        var name: String // Crime
    )
}