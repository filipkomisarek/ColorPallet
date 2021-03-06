package com.filipbezserca.colotpallet;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.os.Bundle;
import android.util.Log;

import android.view.MenuItem;

public class ColorActivity extends AppCompatActivity {

    private static final String LOG_TAG = ColorActivity.class.getSimpleName();
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        // wywolanie actionbar do cofniecia w gore
        actionBar = getSupportActionBar();
        // wyswietlenie strzalki do cofniecia w gore
        actionBar.setDisplayHomeAsUpEnabled(true);
        Log.d(LOG_TAG, "onCreate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //logowanie informacji do wyswietlenia
        Log.d(LOG_TAG, "onDestroy");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    // obsluga klikniecia na strzalke do cofniecia w gore
    @Override
    public boolean onOptionsItemSelected (MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            NavUtils.navigateUpFromSameTask(this);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}