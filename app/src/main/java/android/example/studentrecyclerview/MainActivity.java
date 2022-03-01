package android.example.studentrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    String s1[], s2[];
    int images []={R.drawable.ic_baseline_person_24};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView= findViewById(R.id.mRecyclerView);
        s1= getResources().getStringArray(R.array.Student_Name);
        s2= getResources().getStringArray(R.array.Student_Num);

        RV_Adaptor rv_adaptor= new RV_Adaptor(this, s1, s2, images);
        mRecyclerView.setAdapter(rv_adaptor);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        Button changeActivityBTN= findViewById(R.id.StudentEdit);

        /*changeActivityBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity();
            }
        }); */
    }
    /*private void changeActivity(){
        Intent intent= new Intent(this,EditPage.class);
        startActivity(intent);
    }*/
}