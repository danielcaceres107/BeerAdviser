package co.edu.unipiloto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity {

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view){
        //reference to the TextView
        TextView brands = (TextView) findViewById(R.id.brands);
        //reference to the Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //Get selected item in the spinner
        String beerType = String.valueOf(color.getSelectedItem());
        //Get recomendations for the BeerExpert class
        List<String> brandlist = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand: brandlist){
            brandsFormatted.append(brand).append('\n');
        }
        //Display the beers
        brands.setText(brandsFormatted);
    }
}