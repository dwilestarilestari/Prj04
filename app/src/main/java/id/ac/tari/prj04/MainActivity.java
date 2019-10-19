package id.ac.tari.prj04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayAdapter adapter;

    private List<String> data = new ArrayList<>();
    {
        data.add("Real Madrid");
        data.add("Manchaster United");
        data.add("Bayern Munchen");
        data.add("Barcelona");
        data.add("Ajax");
        data.add("Santos");
        data.add("Juventus");
        data.add("Penarol");
        data.add("River Plate");
        data.add("Flamengo");
        data.add("Milan");
        data.add("Liverpool");
        data.add("Botafogo");
        data.add("Benfica");
        data.add("Independiente");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar()!=null) getSupportActionBar().setTitle("Demo Simple List View");

        ListView lv = findViewById(R.id.list_view);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,android.R.id.text1, data);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener((adapterView, view, i,l)->{
            Toast.makeText(this, String.format("You choosed :"+ data.get(i)), Toast.LENGTH_SHORT).show();
        });

        lv.setOnItemLongClickListener((adapterView, view, i, l)->{
          data.remove(i);
          adapter.notifyDataSetChanged();
          return true;
        });
    }
}
