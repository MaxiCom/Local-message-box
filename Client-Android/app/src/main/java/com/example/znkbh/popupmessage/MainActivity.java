package com.example.znkbh.popupmessage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final EditText editText = (EditText) findViewById(R.id.send_text);
        final Button button = (Button) findViewById(R.id.send_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    new Thread() {
                        public void run() {
                            UdpSender.sendMessage(editText.getText().toString());
                        }
                    }.start();

                    Toast.makeText(getApplicationContext(), "Message sent!", Toast.LENGTH_SHORT).show();
                    editText.getText().clear();
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Error!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}
