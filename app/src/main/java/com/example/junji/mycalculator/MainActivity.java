package com.example.junji.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Calculator cal = new Calculator();
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button clrAllBtn;
    private Button clrBtn;
    private Button dltBtn;
    private Button addBtn;
    private Button divBtn;
    private Button negBtn;
    private Button mulBtn;
    private Button relBtn;
    private Button dotBtn;
    private Button revBtn;
    private TextView result;
    private TextView temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        clrBtn = findViewById(R.id.clrbtn);
        clrAllBtn = findViewById(R.id.clrAllBtn);
        result = findViewById(R.id.result);
        relBtn = findViewById(R.id.relbtn);
        revBtn = findViewById(R.id.revbtn);
        dltBtn = findViewById(R.id.dltbtn);
        divBtn = findViewById(R.id.divbtn);
        addBtn = findViewById(R.id.addbtn);
        mulBtn = findViewById(R.id.mulbtn);
        negBtn = findViewById(R.id.negbtn);
        temp = findViewById(R.id.temp);
        dotBtn = findViewById(R.id.dotbtn);
        result.setText("0");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.numBtnOnClick("1");
                showInput();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.numBtnOnClick("2");
                showInput();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.numBtnOnClick("3");
                showInput();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.numBtnOnClick("4");
                showInput();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.numBtnOnClick("5");
                showInput();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.numBtnOnClick("6");
                showInput();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.numBtnOnClick("7");
                showInput();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.numBtnOnClick("8");
                showInput();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.numBtnOnClick("9");
                showInput();
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.numBtnOnClick("0");
                showInput();
            }
        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.doMathBtn("+");
                showText();
            }
        });

        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.doMathBtn("*");
                showText();
            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.doMathBtn("/");
                showText();
            }
        });

        negBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.doMathBtn("-");
                showText();
            }
        });

        dltBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.deleteBtn();
                showText();
            }
        });

        relBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.equalBtn();
                showText();
            }
        });

        clrAllBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.clrAllBtnOnClick();
                showText();
            }
        });

        clrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.clearBtnOnClick();
                showText();
            }
        });

        dotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.dotBtnOnClick();
                showInput();
            }
        });

        revBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.revBtnOnClick();
                showText();
            }
        });
    }

    public void showInput(){
        result.setText(cal.input);
    }

    public void showText() {
        temp.setText(cal.temp + " " + cal.math);
        result.setText(cal.input);
    }
}
