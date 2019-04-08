package com.example.marcin.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import org.w3c.dom.Text;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity {
    private BeerExpert beerExpert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view){
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.color);
        String beerType = String.valueOf(color.getSelectedItem());
        List<String> brandList = beerExpert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand:brandList) {
            brandsFormatted.append(brand).append("\n");
        }
        brands.setText(brandsFormatted);
    }

/*    fun onClickFindBeer(view: View) {
        val brands = findViewById<View>(R.id.brands) as TextView
        val color = findViewById<View>(R.id.color) as Spinner
        val beerType = color.selectedItem.toString()
        val brandList = beerExpert.getBrands(beerType)
        val brandsFormatted = StringBuilder()
        for (brand in brandList) {
            brandsFormatted.append(brand).append("\n")
        }
        brands.text = brandsFormatted
    }*/
}
