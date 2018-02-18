package com.example.randyhidayat_1202154191_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {
    private RecyclerView recycle;
    private adapter adaptermenu;

    public static ArrayList<model>menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        menuList = menuisi();
        recycle = (RecyclerView)findViewById(R.id.recyclerView);
        adaptermenu = new adapter(menuList);
        recycle.setAdapter(adaptermenu);
        recycle.setLayoutManager(new LinearLayoutManager(this));

    }

    private ArrayList<model> menuisi() {
        ArrayList<model> isi = new ArrayList<>();
        isi.add(new model("Burger",25000,R.drawable.burger,"Burger yang sadepp"));
        isi.add(new model("pempek",12500,R.drawable.pempek,"pempek yang sangat gurih"));
        isi.add(new model("udang goreng",28000,R.drawable.udang,"udang goreng yang sangat krenyes dan juicy"));
        isi.add(new model("nasi goreng",18000,R.drawable.nasgor,"nasi goreng dengan rempah pilihan"));
        isi.add(new model("escendol",7000,R.drawable.escendol,"es cendol yang super segar"));
        return  isi;
    }
}
