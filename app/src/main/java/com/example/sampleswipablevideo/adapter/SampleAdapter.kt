package com.example.sampleswipablevideo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleswipablevideo.R
import com.example.sampleswipablevideo.modal.SheetsVideo

class SampleAdapter(private val dataSheets: ArrayList<SheetsVideo>): RecyclerView.Adapter<SampleAdapter.SampleHolder>()
{
    inner class SampleHolder(view: View): RecyclerView.ViewHolder(view)
    {
        var titleSample: TextView = view.findViewById(R.id.sample_title)
        var descSample: TextView = view.findViewById(R.id.sample_description)
        var videoSample: VideoView = view.findViewById(R.id.sample_video)

        //
        var loadSample: ProgressBar = view.findViewById(R.id.sample_load)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleHolder
    {
        val layoutInflater = LayoutInflater.from(parent.context)
        val inflaterView = layoutInflater.inflate(R.layout.item_video, parent, false)

        return SampleHolder(inflaterView)
    }

    override fun onBindViewHolder(holder: SampleHolder, position: Int)
    {
        val data = dataSheets[position]

        holder.titleSample.text = data.title
        holder.descSample.text = data.desc

        // =====================================================================================
        //
        holder.videoSample.setVideoPath(data.videoUrl)
        holder.videoSample.setOnPreparedListener {
            holder.loadSample.visibility = View.GONE
            it.start()

            //
            val videoRatio = it.videoWidth / it.videoHeight.toFloat()
            val screenRatio = holder.videoSample.width / holder.videoSample.height.toFloat()

            //
            val scaleRatio = videoRatio / screenRatio

            //
            if (scaleRatio > 1f)
            {
                holder.videoSample.scaleX = scaleRatio
            }

            else
            {
                holder.videoSample.scaleY = (1f / scaleRatio)
            }
        }

        //
        holder.videoSample.setOnCompletionListener {
            it.start()
        }
        // =====================================================================================
    }

    override fun getItemCount(): Int
    {
        return dataSheets.size
    }


}