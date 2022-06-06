package br.com.etecia.myplanets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //Declarar a lista
    ListView listplaneta;
    //Criando os vetores com os dados para a lista
    String nomePlanetas[] = {"Jupiter", "Lua", "Marte", "Mercurio", "Netuno", "Plutão", "Saturno", "Sol", "Terra", "Urano", "Venus"};
    int imagemPlanetas[] = {R.drawable.jupiter, R.drawable.lua,
            R.drawable.marte, R.drawable.mercurio, R.drawable.netuno,
            R.drawable.plutao,R.drawable.saturno, R.drawable.sol,
            R.drawable.terra, R.drawable.urano, R.drawable.venus};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listplaneta = findViewById(R.id.idListaPlanetas);
        MyAdapter adapter = new MyAdapter();
        listplaneta.setAdapter(adapter);

    }

    //Criando a classe interna - inner class
    public class MyAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return null;
        }
    }
}