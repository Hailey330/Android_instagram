package com.cos.instagramui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.MyViewHolder> {

    private static final String TAG = "StoryAdapter";
    private List<Story> stories = new ArrayList<>();

    public void addItem(Story story) {
        stories.add(story);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.story, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Story story = stories.get(position);
        holder.setItem(story);
    }

    @Override
    public int getItemCount() {
        return stories.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tvStoryId;
        private ImageView ivImgResource;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvStoryId = itemView.findViewById(R.id.tv_story_id);
            ivImgResource = itemView.findViewById(R.id.iv_story_img);
        }

        public void setItem(Story story) {
            tvStoryId.setText(story.getId());
            ivImgResource.setImageResource(story.getImageResource());
        }
    }
}
