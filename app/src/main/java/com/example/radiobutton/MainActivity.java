package com.example.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    Button btn;
    TextView textView;

    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.rgroup);
        btn = findViewById(R.id.btns);
     //radioButton = findViewById(R.id.mech);
        textView = findViewById(R.id.txt);

   btn.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           int radioId=radioGroup.getCheckedRadioButtonId();
           radioButton=findViewById(radioId);
          Toast.makeText(MainActivity.this,"Selected Radio Button:" + radioButton.getText(), Toast.LENGTH_LONG).show();
           textView.setText("Your choice: " +radioButton.getText());
       }
   });
   }



//     public void checkButton(View v) {
//        int radioId=radioGroup.getCheckedRadioButtonId();
//        radioButton=findViewById(radioId);
//         Toast.makeText(this,"Selected Radio Button:" + radioButton.getText(), Toast.LENGTH_LONG).show();
//     }



        }

