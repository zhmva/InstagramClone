package com.example.instagramclone;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolderPost> {
   private List<PostModel> list = new ArrayList<>();
   private LayoutInflater inflater;

   public PostAdapter(Context context){
       this.inflater = LayoutInflater.from(context);
   }
   public void addToList(PostModel postModel){
   this.list.add(postModel);
   notifyDataSetChanged();
   }


    @NonNull
    @Override
    public PostAdapter.ViewHolderPost onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = inflater.inflate(R.layout.item_post, parent, false);
       return new ViewHolderPost(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdapter.ViewHolderPost holder, int position) {
        holder.tvUsersName.setText(list.get(position).getUserName());
        holder.imgPost.setImageResource(list.get(position).getPostPhotos());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolderPost extends RecyclerView.ViewHolder {
        TextView tvUsersName;
        ImageView imgPost;


       public ViewHolderPost(View view) {
           super(view);
           tvUsersName = view.findViewById(R.id.user_name);
           imgPost = view.findViewById(R.id.iv_post);
       }
    }
}
