package nl.niekvangogh.studybuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class QRActivity extends AppCompatActivity {

    private TextView qr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr);
        qr = findViewById(R.id.textView);
        qr.setText("QR-Code");
    }
}
