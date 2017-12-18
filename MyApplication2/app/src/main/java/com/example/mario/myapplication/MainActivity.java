package com.example.mario.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.init);
        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                TextView view = (TextView) findViewById(R.id.viewk);
                EditText centerText = (EditText) findViewById(R.id.editText);
                view.setText(centerText.getText());

                byte[] data = new byte[centerText.getText().length()];
                data = centerText.getText().toString().getBytes();
                String filename="dfile";
                FileOutputStream outputStream;
                try {
                    outputStream = openFileOutput(filename, Context.MODE_PRIVATE);
                    outputStream.write(data);
                    outputStream.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        });

        Button button2 = (Button) findViewById(R.id.next);
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
              //  Filework fileWork = new Filework();
                Intent i = new Intent(MainActivity.this, Program_activity.class);
                startActivity(i);

            }
        });

    }
}
