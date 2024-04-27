package com.example.database;
import android.app.Person;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.media.tv.BroadcastInfoRequest;
import android.os.BatteryManager;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 EditText e1,e2,e3;
TextView t1;
 Button b1,b2;
SQLiteDatabase sqLiteDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        e3=findViewById(R.id.e3);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        t1=findViewById(R.id.t1);
        sqLiteDatabase = openOrCreateDatabase("PersonDb",MODE_PRIVATE,null);
        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS Person(Name TEXT ,Age INTEGER, Address TEXT)");

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = e1.getText().toString();
                int age = Integer.parseInt(e2.getText().toString());
                String address = e3.getText().toString();

                ContentValues values = new ContentValues();
                values.put("Name",name);
                values.put("Age",age);
                values.put("Address",address);
                long result= sqLiteDatabase.insert("Person",null,values);

                if ( result!=-1)
                {
                    Toast.makeText(MainActivity.this, "Successfully added to the database",Toast.LENGTH_LONG).show();

                }
                else {
                    Toast.makeText(MainActivity.this, "Error in  adding to the database",Toast.LENGTH_LONG).show();
                }




            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM Person", null);
                StringBuilder stringBuilder = new StringBuilder();
                if(cursor.moveToFirst())
                {
                    do {
                        stringBuilder.append("Name:").append(cursor.getString(0)).append(",");
                        stringBuilder.append("Age:").append(cursor.getString(1)).append(",");
                        stringBuilder.append("Address:").append(cursor.getString(2)).append("\n");
                    }while( cursor.moveToNext());
                }
                Toast.makeText(MainActivity.this, stringBuilder, Toast.LENGTH_LONG).show();
                t1.setText(stringBuilder);
            }
        });
    }}