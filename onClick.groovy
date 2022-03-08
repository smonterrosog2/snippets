

/*******Opcion 1: Multiples objetos onClick usando condicional if********/

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


/*******Opcion 2: multiples objetos onClick usando condicional switch********/

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
        switch (v.getId()){
            case R.id.button1:
                Toast.makeText(this, "Ingreso con el botón 1", Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
                Toast.makeText(this, "Ingreso con el botón 2", Toast.LENGTH_LONG).show();
            case R.id.button3:
                Toast.makeText(this, "Ingreso con el botón 3", Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }
     }
     
}

/*******Opcion 3: multiples objetos onClick usando el metodo .setOnClickListener********/

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
        android:id="@+id/btnBoton1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button1"
        android:layout_gravity="center" />

    <Button
        android:id="@+id/btnBoton2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button2"
        android:layout_gravity="center" />

    <Button
        android:id="@+id/btnBoton3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button3"
        android:layout_gravity="center" />

</LinearLayout>


//MainActivity.java

package com.example.seccion1app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    Button Boton1, Boton2, Boton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Boton1 = findViewById(R.id.btnBoton1);
        Boton2 = findViewById(R.id.btnBoton2);
        Boton3 = findViewById(R.id.btnBoton3);

        Boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clic en botón 1", Toast.LENGTH_LONG).show();
            }
        });

        Boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clic en botón 2", Toast.LENGTH_SHORT).show();
            }
        });

        Boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Click eb botón 3", Toast.LENGTH_SHORT).show();
            }
        });

    }


