package pt.pedrorocha.android.profileapp;

import static android.widget.Toast.LENGTH_LONG;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Toast.makeText(this, "Profile onCreate Method ...",LENGTH_LONG).show();

        Intent intent = getIntent();
        String name = intent.getStringExtra(HomeActivity.NAME_KEY);
        String bio = intent.getStringExtra(HomeActivity.BIO_KEY);

        TextView textMessage = findViewById(R.id.txtView_hello_msg);
        String message = "Hello " + name;
        textMessage.setText(message);

        EditText textBio = findViewById(R.id.editTextTextMultiLine);
        textBio.setText(bio);

        ImageView IcoLinkedIn = findViewById(R.id.imgLinkedIn);
        IcoLinkedIn.setOnClickListener(v ->{
            Uri webpage = Uri.parse("https://www.linkedin.com/in/rocha-pedro-andre/");
            Intent intentWeb = new Intent(Intent.ACTION_VIEW, webpage);

            if(intentWeb.resolveActivity(getPackageManager()) != null ){
                startActivity(intentWeb);
            }else{
                Toast.makeText(this, "Browser Not Found!", LENGTH_LONG).show();
            }
        });

        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> {
            finish();
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "Profile Activity onStart Method ...",LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this, "Profile Activity onResume Method ...",LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this, "Profile Activity onPause Method ...",LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(this, "Profile Activity onStop Method ...",LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "Profile Activity onDestroy Method ...",LENGTH_LONG).show();
    }
}