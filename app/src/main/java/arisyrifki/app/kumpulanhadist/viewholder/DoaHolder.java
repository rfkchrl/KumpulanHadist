package arisyrifki.app.kumpulanhadist.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import arisyrifki.app.kumpulanhadist.R;
import arisyrifki.app.kumpulanhadist.adapter.DoaAdapter;

/**
 * Created by rfkchrl on 10/8/2018.
 */

public class DoaHolder extends RecyclerView.ViewHolder {
    private final DoaAdapter mAdapter;
    private TextView doaTitle, doaSubtitle;



    public DoaHolder(View itemView, DoaAdapter adapter){
            super(itemView);

            doaTitle = (TextView) itemView.findViewById(R.id.doa_title);
            doaSubtitle = (TextView) itemView.findViewById(R.id.doa_subtitle);
            this.mAdapter = adapter;
    }
}


