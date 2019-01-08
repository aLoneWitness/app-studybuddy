package nl.niekvangogh.studybuddy;

<<<<<<< HEAD:app/src/main/java/nl/niekvangogh/studybuddy/LoginActivity.java
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * A login screen that offers login via email/password.
 */

public class LoginActivity extends AppCompatActivity {
    private Button button;

=======
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
>>>>>>> activity-qr:app/src/main/java/nl/niekvangogh/studybuddy/QRActivity.java

public class QRActivity extends AppCompatActivity {
    private TextView qr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD:app/src/main/java/nl/niekvangogh/studybuddy/LoginActivity.java
        setContentView(R.layout.activity_login);

        button = (Button) findViewById(R.id.material_loginbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }



}
=======
        setContentView(R.layout.activity_qr);
        qr = findViewById(R.id.textView);
        qr.setText("QR-Code");
    }
}
>>>>>>> activity-qr:app/src/main/java/nl/niekvangogh/studybuddy/QRActivity.java
