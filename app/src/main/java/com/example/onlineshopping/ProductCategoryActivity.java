package com.example.onlineshopping;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.onlineshopping.models.Category;

public class ProductCategoryActivity extends AppCompatActivity {
    private EditText codeET;
    private EditText nameET;
    private Button saveBTN2;
    private Category category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_product_category );

        codeET=findViewById( R.id.code );
        nameET=findViewById( R.id.name );
        saveBTN2=findViewById( R.id.savebtn );
         saveBTN2.setOnClickListener( new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 category=new Category();
                 category.setCode( codeET.getText().toString() );
                 category.setName( nameET.getText().toString() );
             }
         } );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.category_id:
                Intent category = new Intent(ProductCategoryActivity.this, ProductCategoryActivity.class);
                startActivity(category);
                return true;

            case R.id.product_id:
                Intent product = new Intent(ProductCategoryActivity.this, ProductActivity.class);
                startActivity(product);
                return true;

            case R.id.purchase_id:
                Intent purchase = new Intent(ProductCategoryActivity.this, purchaseActivity.class);
                startActivity(purchase);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
