package com.example.examdaniforteza;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Fragment1.Fragment1Listener{
    private Fragment1 fragment1;
    private Fragment2 fragment2;
    private Fragment3 fragment3;

    private EditText editText;
    private SeekBar seekBar;
    private TextView tv;
    private Button change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.edit_text);
        tv = (TextView) findViewById(R.id.textoPantalla);
        change = (Button)findViewById(R.id.change);



        fragment1=new Fragment1();
        fragment2=new Fragment2();
        fragment3=new Fragment3();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_1,fragment1)
                .replace(R.id.container_2,fragment2)
                .replace(R.id.container_3,fragment3)
                .commit();



    }


    public void onInputASent(CharSequence input) {
        fragment1.updateEditText(input);
    }



}