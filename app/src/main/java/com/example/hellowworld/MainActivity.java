package com.example.hellowworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  EditText editText5;
  TextView textView5;
  Button button2;
  String str_editText5 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText5=findViewById(R.id.editText5);
        button2=(Button) findViewById(R.id.button2);
        textView5=findViewById(R.id.textView5);
        button2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        int ViewId=v.getId();
        if(ViewId==R.id.button2){
            str_editText5=editText5.getText().toString().trim();
            String result = "Bonjour" +"  " +str_editText5;
            textView5.setText(result);

    }
}
}
