package com.ramotion.navigationtoolbar.example.simple

import android.view.LayoutInflater
import android.view.ViewGroup
import com.ramotion.navigationtoolbar.HeaderLayout

class HeaderAdapter(private val mContent: Array<Int>,
                    private val mCount: Int) : HeaderLayout.Adapter<HeaderItem>() {

    override fun getItemCount() = mCount

    override fun onCreateViewHolder(parent: ViewGroup): HeaderItem {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.header_item, parent, false)
        return HeaderItem(view)
    }

    override fun onBindViewHolder(holder: HeaderItem, position: Int) {
        holder.setContent(mContent[position % mContent.size])
    }

    override fun onViewRecycled(holder: HeaderItem) {
        holder.clearContent()
    }
}