package arisyrifki.app.kumpulanhadist;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by rfkchrl on 10/1/2018.
 */

public class SplashActivity extends AppCompatActivity {
    ImageView android;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //menghilangkan action bar
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_splash);

        //mengabil id dari activity yg akan ditampil kan.
        android = (ImageView) findViewById(R.id.splash);

        //memulai splash
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 3000L); //3000L = 3 detik
    }
}
