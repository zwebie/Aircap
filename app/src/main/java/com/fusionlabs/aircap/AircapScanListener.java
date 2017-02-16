package com.fusionlabs.aircap;

import android.bluetooth.BluetoothDevice;

import com.gemsense.gemsdk.GemScanListener;

/**
 * Created by zwebie on 2/16/17.
 */

public class AircapScanListener implements GemScanListener {

    public AircapScanListenerInterface delegate;
    private BluetoothDevice[] devices;

    @Override
    public void onScanFinish() {
        if (delegate != null) {
            delegate.onScanFinished();
        }
    }

    @Override
    public void onDeviceDiscovered(BluetoothDevice bluetoothDevice, int singalStrength) {
        if (delegate != null) {
            delegate.onDeviceDiscovered(bluetoothDevice, singalStrength);
        }
    }
}
