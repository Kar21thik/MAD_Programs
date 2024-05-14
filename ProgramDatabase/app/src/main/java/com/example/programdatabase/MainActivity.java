package com.example.programdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b1,b2;
EditText e1,e2,e3;
TextView t;
SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        e1=findViewById(R.id.e1);
        t=findViewById(R.id.t);
        e2=findViewById(R.id.e2);
        e3=findViewById(R.id.e3);
        sqLiteDatabase= openOrCreateDatabase("PersonDB",MODE_PRIVATE,null);
        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS Person(Name TEXT, Age TEXT, Address TEXT)");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = e1.getText().toString();
                String age = e2.getText().toString();
                String address = e3.getText().toString();
                ContentValues values = new ContentValues();
                values.put("Name",name);
                values.put("Age",age);
                values.put("Address",address);
                long result = sqLiteDatabase.insert("Person",null,values);
                if (result!=-1)
                {
                    Toast.makeText(MainActivity.this, "success", Toast.LENGTH_SHORT).show();

                }
                else

                {
                    Toast.makeText(MainActivity.this, "failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM Person",null);
                StringBuilder s = new StringBuilder();
                if (cursor.moveToFirst())
                {
                    do{
                        s.append("Name:->").append(cursor.getString(0)).append("\t");
                        s.append("Age:->").append(cursor.getString(1)).append("\t");
                        s.append("Address:->").append(cursor.getString(2)).append("\n");
                    }while(cursor.moveToNext());
                }
                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
                t.setText(s);
            }
        });
    }
}