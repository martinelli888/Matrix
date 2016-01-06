package com.msvia.matrix.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.msvia.matrix.Model.Trecho;
import com.msvia.matrix.R;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class TrechoListAdapter extends ArrayAdapter<Trecho> {

    //Construtor
    public TrechoListAdapter(Context context, List<Trecho> escada) {
        super(context, R.layout.item_trecho, escada);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        if(convertView == null){
            convertView = View.inflate(getContext(),R.layout.item_trecho, null);
            holder = new ViewHolder();
            ButterKnife.bind(holder,convertView);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        Trecho trecho = getItem(position);
        if(trecho!=null){
            holder.retempresai.setText(trecho.getEmpresa());
            holder.retdatai.setText(trecho.getData());
            holder.retkmii.setText((int) Double.parseDouble(trecho.getKminicial().toString()));
            holder.retkmfi.setText((int) Double.parseDouble(trecho.getKmfinal().toString()));
            holder.retesii.setText((int) Double.parseDouble(trecho.getEstacafinal().toString()));
            holder.retesfi.setText((int) Double.parseDouble(trecho.getEstacainicial().toString()));
        }

        return convertView;
    }

    //Classe que fará o vinculo o item_user_list
    public class ViewHolder{

        @Bind(R.id.retempresai)
        TextView retempresai;

        @Bind(R.id.retdatai)
        TextView retdatai;

        @Bind(R.id.retkmii)
        TextView retkmii;

        @Bind(R.id.retkmfi)
        TextView retkmfi;

        @Bind(R.id.retesii)
        TextView retesii;

        @Bind(R.id.retesfi)
        TextView retesfi;

    }

}
