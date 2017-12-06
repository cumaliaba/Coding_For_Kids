package com.example.abalik.start;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Numbers_question_1 extends AppCompatActivity implements View.OnClickListener {

    //private EditText;
    private Button kaydet;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numbers_question_1_main);
        baslangic();
    }
    private void baslangic(){

        kaydet=(Button)findViewById(R.id.kaydetBtn);



        kaydet.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.kaydetBtn:


                // diğer sayfaya geçiş için
                Intent intent = new Intent(getApplicationContext(),Numbers_question_1_5.class);
                //intent.putExtra("kullanici_str", kullanici_str);
                startActivity(intent);

                break;

        }
    }

}
