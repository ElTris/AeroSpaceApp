package com.example.aerospaceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.support.v7.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class ShowTaskCalendar extends AppCompatActivity {
    private Toolbar toolbar;
    private ListView listView = null;
    private TextView textView;
    private TaskyManagerAdapterClase taskyManagerAdapterClase;

    public TaskyManagerAdapterClase getTaskyManagerAdapterClase() {
        return taskyManagerAdapterClase;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_task_calendar);


        toolbar = findViewById(R.id.toolbarShow);
        toolbar.setTitle("");
        toolbar.setLogo(R.drawable.ic_rocket_toolbar);
        setSupportActionBar(toolbar);


        listView=findViewById(R.id.liistasSQLTemporal);
        textView=findViewById(R.id.TxtFound);
        ArrayList<TaskyManagerClase> taskyManagerClases = new ArrayList<>();
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerClases.add(new TaskyManagerClase("TAREASmmm","25/09/2019","HAY ALGO VERGAS QUE VOY A HACER",true,"HIGH"));
        taskyManagerAdapterClase = new TaskyManagerAdapterClase(this,R.layout.helpper_list_design,taskyManagerClases);
        listView.setAdapter(taskyManagerAdapterClase);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ShowTaskCalendar.this,parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();
            }
        });
        listView.setEmptyView(textView);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_menus,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_search:
                SearchView searchView = (SearchView)item.getActionView();
                searchView.setQueryHint("Buscar");
                searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                    @Override
                    public boolean onQueryTextSubmit(String query) {
                        return false;
                    }
                    @Override
                    public boolean onQueryTextChange(String newText) {
                        getTaskyManagerAdapterClase().getFilter().filter(newText);
                        return true;
                    }
                });
                break;
            case R.id.action_add:
                Intent intent = new Intent(ShowTaskCalendar.this,AddNotes.class);
                startActivity(intent);
                break;

            case R.id.action_AboutUs:
                Intent intent_AboutUs = new Intent(ShowTaskCalendar.this,AboutUs.class);
                startActivity(intent_AboutUs);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
