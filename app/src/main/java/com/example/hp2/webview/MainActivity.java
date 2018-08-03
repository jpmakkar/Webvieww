package com.example.hp2.webview;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtLoc;



    Button btnFetch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtLoc = (EditText) findViewById(R.id.editText);
        btnFetch = (Button) findViewById(R.id.button);
        btnFetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Webview.class);
                String u = String.valueOf(txtLoc.getText());

                i.putExtra("URL", u);

                startActivity(i);

            } });


    }
}
