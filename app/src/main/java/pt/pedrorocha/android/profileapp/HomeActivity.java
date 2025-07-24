package pt.pedrorocha.android.profileapp;

import static android.widget.Toast.LENGTH_LONG;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toast.makeText(this, "Home Activity onCreate Method ...",LENGTH_LONG).show();

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