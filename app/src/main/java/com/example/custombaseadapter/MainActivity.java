package com.example.custombaseadapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.lang.invoke.ConstantCallSite;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Context context;
    ConstraintLayout rela;
    ArrayList<CountriesModel> countriesData;
    CustomAdapter customAdapter;
    CountriesModel countriesModel;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_main);

        //getviews
        listView = findViewById(R.id.listView);
        rela = (ConstraintLayout) findViewById(R.id.rela);
        countriesData = new ArrayList<>();

        //add Countries Data
        populateCountriesData();

        customAdapter = new CustomAdapter(context,countriesData);
        listView.setAdapter(customAdapter);
        registerForContextMenu(listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(context,countriesData.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void onCreateContextMenu(ContextMenu menu,View v, ContextMenu.ContextMenuInfo menuInfo){
        menu.setHeaderTitle("Cập nhật");
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_context,menu);
    }
    private void populateCountriesData() {
        //country 1
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Nguyễn Anh Quân");
        countriesModel.setImage(R.drawable.avicii);
        countriesModel.setArea("757.229.957 view");
        countriesModel.setPopulation("1811505310140");
        countriesData.add(countriesModel);

        //country 2
        countriesModel = new CountriesModel();
        countriesModel.setId(2);
        countriesModel.setName("Send My Love");
        countriesModel.setImage(R.drawable.adele);
        countriesModel.setArea("675.534.967 view");
        countriesModel.setPopulation("Adele");
        countriesData.add(countriesModel);

        //country 3
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Beauty And A Beat");
        countriesModel.setImage(R.drawable.justinbieber);
        countriesModel.setArea("931.223.631 view");
        countriesModel.setPopulation("Justin Bieber - Nicki Minaj");
        countriesData.add(countriesModel);

        //country 4
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Million Reasons");
        countriesModel.setImage(R.drawable.ladygaga);
        countriesModel.setArea("238.797.257 view");
        countriesModel.setPopulation("Lady Gaga");
        countriesData.add(countriesModel);

        //country 5
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Just Give Me A Reason");
        countriesModel.setImage(R.drawable.pink);
        countriesModel.setArea("1.216.428.896 view");
        countriesModel.setPopulation("P!nk - Nate Rues");
        countriesData.add(countriesModel);

        //country 6
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Sign of the Times");
        countriesModel.setImage(R.drawable.harry);
        countriesModel.setArea("661.252.970 view");
        countriesModel.setPopulation("Harry Styles");
        countriesData.add(countriesModel);

        //country 7
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("You & I");
        countriesModel.setImage(R.drawable.sam);
        countriesModel.setArea("470.305.748 view");
        countriesModel.setPopulation("One Direction");
        countriesData.add(countriesModel);

        //country 8
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("A Whole New World");
        countriesModel.setImage(R.drawable.zayn);
        countriesModel.setArea("198.490.912 view");
        countriesModel.setPopulation("ZAYN - Zhavia Ward");
        countriesData.add(countriesModel);

        //country 9
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Blinding Lights");
        countriesModel.setImage(R.drawable.theweend);
        countriesModel.setArea("249.523.715 view");
        countriesModel.setPopulation("The Weeknd");
        countriesData.add(countriesModel);

        //country 10
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Lovely");
        countriesModel.setImage(R.drawable.billie);
        countriesModel.setArea("838.295.181 view");
        countriesModel.setPopulation("Billie Eilish - Khalid");
        countriesData.add(countriesModel);
    }
}