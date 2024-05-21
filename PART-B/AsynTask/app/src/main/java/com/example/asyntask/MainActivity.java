package com.example.asyntask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
ProgressBar p;
TextView t1;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p=findViewById(R.id.p);
        t1=findViewById(R.id.t1);
        b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                T t = new T();
                t.execute("100");

            }
        });


    }


    class  T extends AsyncTask<String,Integer,String>
    {

        @Override
        protected String doInBackground(String... strings) {
            int max = Integer.parseInt(strings[0]);
            int i=0;
            while ( i<max)
            {
try {
    Thread.sleep(1000);
}catch(InterruptedException e)
{
    e.printStackTrace();
}i++;
publishProgress(i);
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            p.setProgress(values[0]);
            t1.setText(values[0].toString());
            super.onProgressUpdate(values);

        }
    }


}