package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity implements View.OnClickListener {

    Button add,sub,mul,div;
    EditText edn1,edn2;
    TextView ans;
    int n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        add =(Button) findViewById(R.id.btnAdd);
        sub =(Button) findViewById(R.id.btnSub);
        mul =(Button) findViewById(R.id.btnMul);
        div =(Button) findViewById(R.id.btnDiv);
        edn1=(EditText) findViewById(R.id.txtN1);
        edn2=(EditText) findViewById(R.id.txtN2);
        ans=(TextView) findViewById(R.id.lblAnswer);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);

    }

    public int getIntFromEditText(EditText editText){
        if (editText.getText().toString().equals("")){
            Toast.makeText(this,"Please enter number",Toast.LENGTH_LONG).show();
            return 0;
        }
        else {
            return Integer.parseInt(editText.getText().toString());
    }


    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {

            n1 = getIntFromEditText(edn1);
            n2 = getIntFromEditText(edn2);

            if (v.getId() == R.id.btnAdd)
                ans.setText("Answer = " + (n1 + n2));
            else if (v.getId() == R.id.btnSub)
                ans.setText("Answer = " + (n1 - n2));
            else if (v.getId() == R.id.btnMul)
                ans.setText("Answer = " + (n1 * n2));
            else if (v.getId() == R.id.btnDiv)
                ans.setText("Answer = " + ((float) n1 / (float) n2));


        }
    }
