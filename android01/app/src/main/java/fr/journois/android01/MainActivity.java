package fr.journois.android01;

import android.app.*;
import android.os.*;
import android.widget.TextView;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		TextView tv1 = (TextView)findViewById(R.id.tv1);
		tv1.setText("Hi World!");
    }
	
}


