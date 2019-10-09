package com.example.myslider;


import android.content.Context;
import android.content.SharedPreferences;
//this is to manage shared preference
//invoked after clicking skip or got it button

public class Session {
    //the preference stores the settings of the user which
    SharedPreferences pref;
    //this required to edit the preferences
    SharedPreferences.Editor editor;
    //context is a pointer to the current instance
    Context _context;

    // shared pref mode
    int PRIVATE_MODE = 0;

    // Shared preferences file name
    private static final String PREF_NAME = "snow-intro-slider";

    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    public Session(Context context) {
        //take the instance of the current activity to the menber of this class
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        //to edit this particular setting
        editor = pref.edit();
    }

    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        //this is first time launch and commit it
        editor.commit();
    }

    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }

}
