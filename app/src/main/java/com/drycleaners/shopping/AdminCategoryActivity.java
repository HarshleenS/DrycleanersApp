package com.drycleaners.shopping;


import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView tShirts, shirts, femaleDresses, female_top;
    private ImageView trousers, hoodie, jacket, coat;
    private ImageView beanie, tie, shorts, random;
    private Button LogoutBtn, CheckOrdersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);


        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });



        tShirts = (ImageView) findViewById(R.id.t_shirts);
        shirts = (ImageView) findViewById(R.id.shirts);
        femaleDresses = (ImageView) findViewById(R.id.female_dresses);
        female_top = (ImageView) findViewById(R.id.female_top);

        trousers = (ImageView) findViewById(R.id.trousers);
        hoodie = (ImageView) findViewById(R.id.hoodie);
        jacket = (ImageView) findViewById(R.id.jacket);
        coat = (ImageView) findViewById(R.id.coat);

        beanie = (ImageView) findViewById(R.id.beanie);
        tie = (ImageView) findViewById(R.id.tie);
        shorts = (ImageView) findViewById(R.id.shorts);
        random = (ImageView) findViewById(R.id.random);


        tShirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.drycleaners.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "tShirts");
                startActivity(intent);
            }
        });
        shirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.drycleaners.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Shirts");
                startActivity(intent);
            }
        });


        femaleDresses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.drycleaners.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Female Dresses");
                startActivity(intent);
            }
        });


        female_top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.drycleaners.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Female top");
                startActivity(intent);
            }
        });


        trousers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.drycleaners.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Trousers");
                startActivity(intent);
            }
        });


        hoodie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.drycleaners.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Hoodie");
                startActivity(intent);
            }
        });



        jacket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.drycleaners.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Jacket");
                startActivity(intent);
            }
        });


        coat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.drycleaners.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Coat");
                startActivity(intent);
            }
        });



        beanie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.drycleaners.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Beanie");
                startActivity(intent);
            }
        });


        tie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.drycleaners.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Tie");
                startActivity(intent);
            }
        });


        shorts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.drycleaners.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Shorts");
                startActivity(intent);
            }
        });


        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.drycleaners.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Random");
                startActivity(intent);
            }
        });
    }
}
