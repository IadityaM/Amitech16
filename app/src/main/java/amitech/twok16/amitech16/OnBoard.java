package amitech.twok16.amitech16;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class OnBoard extends AppCompatActivity {

    public Button onBoardtoHomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_on_board);

        onBoardtoHomeButton = (Button) findViewById(R.id.btn_OnBoard_Skip);

        onBoardtoHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishOnboarding();
            }
        });
    }

    public void finishOnboarding() {
        //One time run code part 2, part 1 in Home.class
        SharedPreferences onBoardPreferences = getSharedPreferences("my_preferences", MODE_PRIVATE);

        onBoardPreferences.edit().putBoolean("onboarding_complete", true).apply();

        // Start Home.class
        // Intent splashToOnboarding = new Intent(Splash.this, OnBoard.class);
        // startActivity(splashToOnboarding);
        //startActivity(new Intent(OnBoard.this, Home.class));

        startActivity(new Intent(OnBoard.this, Home.class));
        finish();
    }

}
