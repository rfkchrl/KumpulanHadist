package arisyrifki.app.kumpulanhadist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by rfkchrl on 10/1/2018.
 */

public class DetailActivity extends AppCompatActivity{
    TextView doaTitle, doaSubtitle, doaSurah;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        doaTitle = (TextView)findViewById(R.id.doa_title);
        doaSubtitle = (TextView)findViewById(R.id.doa_subtitle);
        doaSurah = (TextView)findViewById(R.id.doa_Surah);

    }
}
