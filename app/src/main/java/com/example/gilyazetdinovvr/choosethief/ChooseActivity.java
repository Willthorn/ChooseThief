package com.example.gilyazetdinovvr.choosethief;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ChooseActivity extends AppCompatActivity {

    public static final String THIEF = "com.example.gilyazetdinovvr.THIEF";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void RadioClick(View v) {
        Intent answerIntent = new Intent();
        switch (v.getId()){
            case R.id.radioCrow:
                answerIntent.putExtra(THIEF, getString(R.string.crow));
                break;
            case R.id.radioDog:
                answerIntent.putExtra(THIEF, getString(R.string.dog));
                break;
            case R.id.radioCat:
                answerIntent.putExtra(THIEF, "Лошадь Пржевальского");
                break;
            default:
                break;

        }
        setResult(RESULT_OK, answerIntent);
        finish();
    }
}
