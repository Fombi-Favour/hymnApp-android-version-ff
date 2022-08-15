package com.example.tacctools_test2.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tacctools_test2.R;
import com.example.tacctools_test2.models.SongModel;

import java.util.ArrayList;

public class SongListAdapter extends RecyclerView.Adapter<SongListAdapter.SongViewHolder> {

    private final Context context;
    private final ArrayList<String> songs;

    public SongListAdapter(Context context, ArrayList<String> songList) {
        this.context = context;
        this.songs = songList;
    }

    @NonNull
    @Override
    public SongListAdapter.SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SongViewHolder(LayoutInflater.from(context).inflate(R.layout.song_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SongListAdapter.SongViewHolder holder, int position) {
        holder.title.setText(songs.get(position));
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class SongViewHolder extends RecyclerView.ViewHolder{

        TextView title;

        public SongViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title_text);
        }
    }
}
