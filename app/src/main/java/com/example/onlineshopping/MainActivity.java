package com.example.onlineshopping;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.category_id:
                Intent category=new Intent(MainActivity.this,ProductCategoryActivity.class);
                startActivity(category);
               return true;

            case R.id.product_id:
                Intent product=new Intent(MainActivity.this,ProductActivity.class);
                startActivity(product);
                return true;

            case R.id.purchase_id:
                Intent purchase=new Intent(MainActivity.this,purchaseActivity.class);
                startActivity(purchase);
                return true;

                default: return super.onOptionsItemSelected(item);
        }

    }
}
