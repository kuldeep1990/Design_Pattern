package pro.uhoh.com.design_pattern;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.List;

import pro.uhoh.com.design_pattern.Main.FindItemsInteractorImpl;
import pro.uhoh.com.design_pattern.Main.MainPresenter;
import pro.uhoh.com.design_pattern.Main.MainPresenterImpl;
import pro.uhoh.com.design_pattern.Main.MainView;

public class MainActivity extends AppCompatActivity implements MainView, AdapterView.OnItemClickListener {

    private ListView listView;
    private ProgressBar progressBar;
    private MainPresenter presenter;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list);
        listView.setOnItemClickListener(this);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        presenter = new MainPresenterImpl(this, new FindItemsInteractorImpl());
    }

    @Override protected void onResume() {
        super.onResume();
        presenter.onResume();
    }



    @Override protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }

    @Override public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
        listView.setVisibility(View.INVISIBLE);
    }

    @Override public void hideProgress() {
        progressBar.setVisibility(View.INVISIBLE);
        listView.setVisibility(View.VISIBLE);
    }

    @Override public void setItems(List<String> items) {
        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items));
    }

    @Override public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        presenter.onItemClicked(position);
    }
}

//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//
//        new AlertDialog.Builder(this)
//                .setTitle("Metaphorical Sandwich Dialog")
//                .setMessage("Metaphorical message to please use the spicy mustard.")
//                .setNegativeButton("No thanks", new DialogInterface.OnClickListener() {
//                    @Override public void onClick(DialogInterface dialogInterface, int i) {
//                        // "No thanks" button was clicked
//                    }
//                })
//                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                    @Override public void onClick(DialogInterface dialogInterface, int i) {
//                        // "OK" button was clicked
//                    }
//                })
//                .show();
//    }
//}
