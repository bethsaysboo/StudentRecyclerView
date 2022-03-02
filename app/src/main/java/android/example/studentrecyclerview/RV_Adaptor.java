package android.example.studentrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class RV_Adaptor extends RecyclerView.Adapter<RV_Adaptor.MyViewHolder>{

    String data1[], data2[];
    int images[];
    Context context;
    private MyViewHolder holder;
    private int position;

    public RV_Adaptor(Context ct, String s1[], String s2[], int img[]){
 context= ct;
 data1= s1;
 data2=s2;
 images=img;

   }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.rvrow,parent,false);
        return new MyViewHolder(view);

    }



    @Override



    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        this.holder = holder;
        this.position = position;

        holder.nameTextView.setText(data1[position]);
        holder.pnTextView.setText(data2[position]);
        holder.myImage.setImageResource(images[position]);
        holder.mainLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent= new Intent(context,EditPage.class);
                intent.putExtra("data1",data1[position]);
                intent.putExtra("data2",data2[position]);
                intent.putExtra("MyImage", images[position]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView nameTextView, pnTextView;
        ImageView myImage;
        ConstraintLayout mainLayout;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView= itemView.findViewById(R.id.nameTextView);
            pnTextView= itemView.findViewById(R.id.pnTextView);
            myImage= itemView.findViewById(R.id.imageView);
            mainLayout= itemView.findViewById(R.id.mainLayout);



        }

    }
}
