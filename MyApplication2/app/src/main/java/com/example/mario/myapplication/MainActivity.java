package com.example.mario.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1=(Button) findViewById(R.id.init);
        button1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                TextView view =(TextView) findViewById(R.id.viewk);
                EditText centerText = (EditText) findViewById(R.id.editText);
                view.setText(centerText.getText());
            }
        });
        Filework fileWork= new Filework();



    }


}
