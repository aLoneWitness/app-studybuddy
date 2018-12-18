package nl.niekvangogh.studybuddy.activities.settings;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import nl.niekvangogh.studybuddy.R;

public class LanguageSettingsActivity extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.pref_language);
    }
}
