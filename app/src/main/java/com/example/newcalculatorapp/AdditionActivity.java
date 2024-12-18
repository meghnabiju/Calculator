package com.example.newcalculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AdditionActivity extends AppCompatActivity {

    Button b1;
    EditText et1,et2;
    String getnum1,getnum2,result;
    int sum,num1,num2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addition);

        b1=(Button) findViewById(R.id.b);
        et1=(EditText) findViewById(R.id.n1);
        et2=(EditText) findViewById(R.id.n2);
        tv=(TextView) findViewById(R.id.resToDisp);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getnum1=et1.getText().toString();
                getnum2=et2.getText().toString();
                num1=Integer.parseInt(getnum1);
                num2=Integer.parseInt(getnum2);
                sum=num1+num2;
                result=String.valueOf(sum);
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
                tv.setText(result);
            }
        });

    }
}