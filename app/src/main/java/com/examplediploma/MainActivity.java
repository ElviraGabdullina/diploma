package com.examplediploma;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.Translate;
import com.example.generated.GeneratedClass;

@Translate
public class MainActivity extends AppCompatActivity {
    @Translate
    Button btnExample;

    @Translate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnExample= (Button) findViewById(R.id.btnExample);
        
        showAnnotationMessage();
    }

    private void showAnnotationMessage() {
        GeneratedClass gc = new GeneratedClass();
        String message = gc.getMessage();

        new AlertDialog.Builder(this)
                .setPositiveButton("Ok", null)
                .setTitle("Message")
                .setMessage(message)
                .show();
    }
}
