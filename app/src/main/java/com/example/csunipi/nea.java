package com.example.csunipi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.csunipi.databinding.ActivityMainBinding;

import java.util.ArrayList;


public class nea extends Fragment {
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    private ArrayList<CategModal> categoriesModalArrayList;
    private ArrayList<NewsModal> new1, new2, new3;
    private RecyclerView catRV;

    public nea() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatActivity test = new AppCompatActivity();
        test.setContentView(R.layout.news);
        catRV = test.findViewById(R.id.idRVNewsCategories);
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
        catRV.setLayoutManager(new LinearLayoutManager(test));

        // on below line we  are creating and setting adapter to our recycler view.
        CategoriesRVAdapter adapter = new CategoriesRVAdapter(categoriesModalArrayList, test);
        catRV.setAdapter(adapter);
    }


    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nea, container, false);
    }
}