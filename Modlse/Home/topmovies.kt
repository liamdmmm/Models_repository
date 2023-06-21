package com.example.moivesbox.Modlse.Home


import com.google.gson.annotations.SerializedName

data class topmovies(
    @SerializedName("page")
    var page: Int, // 1
    @SerializedName("results")
    var results: List<Result>,
    @SerializedName("total_pages")
    var totalPages: Int, // 526
    @SerializedName("total_results")
    var totalResults: Int // 10512
) {
    data class Result(
        @SerializedName("adult")
        var adult: Boolean, // false
        @SerializedName("backdrop_path")
        var backdropPath: String, // /rl7Jw8PjhSIjArOlDNv0JQPL1ZV.jpg
        @SerializedName("genre_ids")
        var genreIds: List<Int>,
        @SerializedName("id")
        var id: Int, // 851644
        @SerializedName("original_language")
        var originalLanguage: String, // ko
        @SerializedName("original_title")
        var originalTitle: String, // 20 Century Girl
        @SerializedName("overview")
        var overview: String, // Yeon-du asks her best friend Bora to collect all the information she can about Baek Hyun-jin while she is away in the U.S. for heart surgery. Bora decides to get close to Baek's best friend, Pung Woon-ho first. However, Bora's clumsy plan unfolds in an unexpected direction. In 1999, a year before the new century, Bora, who turns seventeen, falls into the fever of first love.
        @SerializedName("popularity")
        var popularity: Double, // 348.878
        @SerializedName("poster_path")
        var posterPath: String, // /od22ftNnyag0TTxcnJhlsu3aLoU.jpg
        @SerializedName("release_date")
        var releaseDate: String, // 2022-10-06
        @SerializedName("title")
        var title: String, // 20th Century Girl
        @SerializedName("video")
        var video: Boolean, // false
        @SerializedName("vote_average")
        var voteAverage: Double, // 8.8
        @SerializedName("vote_count")
        var voteCount: Int // 242
    )
}