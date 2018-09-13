package thebotbox.app.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import thebotbox.app.R;
import thebotbox.app.util.Preference;
import thebotbox.kryptos.Kryptos;

/**
 * Created by Barry Allen .
 * boxforbot@gmail.com
 */

public class EncryptActivity extends AppCompatActivity {
    private EditText et_message, et_key;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encrypt);

        et_message = (EditText) findViewById(R.id.et_message);
        et_key = (EditText) findViewById(R.id.et_key);

    }

    public void onClick(View v) {
        if (et_message.getText().length() > 0) {
            if (et_key.getText().length() == 4) {
                try {
                    String cipherText = Kryptos.CIPHER_4(et_message.getText().toString(), et_key.getText().toString());
                    et_message.setText(cipherText);
                    new Preference(EncryptActivity.this).setEncryptValue(cipherText);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {
                Toast.makeText(this, "Enter 4 character secret key", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Enter Message to encrypt", Toast.LENGTH_SHORT).show();
        }
    }
}
