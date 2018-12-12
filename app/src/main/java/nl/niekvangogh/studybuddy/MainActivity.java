package nl.niekvangogh.studybuddy;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import static java.security.AccessController.getContext;

public class MainActivity extends Activity {

    private Button closeCardButton;
    public int cardCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Card card = new Card(0,1, "hi", "heil", false);

        /*closeCardButton = (Button) findViewById(R.id.material_unelevated_button);
        closeCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
            }
        });*/
    }





}
