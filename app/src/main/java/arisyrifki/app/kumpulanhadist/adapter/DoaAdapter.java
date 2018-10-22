package arisyrifki.app.kumpulanhadist.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import arisyrifki.app.kumpulanhadist.R;
import arisyrifki.app.kumpulanhadist.model.DoaModel;


/**
 * Created by rfkchrl on 10/8/2018.
 */

public class DoaAdapter extends RecyclerView.Adapter<DoaAdapter.DoaHolder> {

    Context context; //penanda
    List<DoaModel> doa;

    public DoaAdapter(Context context, List<DoaModel> doa) {
        this.context = context;
        this.doa = doa;
    }

    /*
        Mengganerate layout siapa ?
    */
    @Override
    public DoaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_doa, null);

        //RecyclerView.ViewHolder vh = new RecyclerView.ViewHolder(v);
        // LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        // View view = layoutInflater.inflate(R.layout.main_doa, parent, false);

        return new DoaHolder(v);
    }


    @Override
    public void onBindViewHolder(DoaHolder holder, int position) {

        holder.doaTitle.setText((CharSequence) doa.get(position));
        holder.doaSubtitle.setText((CharSequence) doa.get(position));
        //holder.imgTitle.setImageResource(.get(position));
    }

    /*
    mendeteksi berapa banyak item yg kita punya
     */
    @Override
    public int getItemCount() {
        return doa.size();
    }

    public class DoaHolder extends RecyclerView.ViewHolder {
        TextView  doaTitle, doaSubtitle;
        ImageView imgTitle;

        public DoaHolder (View itemView){
            super(itemView);

            doaTitle = (TextView) itemView.findViewById(R.id.doa_title);
            doaSubtitle = (TextView) itemView.findViewById(R.id.doa_subtitle);
            imgTitle = (ImageView) itemView.findViewById(R.id.img_doa);

        }
    }

}
