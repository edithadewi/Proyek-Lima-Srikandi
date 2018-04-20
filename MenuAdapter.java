package limasrikandi.editha.example.com.limasrikandi;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.LinkedList;


public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder>{

    private final LinkedList<String> mKlinikList;
    private final LinkedList<Integer> mPhotoList;
    private LayoutInflater mInflater;

    public MenuAdapter(Context context, LinkedList<String> klinikList, LinkedList<Integer> photoList) {
        mInflater = LayoutInflater.from(context);
        this.mKlinikList = klinikList;
        this.mPhotoList = photoList;
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.activity_list_klinik, parent, false);
        return new MenuViewHolder(itemView, this);
    }


    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {
        String mCurrentFood = mKlinikList.get(position);
        Integer mCurrentPhoto = mPhotoList.get(position);
        holder.klinikItemView.setText(mCurrentFood);
        holder.photoItemView.setImageResource(mCurrentPhoto);
    }

    @Override
    public int getItemCount() {
        return mKlinikList.size();
    }

    class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView klinikItemView;
        public final ImageView photoItemView;

        final MenuAdapter mAdapter;
        public MenuViewHolder(final View itemView, MenuAdapter adapter) {
            super(itemView);
            klinikItemView = (TextView)itemView.findViewById(R.id.tv_klinik);
            photoItemView = (ImageView)itemView.findViewById(R.id.iv_photo);
            photoItemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Dapatkan posisi item yang diklik
                    int mPosition = getLayoutPosition();
                    // Gunakan itu untuk mengakses item yang terpengaruh di mWordList.
                    String klinik = mKlinikList.get(mPosition);
                    Integer photo = mPhotoList.get(mPosition);
                    Intent intent = new Intent(itemView.getContext(),DetailActivity.class);
                    intent.putExtra("klinik",klinik);
                    intent.putExtra("photo",photo);
                    itemView.getContext().startActivity(intent);
                }
            });
            this.mAdapter = adapter;
        }


        @Override
        public void onClick(View view) {
        }
    }
}
