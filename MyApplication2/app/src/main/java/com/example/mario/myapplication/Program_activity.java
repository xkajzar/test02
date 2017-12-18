package com.example.mario.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Program_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen00);
        TextView display = (TextView) findViewById(R.id.display);
        display.setText("test");
       /* try {
            FileInputStream fstream = new FileInputStream(Context.MODE_PRIVATE"dfile");
            byte[] dummy = new byte[10];

            fstream.read(dummy);
            String str = dummy.toString();
            display.setText(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                finish();
            }
        });
    }
}
