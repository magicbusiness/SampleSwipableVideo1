package com.example.sampleswipablevideo.`object`

import com.example.sampleswipablevideo.modal.SheetsVideo

object SampleObject
{
    private val sample_title = arrayOf(
        "Tree with flowers",
        "Multicolored lights",
        "Holding neon light",
        "Sun over hills"
    )

    private val sample_description = arrayOf(
        "The branches of a tree wave in the breeze, with pointy leaves",
        "A man with a small beard and mustache wearing a white sweater, sunglasses, and a backwards black baseball cap turns his head in different directions under changing colored lights",
        "Bald man with a short beard wearing a large jean jacket holds a long tubular neon light thatch",
        "The sun sets or rises over hills, a body of water beneath them"
    )

    private val sample_video_url = arrayOf(
        "https://assets.mixkit.co/videos/preview/mixkit-tree-with-yellow-flowers-1173-large.mp4",
        "https://assets.mixkit.co/videos/preview/mixkit-man-under-multicolored-lights-1237-large.mp4",
        "https://assets.mixkit.co/videos/preview/mixkit-man-holding-neon-light-1238-large.mp4",
        "https://assets.mixkit.co/videos/preview/mixkit-sun-over-hills-1183-large.mp4"
    )

    //
    val dataList: ArrayList<SheetsVideo>get() {
        val listData = arrayListOf<SheetsVideo>()

        for (position in sample_title.indices)
        {
            //
            val data = SheetsVideo()

            data.title = sample_title[position]
            data.desc = sample_description[position]
            data.videoUrl = sample_video_url[position]

            //
            listData.add(data)
        }

        return listData
    }
}