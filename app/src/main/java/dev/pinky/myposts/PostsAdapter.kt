package dev.pinky.myposts

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.pinky.myposts.databinding.PostListItemBinding

class PostsAdapter (var postsList: List<Post> ):
    RecyclerView.Adapter<PostViewHolder> ()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        var binding =
            PostListItemBinding.inflate(LayoutInflater.from(parent.context), parent , false)
        return PostViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        var currentPost = postsList.get(position)
        holder.binding.tvUserId.text = currentPost.userId.toString()
        holder.binding.tvId.text = currentPost.id.toString()
        holder.binding.tvTitle.text = currentPost.title
        holder.binding.tvbody.text = currentPost.body

        val context = holder.itemView.context
        holder.binding.cvPosts.setOnClickListener {
            val intent = Intent(context,CommentsActivity::class.java)
            intent.putExtra("POST_ID",currentPost.id)
            context.startActivity(intent)
        }
        holder.binding




    }

    override fun getItemCount(): Int {
        return  postsList .size
    }


}
class PostViewHolder(var binding :PostListItemBinding):  // reference to individual items in the cards
    RecyclerView.ViewHolder(binding.root){

    }