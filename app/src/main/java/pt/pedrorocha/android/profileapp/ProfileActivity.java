package pt.pedrorocha.android.profileapp;

import static android.widget.Toast.LENGTH_LONG;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Toast.makeText(this, "onCreate Method ...",LENGTH_LONG).show();

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