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

        doa.add(new DoaModel("Agama", "Agama itu mudah", "الَدِّيْنُ يُسرٌ "));
        doa.add(new DoaModel("Shalat", "Kunci surga adalah shalat", "مِفْتَاحُ الْجَنَّةِ الصَّلاَةُ "));
        doa.add(new DoaModel("Kecurangan", "Siapa yang curang bukan golongan kami", "مَنْ غَشَّنا فَلَيْسَ مِنَّا "));
        doa.add(new DoaModel("Salam", "Ucapan salam sebelum bicara", "الَسَّلامُ قَبْلَ الكَلاَمِ "));
        doa.add(new DoaModel("Jujur", "Hendaknya kalian berlaku jujur", "علَيْكُمْ باِلصِّدْقِ "));

        doa.add(new DoaModel("Amalan", "Setiap amalam sesuai dengan niatnya", "نمَا الأعْمَالُ باِلنِّيَةِإِ "));
        doa.add(new DoaModel("Kebersihan", "Kebersihan sebagian dari iman", "الطُّهُورُ شَطْرُ الإِيمَانِ "));
        doa.add(new DoaModel("Merampas", "Siapa merampas milik orang bukan golongan kami", "مَنِ انْتَهَبَ نُهْبَةً فَلَيْسَ مِنَّا"));
        doa.add(new DoaModel("Surga", "SSurga berada dibawah telapak kaki ibu", "الْجَنَّةُ تَحْتَ أقْدامِ الأُمَّهَاتِ"));
        doa.add(new DoaModel("Pemarah", "Jauhi sifat pemarah", "اِجْتَنِبُواالْغَضَبَ"));


    }
}
