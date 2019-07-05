package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean add=false;
    boolean sub=false;
    boolean div=false;
    boolean mul=false;


    double first,second;


    TextView tv;
    Button nine;
    Button eight;
    Button seven;
    Button six;
    Button five;
    Button four;
    Button three;
    Button two;
    Button one;
    Button dot;
    Button zero;
    Button equals;
    Button minus;
    Button divide;
    Button plus;
    Button clear;
    Button pro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);
        dot=findViewById(R.id.dot);
        equals=findViewById(R.id.equals);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        divide=findViewById(R.id.divide);
        pro=findViewById(R.id.pro);
        clear=findViewById(R.id.clear);
        tv=findViewById(R.id.tv);



        //setup onclickListener

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv.append("1");

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv.append("2");

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv.append("3");

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv.append("4");

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv.append("5");

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv.append("6");

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv.append("7");

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv.append("8");

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv.append("9");

            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv.append("0");

            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv.append(".");

            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                second=Double.valueOf(""+tv.getText());

                if(add)
                {
                    tv.setText(""+(first+second));
                }
                if(sub)
                {
                    tv.setText(""+(first-second));
                }
                if(mul)
                {
                    tv.setText(""+(first*second));
                }
                if(div)
                {
                    tv.setText(""+(first/second));
                }

                add=false;
                sub=false;
                mul=false;
                div=false;

            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               first= Double.valueOf(""+tv.getText());

               add=true;

               tv.setText("");


            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                first= Double.valueOf(""+tv.getText());

                sub=true;

                tv.setText("");

            }
        });

        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                first= Double.valueOf(""+tv.getText());

                mul=true;

                tv.setText("");

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                first= Double.valueOf(""+tv.getText());

                div=true;

                tv.setText("");


            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String textw=""+tv.getText();


                try {

                    tv.setText(textw.substring(0, textw.length() - 1));
                }

                catch(Exception e)
                {


                }

            }
        });

        clear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                tv.setText("");
                return false;
            }
        });
    }
}
