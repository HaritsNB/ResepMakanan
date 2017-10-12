package haritsnb.resepmakanan;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 05/10/2017.
 */

public class AdapterResep extends RecyclerView.Adapter<AdapterResep.AdapterResepViewHolder>{
    private Context ctx;
    private ArrayList<ConstructorResep> cons;

    public AdapterResep(Context ctx, ArrayList<ConstructorResep> cons) {
        this.ctx = ctx;
        this.cons = cons;
    }

    @Override
    public AdapterResep.AdapterResepViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_resep,parent,false);
        return new AdapterResepViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AdapterResep.AdapterResepViewHolder holder, final int position) {
        holder.jdl.setText(cons.get(position).getJdl());
        holder.desk.setText(cons.get(position).getDesk());

        holder.jdl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj = new Intent(ctx, DetailResep.class);
                obj.putExtra("img",cons.get(position).getImg());
                obj.putExtra("detail",cons.get(position).getDetail());
                obj.putExtra("title",cons.get(position).getTitle());
                ctx.startActivity(obj);
            }
        });
    }

    @Override
    public int getItemCount() {
        return cons.size();
    }

    public class AdapterResepViewHolder extends RecyclerView.ViewHolder{
        TextView jdl;
        TextView desk;
        public AdapterResepViewHolder(View itemView) {
            super(itemView);
            jdl = (TextView) itemView.findViewById(R.id.judul_resep);
            desk = (TextView) itemView.findViewById(R.id.deskripsi_resep);
        }
    }
}
