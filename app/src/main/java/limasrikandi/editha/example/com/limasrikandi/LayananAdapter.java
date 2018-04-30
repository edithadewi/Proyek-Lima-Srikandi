package limasrikandi.editha.example.com.limasrikandi.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import limasrikandi.editha.example.com.limasrikandi.Activity.CheckoutActivity;
import limasrikandi.editha.example.com.limasrikandi.Model.LayananClass;
import limasrikandi.editha.example.com.limasrikandi.R

public class LayananAdapter extends RecyclerView.Adapter<LayananAdapter.ViewHolder> {
    private Context context;
    private List<LayananClass> list = new ArrayList<>();

    public LayananAdapter(Context context, List<LayananClass> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public LayananAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layanan, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LayananAdapter.ViewHolder holder, final int position) {
        //holder.imgHome.setImageDrawable(list.get(position));
        holder.tvHarga.setText(list.get(position).getHarga());
        holder.tvLayanan.setText(list.get(position).getNama());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvLayanan, tvHarga;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            tvLayanan = itemView.findViewById(R.id.tvLayanan);
            tvHarga = itemView.findViewById(R.id.tvHarga);
        }

        @Override
        public void onClick(View view) {
            Log.i("xx", "" + getAdapterPosition());

            Intent i = new Intent(context, CheckoutActivity.class);
            i.putExtra("kategori", list.get(getAdapterPosition()).getKategori());
            i.putExtra("layanan", list.get(getAdapterPosition()).getNama());
            i.putExtra("harga", list.get(getAdapterPosition()).getHarga());
            context.startActivity(i);
        }
    }
}
