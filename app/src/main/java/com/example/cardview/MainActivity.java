package com.example.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstBook = new ArrayList<>();
        lstBook.add(new Book("Ano","Categorie Book","Description book",R.drawable.ano));
        lstBook.add(new Book("Black","Categorie Book","Description book",R.drawable.blac));
        lstBook.add(new Book("Yoko","Categorie Book","Description book",R.drawable.yoko));
        lstBook.add(new Book("SAO","Categorie Book","Description book",R.drawable.sao));
        lstBook.add(new Book("ME","Categorie Book","Description book",R.drawable.me));
        lstBook.add(new Book("Hachi","Categorie Book","Description book",R.drawable.hachi));
        lstBook.add(new Book("Ano","Categorie Book","Description book",R.drawable.ano));
        lstBook.add(new Book("Black","Categorie Book","Description book",R.drawable.blac));
        lstBook.add(new Book("Yoko","Categorie Book","Description book",R.drawable.yoko));
        lstBook.add(new Book("SAO","Categorie Book","Description book",R.drawable.sao));
        lstBook.add(new Book("ME","Categorie Book","Description book",R.drawable.me));
        lstBook.add(new Book("Hachi","Categorie Book","Description book",R.drawable.hachi));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
}
