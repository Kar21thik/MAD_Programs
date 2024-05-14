package com.example.prgmcalldatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b1,b2;
EditText e1,e2,e3,e4;
SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        e3=findViewById(R.id.e3);
        e4=findViewById(R.id.e4);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        sqLiteDatabase=openOrCreateDatabase("PersonDB",MODE_PRIVATE,null);
        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS Person(Name TEXT, Usn TEXT, Phone TEXT)");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = e1.getText().toString();
                String usn = e2.getText().toString();
                String phone = e3.getText().toString();
                ContentValues values = new ContentValues();
                values.put("Name",name);
                values.put("Usn",usn);
                values.put("Phone",phone);
                long result= sqLiteDatabase.insert("Person",null,values);
                if ( result!=-1)
                {
                    Toast.makeText(MainActivity.this, "success", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String u = e2.getText().toString();
                Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM Person WHERE Usn=?",new String[]{u});
                if(cursor.getCount()!=1)
                {
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
                cursor.moveToNext();
                String ph = cursor.getString(2);
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:"+ph));
                startActivity(i);


            }
        });

    }
}