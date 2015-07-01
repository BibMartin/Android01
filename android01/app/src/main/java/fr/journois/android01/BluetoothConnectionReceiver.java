package fr.journois.android01;

import android.app.*;
import android.os.*;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.widget.TextView;
import android.view.*;
import android.widget.*;

public class BluetoothConnectionReceiver extends BroadcastReceiver {
    public BluetoothConnectionReceiver(){
        //No initialisation code needed
    }


    @Override
    public void onReceive(Context context, Intent intent){
        // setContentView(R.layout.main);
		Context cc = context.getApplicationContext();
		if(BluetoothDevice.ACTION_ACL_CONNECTED.equals(intent.getAction()) ){
			//Do something with bluetooth device connection
			CharSequence text = "Connection!";
			int duration = Toast.LENGTH_SHORT;
			Toast toast = Toast.makeText(cc, text, duration);
			toast.show();
			//Toast
			// TextView tv1 = (TextView)findViewById(R.id.tv1);
			// tv1.setText("Connected!");
        } else if (BluetoothDevice.ACTION_ACL_DISCONNECTED.equals(intent.getAction()) ){
            //Do something with bluetooth device disconnection
			CharSequence text = "Disconnection!";
			int duration = Toast.LENGTH_SHORT;
			Toast toast = Toast.makeText(cc, text, duration);
			toast.show();
			// TextView tv1 = (TextView)findViewById(R.id.tv1);
			// tv1.setText("Disconnected!");
        } else {
			CharSequence text = "Something else!";
			int duration = Toast.LENGTH_SHORT;
			Toast toast = Toast.makeText(cc, text, duration);
			toast.show();
			
			
		}
		
		//Context context = getApplicationContext();
		
    }
}
