package com.example.localrestro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  public static final String MSG = "com.codewithDhawal.localrestro.ORDER";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void placeOrder(View view){
        Intent intent= new Intent(this,orderActivity.class);
        EditText editText1= findViewById(R.id.editText1);
        EditText editText2= findViewById(R.id.editText2);
        EditText editText3= findViewById(R.id.editText3);
        EditText editText4= findViewById(R.id.editText4);
        String message= "Your Order of "+editText1.getText().toString()+" & "
                +editText2.getText().toString()+" & "
                +editText3.getText().toString()+" & "
                +editText4.getText().toString()+" has been Ordered Sucessfully";
           intent.putExtra(MSG,message);
           startActivity(intent);
    }

}