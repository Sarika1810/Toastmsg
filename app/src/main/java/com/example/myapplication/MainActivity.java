package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button showToastButton;
    private TextView messageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showToastButton = findViewById(R.id.showToastButton);
        messageTextView = findViewById(R.id.messageTextView);

        showToastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage();
            }
        });
    }

    private void showMessage() {

        Toast.makeText(this, "Message foe you \n you have got mail!!", Toast.LENGTH_SHORT).show();


        messageTextView.setText("Message foe you \n you have got mail!!");
        messageTextView.setVisibility(View.VISIBLE);
    }
}

