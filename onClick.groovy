

/*******Opcion 1: multiples objetos onClick usando condicional if********/

//activity_main.xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <Button
        android:id="@+id/button1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button1"
        android:layout_gravity="center"
        android:onClick="onClick"/>

    <Button
        android:id="@+id/button2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button2"
        android:layout_gravity="center"
        android:onClick="onClick"/>

    <Button
        android:id="@+id/button3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button3"
        android:layout_gravity="center"
        android:onClick="onClick"/>

</LinearLayout>


//MainActivity.java
package com.example.seccion1app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    
    public void onClick(View v) {
        if(v.getId() == R.id.button1){
            Toast.makeText(this, "Ingreso con el botón 1", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.button2){
            Toast.makeText(this, "Ingreso con botón 2", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.button3){
            Toast.makeText(this, "Ingreso con botón 3", Toast.LENGTH_SHORT).show();
        }
    }

}


/*******Opcion 2: multiples objetos onClick usando condicional if********/