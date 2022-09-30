package com.example.csunipi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NewsRVAdapter extends RecyclerView.Adapter<NewsRVAdapter.ViewHolder> {

    // variables for array list and context.
    private ArrayList<NewsModal> newsModalArrayList;
    private Context context;

    // creating a constructor.
    public NewsRVAdapter(ArrayList<NewsModal> newsModalArrayList, Context context) {
        this.newsModalArrayList = newsModalArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public NewsRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // passing our layout file for displaying our card item
        return new NewsRVAdapter.ViewHolder(LayoutInflater.from(context).inflate(R.layout.news_layout, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull NewsRVAdapter.ViewHolder holder, int position) {
        // on below line we are setting data to our ui components.
        NewsModal modal = newsModalArrayList.get(position);
        holder.newsDesc.setText(modal.getNewsDesc());
        holder.newsTitle.setText(modal.getNewsTitle());
    }

    @Override
    public int getItemCount() {
        // returning the size of array list
        return newsModalArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // creating variables for our text view.
        private TextView newsTitle, newsDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // initializing our text view
            newsTitle = itemView.findViewById(R.id.news_title);
            newsDesc = itemView.findViewById(R.id.news_desc);
        }
    }
}