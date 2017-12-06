package com.example.abalik.start;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;


import com.example.abalik.start.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static com.google.android.gms.common.internal.safeparcel.SafeParcelable.NULL;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    //private EditText;
    private Button menu1,menu4;
    private TextView hitap_text;

    String kullanici_str = null;
    Intent intent;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_main);
        baslangic();
    }
    private void baslangic(){

        // kullanıcıyı giriş sayfasından alabilmek için
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            kullanici_str = extras.getString("kullanici_str");
        }

        hitap_text=(TextView)findViewById(R.id.Hitap);

        hitap_text.setText("");
        if(kullanici_str != NULL){
            hitap_text.append("\nGenius Coder" +", ready to game?"+ "\n");
        }





        menu1=(Button)findViewById(R.id.MenuBtn1);
        menu4=(Button)findViewById(R.id.MenuBtn4);




        menu1.setOnClickListener(this);
        menu4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.MenuBtn1:


                // diğer sayfaya geçiş için
                intent = new Intent(getApplicationContext(),Numbers_question_0.class);
                //intent.putExtra("kullanici_str",kullanici_str);
                startActivity(intent);

                break;

            case R.id.MenuBtn4:


                // diğer sayfaya geçiş için
                intent = new Intent(getApplicationContext(),Numbers_question_0.class);
                //intent.putExtra("kullanici_str",kullanici_str);
                startActivity(intent);

                break;
        }
    }

}
