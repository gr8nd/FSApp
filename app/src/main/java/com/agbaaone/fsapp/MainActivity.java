package com.agbaaone.fsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView result;
    private Button equalButton;

    private EditText a0;
    private EditText a1;
    private EditText a2;

    private EditText b0;
    private EditText b1;
    private EditText b2;

    private EditText c0;
    private EditText c1;
    private EditText c2;

    private double sumOfFirstSequence;
    private double sumOfSecondSequence;
    private double sumOfThirdSequence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);
        equalButton = findViewById(R.id.button_equal);

        a0 = findViewById(R.id.edittext_a0);
        a1 = findViewById(R.id.edittext_a1);
        a2 = findViewById(R.id.edittext_a2);

        b0 = findViewById(R.id.edittext_b0);
        b1 = findViewById(R.id.edittext_b1);
        b2 = findViewById(R.id.edittext_b2);

        c0 = findViewById(R.id.edittext_c0);
        c1 = findViewById(R.id.edittext_c1);
        c2 = findViewById(R.id.edittext_c2);

        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(sumOfThreeSequences());
            }
        });
    }

    private double sumOfFirstSequence()
    {
        double i0 = Double.parseDouble(a0.getText().toString());
        double i1 = Double.parseDouble(a1.getText().toString());
        double i2 = Double.parseDouble(a2.getText().toString());

        double sum = i0 + i1 + i2;
        return sum;
    }

    private double sumOfSecondSequence()
    {
        double i0 = Double.parseDouble(b0.getText().toString());
        double i1 = Double.parseDouble(b1.getText().toString());
        double i2 = Double.parseDouble(b2.getText().toString());

        double sum = i0 + i1 + i2;
        return sum;
    }

    private double sumOfThirdSequence()
    {
        double i0 = Double.parseDouble(c0.getText().toString());
        double i1 = Double.parseDouble(c1.getText().toString());
        double i2 = Double.parseDouble(c2.getText().toString());

        double sum = i0 + i1 + i2;
        return sum;
    }

    private String sumOfThreeSequences()
    {
        double s = sumOfFirstSequence() + sumOfSecondSequence() + sumOfThirdSequence();
        return String.valueOf(s);
    }
}