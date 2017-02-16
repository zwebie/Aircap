package com.fusionlabs.aircap;

import com.gemsense.gemsdk.GemScanner;

/**
 * Created by zwebie on 2/16/17.
 */

public class AircapManager {

    private static AircapManager instance;
    private GemScanner scanner;

    public static AircapManager getInstance() {
        if (instance == null) {
            instance = new AircapManager();
        }
        return instance;
    }

    private AircapManager() {

    }

}
