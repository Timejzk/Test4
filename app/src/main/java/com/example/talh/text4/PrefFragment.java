package com.example.talh.text4;

/**
 * Created by TALH on 2017/4/13.
 */
import android.os.Bundle;
import android.preference.PreferenceFragment;


public class PrefFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }

}
