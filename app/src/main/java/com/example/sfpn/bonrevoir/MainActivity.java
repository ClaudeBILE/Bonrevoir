package com.example.sfpn.bonrevoir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    Button DitBonjour;
    int b = 1;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DitBonjour = (Button) findViewById(R.id.Button_display);
        DitBonjour.setOnClickListener(this);
        t = (TextView) findViewById(R.id.text_display);
    }
    @Override
    public void onClick(View v){
        //Intent i = new Intent(this,MainActivity.class);
        //startActivity(i);
        if (b == 1) {
            DitBonjour.setText("Dis Bonjour");
            t.setText("Au revoir !");
            b=0;
        }else {

            DitBonjour.setText("Dis Au revoir");
            t.setText("Bonjour !");
            b=1;

        }
    }

}
