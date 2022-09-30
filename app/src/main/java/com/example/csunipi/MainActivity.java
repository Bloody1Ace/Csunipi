package com.example.csunipi;

import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.RecyclerView;
import com.example.csunipi.databinding.ActivityMainBinding;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    private ArrayList<CategModal> categoriesModalArrayList;
    private ArrayList<NewsModal> new1, new2, new3;
    private RecyclerView catRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        binding.fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        setContentView(R.layout.news);
        catRV = findViewById(R.id.idRVNewsCategories);
        categoriesModalArrayList = new ArrayList<>();

        // popular news array list.
        new1 = new ArrayList<>();
        new1.add(new NewsModal("Ανακοίνωση για τις αναβληθείσες εξετάσεις της Τετάρτης 21 Σεπτεμβρίου 2022 ", " Download attachments: attachment.pdf\n" +
                "\n" +
                "    Έγγραφο ανακοίνωσης (179 Downloads) \n" +
                "\n"));

        categoriesModalArrayList.add(new CategModal("First", new1));


        new2 = new ArrayList<>();
        new2.add(new NewsModal("Σίτιση φοιτητών/τριών Ακαδημαϊκού Έτους 2022-2023",
                "Αιτήσεις από 25 Αυγούστου 2022 έως 29 Σεπτεμβρίου 2022\n" +

                        "Οδηγίες για την ηλεκτρονική υποβολή αίτησης για σίτιση..\n"));

        // on below line we are creating our second category.
        categoriesModalArrayList.add(new CategModal("Second", new2));

        // technology news.
        new3 = new ArrayList<>();
        new3.add(new NewsModal("Υποτροφίες ακαδ. έτους 2022-2023 για σπουδές στο Μεξικό", " Download attachments: attachment.pdf\n"));

        // on below line we are adding our third category.
        categoriesModalArrayList.add(new CategModal("Technology", new3));

        // on below line we are setting layout manager to our recycler view.
        catRV.setLayoutManager(new LinearLayoutManager(this));

        // on below line we  are creating and setting adapter to our recycler view.
        CategoriesRVAdapter adapter = new CategoriesRVAdapter(categoriesModalArrayList, this);
        catRV.setAdapter(adapter);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.item1) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}