package android.example.studentrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class EditPage extends AppCompatActivity implements View.OnClickListener{

    String data1,data2;


TextView EditName,Editpn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_page);
        EditName = findViewById(R.id.editNameET);
        Editpn= findViewById(R.id.EditPNet);
        getData();
        setData();

        Button submit= findViewById(R.id.Submitbtn);
        Button cancel= findViewById((R.id.Cancelbtn));

        submit.setOnClickListener(this);
        cancel.setOnClickListener(this);

    }
    private void getData() {
        if (getIntent().hasExtra("data1") && getIntent().hasExtra("data2")) {

            data1= getIntent().getStringExtra("data1");
            data2= getIntent().getStringExtra("data2");
        } else {

            Toast.makeText(this, "no data", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData(){
        EditName.setText(data1);
        Editpn.setText(data2);
    }

    //Onclick methods
    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.Submitbtn:
                EditName.setText(data1);
                Editpn.setText(data2);
                break;
            case R.id.Cancelbtn:

                break;
        }

    }
}