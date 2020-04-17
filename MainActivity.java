package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonAdd, buttonSub, buttonMul, buttondiv, buttonDot, buttonC, buttonEqual, buttonBrac, buttonPerc;
    TextView crunchifyEditText ,text2;
    float mValueOne, mValueTwo;
    boolean mAdd, mSub, mMul, mDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.number0);
        button1 = (Button) findViewById(R.id.number1);
        button2 = (Button) findViewById(R.id.number2);
        button3 = (Button) findViewById(R.id.number3);
        button4 = (Button) findViewById(R.id.number4);
        button5 = (Button) findViewById(R.id.number5);
        button6 = (Button) findViewById(R.id.number6);
        button7 = (Button) findViewById(R.id.number7);
        button8 = (Button) findViewById(R.id.number8);
        button9 = (Button) findViewById(R.id.number9);
        buttonDot = (Button) findViewById(R.id.dot);
        buttonAdd = (Button) findViewById(R.id.Addition);
        buttonSub = (Button) findViewById(R.id.subtraction);
        buttonMul = (Button) findViewById(R.id.multiplication);
        buttondiv = (Button) findViewById(R.id.division);
        buttonC = (Button) findViewById(R.id.Clear);
        buttonEqual = (Button) findViewById(R.id.Equals);
        buttonBrac = (Button) findViewById(R.id.brackets);
        buttonPerc = (Button) findViewById(R.id.percentage);
        crunchifyEditText = (TextView) findViewById(R.id.data);
        text2= (TextView) findViewById((R.id.output));

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (crunchifyEditText == null) {
                    crunchifyEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    mAdd = true;
                    crunchifyEditText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                mSub = true;
                crunchifyEditText.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                mMul = true;
                crunchifyEditText.setText(null);
            }
        });

        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                mDiv = true;
                crunchifyEditText.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(crunchifyEditText.getText() + "");

                if (mAdd == true) {
                    text2.setText(mValueOne + mValueTwo + "");
                    mAdd = false;
                }

                if (mSub == true) {
                    text2.setText(mValueOne - mValueTwo + "");
                    mSub = false;
                }

                if (mMul == true) {
                    text2.setText(mValueOne * mValueTwo + "");
                    mMul = false;
                }

                if (mDiv == true) {
                    text2.setText(mValueOne / mValueTwo + "");
                    mDiv = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText("");
                text2.setText("");
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + ".");



            }
        });
    }
}