package dev.pinky.myposts

data class Post (
    var userId : Int,
    var id : Int,
    var title:String,
    var body : String,
    var image :String
    )
data class  Comment (
    var PostId : Int,
    var id :Int,
    var name : String,
    var email : String,
    var body : String
    )