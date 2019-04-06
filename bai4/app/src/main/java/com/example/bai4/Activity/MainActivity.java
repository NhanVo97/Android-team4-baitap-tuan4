package com.example.bai4.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.bai4.Adapter.SongAdapter;
import com.example.bai4.Model.Song;
import com.example.bai4.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    SongAdapter songAdapter;
    List<Song> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Anh Xa
        listView = findViewById(R.id.listSong);
        // init data
        list = new ArrayList<>();
        list.add(new Song("See you again",R.drawable.sua,"Top song 2019","5:30"));
        list.add(new Song("Love me like you do",R.drawable.amlyd,"New Song 2019","4:20"));
        list.add(new Song("What do you mean",R.drawable.wdym,"Top 1 Song","5:21"));
        songAdapter = new SongAdapter(list,getApplicationContext());
        listView.setAdapter(songAdapter);
    }
}
