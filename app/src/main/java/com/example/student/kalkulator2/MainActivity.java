package com.example.student.kalkulator2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.Queue;

public class MainActivity extends AppCompatActivity {

    private Queue<String> values = new LinkedList<String>();
    public void buttonNumberClick(View view){
        String value = ((Button) view).getText().toString();
        Toast.makeText(MainActivity.this, ((Button) view).getText().toString(),
                Toast.LENGTH_LONG).show();
        values.add(value);
    }
    public void buttonFunctionClick(View view){
        String value = ((Button) view).getText().toString();
        Toast.makeText(MainActivity.this, value + " func",
                Toast.LENGTH_LONG).show();
        values.add(value);
    }
    public void buttonEqualsClick(View view){
        Toast.makeText(MainActivity.this, values.toString(),
                Toast.LENGTH_LONG).show();
        int buffer = 0;
        String lastOperand = "";
        for(String v : values){
            int number = 0;
            try{
                number = Integer.parseInt(v);
            }
            catch (Exception ex){
                if(v == "+"){
                    lastOperand = v;
                }
            }
            if(number != 0){
                buffer += number;
            }
            lastOperand = "";
        }
    }
}
