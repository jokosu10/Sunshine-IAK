package id.jsusilo.example.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        String[] data = {
                "Monday - Sunny - 30/50",
                "Tuesday - Mostly - 40/30",
                "Wednesday - Rain - 10/90",
                "Thursday - Sunny - 30/60",
                "Friday - Sunny - 10/15",
                "Sunday - Sunny - 25/50",

        };

        List<String> forecastData = new ArrayList<String>(Arrays.asList(data));
        ArrayAdapter<String> adapterForecast = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item,
                R.id.list_item_textview,
                forecastData
        );

        View view =  inflater.inflate(R.layout.fragment_main, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listView1);
        listView.setAdapter(adapterForecast);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getActivity(),"Test", Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }
}
