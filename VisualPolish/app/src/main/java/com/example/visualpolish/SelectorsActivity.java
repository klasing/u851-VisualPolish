package com.example.visualpolish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

public class SelectorsActivity extends AppCompatActivity
        implements SelectorItemsAdapter.ListItemClickListener{

    private static final String TAG = SelectorsActivity.class.getSimpleName();

    RecyclerView mRecyclerView;
    SelectorItemsAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectors_activity);

        mRecyclerView = (RecyclerView) findViewById(R.id.mainRecyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        mAdapter = new SelectorItemsAdapter(this);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void onListItemClick(int clickedItemIndex) {
        Log.v(TAG, "List item clicked at index: " + clickedItemIndex);

    }
}