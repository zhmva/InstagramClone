package com.example.instagramclone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class instagram1 extends Fragment {

   private RecyclerView rvPosts;
   private PostAdapter postAdapter;
   private List<PostModel> list = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_instagram1, container,false);
        initPostList();
        rvPosts = view.findViewById(R.id.rv_posts);
        postAdapter = new PostAdapter(requireContext());
        for (PostModel postModel : list){
            if (!list.isEmpty()){
                postAdapter.addToList(postModel);
            }
        }
        rvPosts.setAdapter(postAdapter);
        return view;
    }

    private void initPostList() {
        list.add(new PostModel(R.drawable.post0, "random_user"));
        list.add(new PostModel(R.drawable.post1, "random_user"));
        list.add(new PostModel(R.drawable.post2, "random_user"));
        list.add(new PostModel(R.drawable.post3, "random_user"));
        list.add(new PostModel(R.drawable.post4, "random_user"));
        list.add(new PostModel(R.drawable.post5, "random_user"));
        list.add(new PostModel(R.drawable.post6, "random_user"));
        list.add(new PostModel(R.drawable.post7, "random_user"));
        list.add(new PostModel(R.drawable.post8, "random_user"));
    }
}