package com.example.ciclodevida;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    private static final String TAG = "CicloDeVida";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Cargar la interfaz gráfica
        setContentView(R.layout.activity_main);

        // Mostrar mensaje en Logcat
        Log.d("CicloDeVida", "onCreate: La actividad ha sido creada.");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart: La actividad es visible.");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume: El usuario puede interactuar con la actividad.");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause: La actividad está perdiendo el foco.");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "onStop: La actividad ya no es visible.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "onRestart: La actividad se está reiniciando.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "onDestroy: La actividad está siendo destruida.");
    }
}