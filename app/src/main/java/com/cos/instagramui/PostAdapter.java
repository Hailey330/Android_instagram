package com.cos.instagramui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.MyViewHolder> {

    private static final String TAG = "PostAdapter";
    private List<Post> posts = new ArrayList<>();

    public void addItem(Post post) {
        posts.add(post);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.post, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Post post = posts.get(position);
        holder.setItem(post);
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tvId;
        private TextView postId;
        private ImageView ivImgResource;
        private ImageView ivImgProfile;
        private TextView tvContent;
        private TextView tvTagContent;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvId = itemView.findViewById(R.id.tv_insta_id);
            postId = itemView.findViewById(R.id.tv_post_id);
            ivImgResource = itemView.findViewById(R.id.iv_post_img);
            ivImgProfile = itemView.findViewById(R.id.iv_post_profile);
            tvContent = itemView.findViewById(R.id.tv_content);
            tvTagContent = itemView.findViewById(R.id.tv_tag);
        }

        public void setItem(Post post) {
            tvId.setText(post.getId());
            postId.setText(post.getPostId());
            ivImgResource.setImageResource(post.getImageResource());
            ivImgProfile.setImageResource(post.getImageProfile());
            tvContent.setText(post.getContent());
            tvTagContent.setText(post.getTagContent());
        }

    }
}
