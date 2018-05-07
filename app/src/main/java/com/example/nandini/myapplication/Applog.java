package com.example.nandini.myapplication;

import android.util.Log;

/**
 * Created by Nandini on 4/28/2018.
 */

public class Applog {

    private  final static  String APP_TAG="com.example.multitouchdemo";
    public  static  int log(String message){
        return Log.i(APP_TAG,message);
    }
}
