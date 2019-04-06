package com.example.bai4.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bai4.Model.Song;
import com.example.bai4.R;

import java.util.List;

public class SongAdapter extends BaseAdapter {
    List<Song> songList;
    Context mContext;

    public SongAdapter(List<Song> songList, Context mContext) {
        this.songList = songList;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return songList.size();
    }

    @Override
    public Object getItem(int position) {
        return songList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null)
        {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.itembaihat,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.tvName =  convertView.findViewById(R.id.tvName);
            viewHolder.imIcon =  convertView.findViewById(R.id.imIcon);
            viewHolder.tvDescription = convertView.findViewById(R.id.description);
            viewHolder.tvTimeSong = convertView.findViewById(R.id.timeSong);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Song song = songList.get(position);
        viewHolder.tvName.setText(song.getName());
        viewHolder.tvDescription.setText(song.getDescription());
        viewHolder.imIcon.setBackgroundResource(song.getIcon());
        viewHolder.tvTimeSong.setText(song.getTime());
        return convertView;
    }
    public class ViewHolder {
        TextView tvName,tvDescription,tvTimeSong;
        ImageView imIcon;

    }
}
