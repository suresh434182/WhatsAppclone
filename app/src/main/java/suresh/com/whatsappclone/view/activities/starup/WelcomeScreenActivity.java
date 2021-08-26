package suresh.com.whatsappclone.view.activities.starup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.com.whatsappclone.R;
import suresh.com.whatsappclone.view.activities.auth.PhoneLoginActivity;

public class WelcomeScreenActivity extends AppCompatActivity {
    Button btnAgree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        btnAgree=(Button)findViewById(R.id.btn_agree);

        btnAgree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WelcomeScreenActivity.this, PhoneLoginActivity.class));
                finish();
            }
        });
    }
}
