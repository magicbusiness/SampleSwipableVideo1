package com.example.sampleswipablevideo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sampleswipablevideo.`object`.SampleObject
import com.example.sampleswipablevideo.adapter.SampleAdapter
import com.example.sampleswipablevideo.databinding.ActivityMainBinding
import com.example.sampleswipablevideo.modal.SheetsVideo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    //
    private lateinit var binding: ActivityMainBinding

    //
    private var listSheets: ArrayList<SheetsVideo> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        //
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //
        listSheets.addAll(SampleObject.dataList)

        //
        showVideo()
    }

    private fun showVideo()
    {
        viewPager.adapter = SampleAdapter(listSheets)
    }
}