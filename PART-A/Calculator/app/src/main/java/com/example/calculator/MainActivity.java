package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,add,sub,mul,div,reset;
TextView t1,ans;
EditText num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        add=findViewById(R.id.add);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        sub=findViewById(R.id.sub);
        reset=findViewById(R.id.reset);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        t1=findViewById(R.id.t1);
        ans=findViewById(R.id.ans);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText("0");
                num2.setText("0");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().length()>0){
                    num2.setText("0");
                }else{
                    num1.setText("0");
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().length()>0){
                    num2.setText("1");
                }else{
                    num1.setText("1");
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().length()>0){
                    num2.setText("2");
                }else{
                    num1.setText("2");
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().length()>0){
                    num2.setText("3");
                }else{
                    num1.setText("3");
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().length()>0){
                    num2.setText("4");
                }else{
                    num1.setText("4");
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().length()>0){
                    num2.setText("5");
                }else{
                    num1.setText("5");
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().length()>0){
                    num2.setText("6");
                }else{
                    num1.setText("6");
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().length()>0){
                    num2.setText("7");
                }else{
                    num1.setText("7");
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().length()>0){
                    num2.setText("8");
                }else{
                    num1.setText("8");
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().length()>0){
                    num2.setText("9");
                }else{
                    num1.setText("0");
                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2;
                if(num1.getText().toString()==""){
                    n1=0;
                }else{
                    n1 =Integer.parseInt(num1.getText().toString()) ;
                }
                if(num2.getText().toString()==""){
                    n2=0;
                }else{
                    n2 =Integer.parseInt( num2.getText().toString());
                }


                String answer = String.valueOf(n1+n2);
                ans.setText(answer);

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2;
                if(num1.getText().toString()==""){
                    n1=0;
                }else{
                    n1 =Integer.parseInt(num1.getText().toString()) ;
                }
                if(num2.getText().toString()==""){
                    n2=0;
                }else{
                    n2 =Integer.parseInt( num2.getText().toString());
                }
                String answer = String.valueOf(n1-n2);
                ans.setText(answer);

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2;
                if(num1.getText().toString()==""){
                    n1=0;
                }else{
                    n1 =Integer.parseInt(num1.getText().toString()) ;
                }
                if(num2.getText().toString()==""){
                    n2=0;
                }else{
                    n2 =Integer.parseInt( num2.getText().toString());
                }
                String answer = String.valueOf(n1*n2);
                ans.setText(answer);

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answer;
                int n1,n2;
                if(num1.getText().toString()==""){
                    n1=0;
                }else{
                    n1 =Integer.parseInt(num1.getText().toString()) ;
                }
                if(num2.getText().toString()==""){
                    n2=0;
                }else{
                    n2 =Integer.parseInt( num2.getText().toString());
                }
                if(n2==0){
                    answer="divide by zero";
                }else{
                    answer = String.valueOf(n1/n2);
                }
                ans.setText(answer);

            }
        });
    }
}