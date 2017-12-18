package com.example.mario.myapplication;

import android.provider.MediaStore;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Mario on 18/12/2017.
 */

public class filewrite {

    public void write(byte[] data, int size, String filename) throws IOException {
        FileOutputStream file = new FileOutputStream(filename);
        file.write(data);
        file.close();
    }

    /*public byte[] read(String filename) throws IOException {

        FileInputStream file = new FileInputStream(filename);
        byte[] data = file.read();

    }*/
}
