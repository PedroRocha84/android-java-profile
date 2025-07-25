package pt.pedrorocha.android.profileapp;

import static android.widget.Toast.LENGTH_LONG;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    public final static String NAME_KEY = "name_key";
    public final static String BIO_KEY = "bio_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toast.makeText(this, "Home Activity onCreate Method ...",LENGTH_LONG).show();

        EditText name = findViewById(R.id.txt_input_name);
        EditText bio = findViewById(R.id.edit_text_multi_bio);
        Button btnShow = findViewById(R.id.btnShow);

        btnShow.setOnClickListener(v -> {
            String nameText = name.getText().toString();
            String bioText = bio.getText().toString();

            Intent intent = new Intent(this, ProfileActivity.class);
            intent.putExtra(NAME_KEY, nameText);
            intent.putExtra(BIO_KEY, bioText);

            startActivity(intent);
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "Home Activity onStart Method ...",LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this, "Home Activity onResume Method ...",LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this, "Home Activity onPause Method ...",LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(this, "Home Activity onStop Method ...",LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "Home Activity onDestroy Method ...",LENGTH_LONG).show();
    }
}