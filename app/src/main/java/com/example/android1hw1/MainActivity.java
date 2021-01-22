package com.example.android1hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewScreen;
    private TextView textViewUser;
    private TextView textViewPassword;
    private ImageView imageView;
    private EditText editTextUser;
    private EditText editTextPassword;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
    textViewScreen = findViewById(R.id.txt_view);
    textViewUser = findViewById(R.id.login_txt);
    textViewPassword = findViewById(R.id.password_txt);
    imageView = findViewById(R.id.img_view);
    editTextUser = findViewById(R.id.login_edt);
    editTextPassword = findViewById(R.id.password_edt);
    button = findViewById(R.id.button);

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String title = editTextUser.getText().toString();
            String title2 = editTextPassword.getText().toString();
            



        }
    });
    }

}