package com.example.localrestro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class orderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Intent intent=getIntent();
        String message = intent.getStringExtra(MainActivity.MSG);

        TextView textView=findViewById(R.id.textView3);
        textView.setText(message);
    }
   public void mainmenu(View view){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
   }
}