package arisyrifki.app.kumpulanhadist.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import arisyrifki.app.kumpulanhadist.R;
import arisyrifki.app.kumpulanhadist.model.DoaModel;
import arisyrifki.app.kumpulanhadist.viewholder.DoaHolder;


/**
 * Created by rfkchrl on 10/8/2018.
 */

public class DoaAdapter extends RecyclerView.Adapter<DoaHolder> {

    private List<DoaModel> doa;

    public DoaAdapter(List<DoaModel> doa) {
        this.doa = doa;
    }

    /* Mengganerate layout siapa ? */
    @Override
    public DoaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DoaHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.main_doa, parent, false));
    }

    /* Holder */
    @Override
    public void onBindViewHolder(DoaHolder holder, int position) {
        holder.doaTitle.setText(doa.get(position).getNama());
        holder.doaSubtitle.setText(doa.get(position).getArti());
    }

    /* mendeteksi berapa banyak item yg kita punya */
    @Override
    public int getItemCount() {
        return doa.size();
    }
}
