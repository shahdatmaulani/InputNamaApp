package com.example.shahdatmaulani;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

TextView Hasil;
EditText TextNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextNama = findViewById(R.id.TxtNama);
        Hasil = findViewById(R.id.Lbl_Nama);

    }

    public void TampilNama(View view) {
        Hasil.setText("Nama Anda : "+TextNama.getText());
    }
}