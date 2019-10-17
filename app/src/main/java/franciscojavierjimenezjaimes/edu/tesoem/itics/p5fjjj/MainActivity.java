package franciscojavierjimenezjaimes.edu.tesoem.itics.p5fjjj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Mensaje(View view){
        Toast.makeText(this, "Welcome to the aplication.", Toast.LENGTH_SHORT).show();
    }
}
