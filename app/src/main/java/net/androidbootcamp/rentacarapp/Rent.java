package net.androidbootcamp.rentacarapp;


import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Rent extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] carRental = {"Emterprise Rent A Car Website", "Payless Car Rental Website", "Budget Car Rental Website",
                "Hertz Car Rental Website", "Avis Car Rental Website", "Alamo Car Rental Website"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.txtView, carRental));

    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        switch (position){
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.enterprise.com")));
                break;

            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.payless.com")));
                break;

            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.budget.com")));
                break;

            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hertz.com")));
                break;

            case 4:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.avis.com")));
                break;

            case 5:
                startActivity((new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.alamo.com"))));
        }
    }
}


