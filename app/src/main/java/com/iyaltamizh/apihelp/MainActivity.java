package com.iyaltamizh.apihelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//    below method used for printing the values

    public void onEdit(View v){
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.iyaltamizh.bluetoothprint", "com.iyaltamizh.bluetoothprint.Print"));
        intent.putExtra("content","Hello World\n\n Content from test app\n");

        //Optional param for direct print without showing the printer select screen --- Replace with your printer mac id
        intent.putExtra("device_address","0F:02:18:B0:53:AA");
        startActivity(intent);
    }
}
