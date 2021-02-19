package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateResults(View view) {
        int result = 0;
        RadioButton radioOne = findViewById(R.id.correct_radiobutton_one);
        EditText editTextOne = findViewById(R.id.edit_text_one);
        RadioButton radioTwo = findViewById(R.id.correct_radiobutton_two);
        EditText editTextTwo = findViewById(R.id.edit_text_two);
        CheckBox checkBox = findViewById(R.id.checkBox);
        CheckBox checkBoxTwo = findViewById(R.id. checkBox2);
        CheckBox checkBoxThree = findViewById(R.id.checkBox3);
        EditText editTextThree = findViewById(R.id.edit_text_three);

        if (radioOne.isChecked()) {
            result++;
        }

        if (editTextOne.getText().toString().equals("String")) {
            result++;
        }

        if (radioTwo.isChecked()) {
            result++;
        }

        if (editTextTwo.getText().toString().equals("ScrollView")) {
            result++;
        }


        if (checkBox.isChecked() && !checkBoxTwo.isChecked() && checkBoxThree.isChecked()) {
            result++;
        }

        if (editTextThree.getText().toString().equals("TextView")) {
            result++;
        }

        if (result == 6) {
            Toast toast = Toast.makeText(this, "Congratulations! All answers are correct!\nScore is: " + result, Toast.LENGTH_LONG);
            toast.show();
        } else if (result < 6 & result >= 4) {
            Toast toast = Toast.makeText(this, "Good, good, but not perfect. Keep practicing!\nScore is: " + result, Toast.LENGTH_LONG);
            toast.show();
        } else if (result < 4 & result > 0) {
            Toast toast = Toast.makeText(this, "It's kinda weak I would say. Go study!\nScore is: " + result, Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "You Know Nothing Jon Snow. Go study!\nScore is: " + result, Toast.LENGTH_LONG);
            toast.show();
        }

    }

}