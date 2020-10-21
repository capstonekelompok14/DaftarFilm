package com.daftarfilm;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private RecyclerView movieList;
    private MoviesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new MoviesAdapter();

        movieList = findViewById(R.id.movies_list);
        movieList.setLayoutManager(new LinearLayoutManager(this));
        movieList.setAdapter(adapter);
    }
}