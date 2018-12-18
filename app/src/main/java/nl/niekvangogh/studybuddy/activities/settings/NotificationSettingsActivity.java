package nl.niekvangogh.studybuddy.activities.settings;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nl.niekvangogh.studybuddy.R;
import nl.niekvangogh.studybuddy.activities.SettingsActivity;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class NotificationSettingsActivity extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
