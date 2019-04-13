package com.example.preferencefragment;

import android.preference.PreferenceActivity;
import android.os.Bundle;

public class settingsActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   setContentView(R.layout.activity_settings);
        addPreferencesFromResource(R.xml.preference);
    }
}
