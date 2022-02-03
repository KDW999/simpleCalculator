package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonPlus, buttonMinus, button0, buttonSum; // 버튼 선언

    int x1, x2, result;
    char op;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // 앱 시작 시 시작되는 부분
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(); // findViewById 메소드 실행
        click(); // click 메소드 실행
    }

    private void findViewById(){
        button1 = findViewById(R.id.button1); // 메인 액티비티에서 선언한 버튼과 xml에서 만든 버튼이랑 연결
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        button0 = findViewById(R.id.button0);
        buttonSum = findViewById(R.id.buttonSum);
    }

    private void click() {
        editText = findViewById(R.id.editText);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString(); // 기존 문자열 알기
                s += button1.getText().toString(); // 버튼에서 가져온 텍스트를 문자열로 추가
                editText.setText(s);             // editText에 set(매개변수 : 스트링)
           }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString(); // 기존 문자열 알기
                s += button2.getText().toString(); // 버튼에서 가져온 텍스트를 문자열로 추가
                editText.setText(s);             // editText에 set(매개변수 : 스트링)
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString(); // 기존 문자열 알기
                s += button3.getText().toString(); // 버튼에서 가져온 텍스트를 문자열로 추가
                editText.setText(s);             // editText에 set(매개변수 : 스트링)
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString(); // 기존 문자열 알기
                s += button4.getText().toString(); // 버튼에서 가져온 텍스트를 문자열로 추가
                editText.setText(s);             // editText에 set(매개변수 : 스트링)
            }
        });

        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString(); // 기존 문자열 알기
                s += button5.getText().toString(); // 버튼에서 가져온 텍스트를 문자열로 추가
                editText.setText(s);             // editText에 set(매개변수 : 스트링)
            }
        });

        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString(); // 기존 문자열 알기
                s += button6.getText().toString(); // 버튼에서 가져온 텍스트를 문자열로 추가
                editText.setText(s);             // editText에 set(매개변수 : 스트링)
            }
        });

        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString(); // 기존 문자열 알기
                s += button7.getText().toString(); // 버튼에서 가져온 텍스트를 문자열로 추가
                editText.setText(s);             // editText에 set(매개변수 : 스트링)
            }
        });

        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString(); // 기존 문자열 알기
                s += button8.getText().toString(); // 버튼에서 가져온 텍스트를 문자열로 추가
                editText.setText(s);             // editText에 set(매개변수 : 스트링)
            }
        });

        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString(); // 기존 문자열 알기
                s += button9.getText().toString(); // 버튼에서 가져온 텍스트를 문자열로 추가
                editText.setText(s);             // editText에 set(매개변수 : 스트링)
            }
        });

        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString(); // 기존 문자열 알기
                s += button0.getText().toString(); // 버튼에서 가져온 텍스트를 문자열로 추가
                editText.setText(s);             // editText에 set(매개변수 : 스트링)
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                x1 = Integer.parseInt(editText.getText().toString()); //문자열을 정수로
                op = '+';
                editText.setText("");
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                x1 = Integer.parseInt(editText.getText().toString());
                op = '-';
                editText.setText("");
            }
        });

        buttonSum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                x2 = Integer.parseInt(editText.getText().toString());

                switch (op)
                {
                    case '+':
                        result = x1 + x2;
                        editText.setText(Integer.toString(result));
                        break;

                    case '-':
                        result = x1 - x2;
                        editText.setText(Integer.toString(result));
                        break;
                }
            }
        });
    }
}