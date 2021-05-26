package com.udemylearn.facedetection;

import android.app.Application;

import com.google.firebase.FirebaseApp;

public class FaceDetection extends Application {
    public static final String RESULT_TEXT="RESULT_TEXT";
    public static final String RESULT_DIALOUGE="RESULT_DIALOUGE";

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
