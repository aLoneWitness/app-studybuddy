package nl.niekvangogh.studybuddy.activities;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.app.ActionBar;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.preference.RingtonePreference;
import android.text.TextUtils;
import android.view.MenuItem;

import nl.niekvangogh.studybuddy.R;
import nl.niekvangogh.studybuddy.activities.settings.AccountSettingsActivity;
import nl.niekvangogh.studybuddy.activities.settings.HelpSettingsActivity;
import nl.niekvangogh.studybuddy.activities.settings.LanguageSettingsActivity;
import nl.niekvangogh.studybuddy.activities.settings.NotificationSettingsActivity;

import java.util.List;

public class SettingsActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupActionBar();
    }

    /**
     * Set up the {@link android.app.ActionBar}, if the API is available.
     */
    private void setupActionBar() {
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            // Show the Up button in the action bar.
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public void onBuildHeaders(List<Header> target) {
        loadHeadersFromResource(R.xml.pref_headers, target);
    }

    /**
     * This method stops fragment injection in malicious applications.
     * Make sure to deny any unknown fragments here.
     */
    protected boolean isValidFragment(String fragmentName) {
        return PreferenceFragment.class.getName().equals(fragmentName)
                || HelpSettingsActivity.class.getName().equals(fragmentName)
                || AccountSettingsActivity.class.getName().equals(fragmentName)
                || SettingsActivity.class.getName().equals(fragmentName)
                || LanguageSettingsActivity.class.getName().equals(fragmentName)
                || NotificationSettingsActivity.class.getName().equals(fragmentName);
    }
}
