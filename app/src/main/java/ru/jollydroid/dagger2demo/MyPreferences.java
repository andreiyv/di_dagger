package ru.jollydroid.dagger2demo;

import android.content.Context;
import android.content.SharedPreferences;

public class MyPreferences {
// Хелпер для работы с Shared Preferences будет синглтоном, при инициализации нужен Context
    public static final String PREFS_NAME = "MyPrefsFile";
    private final SharedPreferences prefs;

    public MyPreferences(Context context) {
        prefs = context.getSharedPreferences(PREFS_NAME, 0);
    }

    private static final String visited = "visited";
    public boolean isVisited () {
        return prefs.getBoolean(visited, false);
    }
    public void setVisited() {
        prefs.edit().putBoolean(visited, true).apply();
    }
}