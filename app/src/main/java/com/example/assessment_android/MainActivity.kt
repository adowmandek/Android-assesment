package com.example.assessment_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvPictures: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        DisplayPictures()

    }
    fun  DisplayPictures(){
        var PicturesList= listOf(
            Pictures("Person1","https://mk0hootsuiteblof6bud.kinstacdn.com/wp-content/uploads/2021/06/Instagram-captions-winter-caption.jpg"),
            Pictures("Person2","https://napoleoncat.com/wp-content/uploads/2019/11/Untitled-design-2-1.png "),
            Pictures("Person3"," https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/redheaded-girl-in-cloud-of-leaves-high-res-stock-photography-157494477-1537469696.jpg?crop=0.668xw:1.00xh;0.204xw,0&resize=480:*"),
            Pictures("Person4","https://mk0hootsuiteblof6bud.kinstacdn.com/wp-content/uploads/2021/06/Instagram-captions-spring-620x1049.png.webp "),
            Pictures("Person5"," https://www.prettywildworld.com/wp-content/uploads/2019/03/TOP-40-TRAVEL-CAPTIONS-FOR-INSTAGRAM-TO-INSPIRE-YOUR-FOLLOWERS-3.jpg.webp"),
            Pictures("Person6"," https://www.socialmediaexaminer.com/wp-content/uploads/2019/02/instagram-caption-business-example-3-400.png"),
            Pictures("Person6"," https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSEMRzxFiS0W2zyAxqId1Lz5PyP6hjyheKgUZl5pjOMlZO5NLw1npAFRHAAuv-r5IF8dS8&usqp=CAU"),

            )
        rvPictures=findViewById(R.id.rvPictures)
        var PicturesAdapter=PicturesAdapter(PicturesList,baseContext)
        rvPictures.adapter=PicturesAdapter
        rvPictures.layoutManager= LinearLayoutManager(baseContext)

    }
}

