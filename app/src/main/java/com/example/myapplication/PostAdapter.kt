package com.example.myapplication

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(var postList:MutableList<Post>, var postInt: PostInterface) : RecyclerView.Adapter<PostAdapter.PostHolder>() {

    class PostHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var img:ImageView = itemView.findViewById(R.id.img)
        var title:TextView = itemView.findViewById(R.id.title)
        var content:TextView = itemView.findViewById(R.id.content)
        var date:TextView = itemView.findViewById(R.id.date)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        return PostHolder(LayoutInflater.from(parent.context).inflate(R.layout.post_item, parent, false))
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun onBindViewHolder(holder: PostHolder, position: Int) {
        var item = postList[position]
        holder.img.setImageURI(Uri.parse(item.image))
        holder.title.text = item.title
        holder.content.text = item.content
        holder.date.text = item.updatedAt
        holder.itemView.setOnClickListener {
            postInt.onClick(item)
        }
    }

    interface PostInterface{
        fun onClick(post: Post)
    }
}