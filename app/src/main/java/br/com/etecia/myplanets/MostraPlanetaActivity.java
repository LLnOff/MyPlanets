package br.com.etecia.myplanets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MostraPlanetaActivity extends AppCompatActivity {

    ImageView imgMostraPlaneta;
    TextView txtMostraPlaneta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostra_planeta_layout);

        imgMostraPlaneta = findViewById(R.id.imgModeloPlaneta);
        txtMostraPlaneta = findViewById(R.id.txtModeloPlaneta);

        Intent intent = getIntent();

        String nomePlaneta = intent.getStringExtra("nomePlaneta");
        int imagemPlaneta = intent.getIntExtra("imagemPlaneta",0);

        txtMostraPlaneta.setText(nomePlaneta);
        imgMostraPlaneta.setImageResource(imagemPlaneta);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}