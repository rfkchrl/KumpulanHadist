package arisyrifki.app.kumpulanhadist;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by rfkchrl on 10/1/2018.
 */

public class MainActivity extends AppCompatActivity {
    private LinearLayout btnId;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnId = (LinearLayout) findViewById(R.id.btn_id);

        btnIdClicked();

    }

    private void btnIdClicked() {
        btnId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailIntent = new Intent(MainActivity.this , DetailActivity.class);
                startActivity(detailIntent);
            }
        });
    }
}
