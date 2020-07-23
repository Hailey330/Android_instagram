package com.cos.instagramui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main_Activity";
    private RecyclerView rvStory, rvPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvStory = findViewById(R.id.rv_story);
        rvPost = findViewById(R.id.rv_post);

        StoryAdapter storyAdapter = new StoryAdapter();
        PostAdapter postAdapter = new PostAdapter();

        storyAdapter.addItem(new Story("내 스토리", R.drawable.profile1));
        storyAdapter.addItem(new Story("jennieruby", R.drawable.profile2));
        storyAdapter.addItem(new Story("binniebay", R.drawable.profile3));
        storyAdapter.addItem(new Story("dlwlrma", R.drawable.profile4));
        storyAdapter.addItem(new Story("hyovely.g", R.drawable.profile5));
        storyAdapter.addItem(new Story("hailey_daily", R.drawable.profile6));
        storyAdapter.addItem(new Story("bestcxxking", R.drawable.profile7));

        postAdapter.addItem(new Post("jennieruby", "jennieruby", R.drawable.post1, R.drawable.profile2, "오늘도 좋은 하루!"));
        postAdapter.addItem(new Post("hongcha", "hongcha", R.drawable.post2, R.drawable.profile1, "나른한 오후니까 낮잠 타임.."));
        postAdapter.addItem(new Post("dlwlrma", "dlwlrma", R.drawable.post3, R.drawable.profile4, "💘💝💕💜🧡💛💖", "#블루밍 #새앨범 #스트리밍"));
        postAdapter.addItem(new Post("hongcha", "hongcha", R.drawable.post4, R.drawable.profile1, "투게더 퍼먹기", "#투게더 #통째로 #간식"));

        rvPost.setLayoutManager(new LinearLayoutManager(this));
        rvPost.setAdapter(postAdapter);
        rvStory.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rvStory.setAdapter(storyAdapter);
    }
}