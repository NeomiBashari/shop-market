package com.example.shopmarket;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView textViewWelcome;
    private Button btnAddProduct;
    private Button btnRemoveProduct;
    private TextView textViewProductCount;

    private int productCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        textViewWelcome = findViewById(R.id.textViewWelcome);
        btnAddProduct = findViewById(R.id.btnAddProduct);
        btnRemoveProduct = findViewById(R.id.btnRemoveProduct);
        textViewProductCount = findViewById(R.id.textViewProductCount);

        // Set welcome message (Replace "User" with actual username)
        textViewWelcome.setText("Welcome, User!");

        // Set click listeners for buttons
        btnAddProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addProduct();
            }
        });

        btnRemoveProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeProduct();
            }
        });
    }

    private void addProduct() {
        // Increment product count
        productCount++;
        // Update product count TextView
        textViewProductCount.setText("Products: " + productCount);
        // Show toast message
        Toast.makeText(this, "Product added", Toast.LENGTH_SHORT).show();
    }

    private void removeProduct() {
        // Check if there are products to remove
        if (productCount > 0) {
            // Decrement product count
            productCount--;
            // Update product count TextView
            textViewProductCount.setText("Products: " + productCount);
            // Show toast message
            Toast.makeText(this, "Product removed", Toast.LENGTH_SHORT).show();
        } else {
            // Show toast message indicating no products to remove
            Toast.makeText(this, "No products to remove", Toast.LENGTH_SHORT).show();
        }
    }
}