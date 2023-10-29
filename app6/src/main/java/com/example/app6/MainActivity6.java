package com.example.app6;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.EditText;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity6 extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<CarItem> carItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        carItems = new ArrayList<>();
        carItems.add(new CarItem("25000 cad", "toyota", "2015", R.drawable.gato));
        carItems.add(new CarItem("30000 cad", "mazda", "2010", R.drawable.bolepelo));
        carItems.add(new CarItem("10000 cad", "tesla", "2020", R.drawable.bolepelo_2));
        carItems.add(new CarItem("50000 cad", "kia", "2000", R.drawable.gato_2));
        carItems.add(new CarItem("40000 cad", "hyundai", "2010", R.drawable.gato_3));
        carItems.add(new CarItem("12000 cad", "chevrolet", "2020", R.drawable.gato_4));

        CarAdapter adapter = new CarAdapter(carItems);
        recyclerView.setAdapter(adapter);
    }
}