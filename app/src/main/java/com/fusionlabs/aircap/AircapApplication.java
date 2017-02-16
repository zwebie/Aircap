package com.fusionlabs.aircap;

import android.app.Application;
import android.content.Context;

/**
 * Created by zwebie on 2/16/17.
 */

public class AircapApplication extends Application {

    private static Context _context;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static Context getContext() {
        return _context;
    }
}
