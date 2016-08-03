package com.example.ankit.mixlyrics;

import android.os.Environment;
import android.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ankit on 7/28/2016.
         */
public class Config {

    public static void init() {
        // create dirs
        File dirs = new File(Environment.getExternalStorageDirectory()+"/mls_config/");
        dirs.mkdir();
    }

    public static String getIP() {

        File sdcard = new File(Environment.getExternalStorageDirectory() + "/mls_config/");
        File file = new File(sdcard,"ip");

        FileInputStream stream = null;
        try {
             stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        String ipLine;
        StringBuilder builder = new StringBuilder();
        try {
            while ((ipLine = reader.readLine()) != null) {
                builder.append(ipLine);
             }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return builder.toString();

    }

}