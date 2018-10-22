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


    public List<DoaModel> doa = new ArrayList<>();
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //casting recyclerview
        recyclerView = (RecyclerView)findViewById(R.id.recycle);

        LinearLayoutManager linear = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linear);

        doaCollections();

        DoaAdapter adapter = new DoaAdapter(doa);
        recyclerView.setAdapter(adapter);
        }

    private void doaCollections(){

        doa.add(new DoaModel("Masuk Masjid", "Artimasukmasjid", "cari google "));
        doa.add(new DoaModel("Masuk Masjid", "Artimasukmasjid", "cari google "));
        doa.add(new DoaModel("Masuk Masjid", "Artimasukmasjid", "cari google "));
        doa.add(new DoaModel("Masuk Masjid", "Artimasukmasjid", "cari google "));
        doa.add(new DoaModel("Masuk Masjid", "Artimasukmasjid", "cari google "));
        doa.add(new DoaModel("Masuk Masjid", "Artimasukmasjid", "cari google "));

    }
}
