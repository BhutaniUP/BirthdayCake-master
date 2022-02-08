package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    CakeView prCakeView;
    CakeController prCakeController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        prCakeView = findViewById(R.id.cakeview);
        prCakeController = new CakeController(prCakeView);
        Button blowOut = findViewById(R.id.button);
        blowOut.setOnClickListener(prCakeController);


    }
    public void goodbye(View button) {
        Log.i("button","Goodbye");
        finishAffinity();
    }
}

