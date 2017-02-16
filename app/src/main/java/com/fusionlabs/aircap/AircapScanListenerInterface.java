package com.fusionlabs.aircap;

import android.bluetooth.BluetoothDevice;

/**
 * Created by zwebie on 2/16/17.
 */
public interface AircapScanListenerInterface {

    void onScanFinished();
    void onDeviceDiscovered(BluetoothDevice bluetoothDevice, int singalStrength);
}
