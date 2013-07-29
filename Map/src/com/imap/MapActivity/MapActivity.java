package com.imap.MapActivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MapActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_map);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_map, menu);
        return true;
    }
}
