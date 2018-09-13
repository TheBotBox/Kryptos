package thebotbox.app.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

public class Preference {
    private SharedPreferences preferences;
    private Editor editor;
    private final String _encrypt = "_encrypt";

    public Preference(Context context) {
        setPreferences(PreferenceManager.getDefaultSharedPreferences(context));
        editor = getPreferences().edit();
    }

    public String getEncryptValue() {
        return getPreferences().getString(_encrypt, "NA");
    }

    public void setEncryptValue(String scan) {
        editor.putString(_encrypt, scan);
        editor.commit();
    }

    public SharedPreferences getPreferences() {
        return preferences;
    }

    public void setPreferences(SharedPreferences preferences) {
        this.preferences = preferences;
    }

}
