package arisyrifki.app.kumpulanhadist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import arisyrifki.app.kumpulanhadist.adapter.DoaAdapter;
import arisyrifki.app.kumpulanhadist.model.DoaModel;

/**
 * Created by rfkchrl on 10/1/2018.
 */

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    List<DoaModel> doa;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycle);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new DoaAdapter(this,doa);
        recyclerView.setAdapter(adapter);

        doaCollections();
        }

    private void doaCollections(){
        doa = new ArrayList<>();

        doa.add(new DoaModel(0, "Masuk Masjid", "Artimasukmasjid", "cari google "));
        doa.add(new DoaModel(0, "Masuk Masjid", "Artimasukmasjid", "cari google "));
        doa.add(new DoaModel(0, "Masuk Masjid", "Artimasukmasjid", "cari google "));
    }
}
