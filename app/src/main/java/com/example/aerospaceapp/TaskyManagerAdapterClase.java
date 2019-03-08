package com.example.aerospaceapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TaskyManagerAdapterClase extends ArrayAdapter<TaskyManagerClase> {

    private ArrayList<TaskyManagerClase> taskyManagerClasesArrayList;
    private Context context;
    private int id;


    public TaskyManagerAdapterClase(Context context, int resource,List<TaskyManagerClase> objects) {
        super(context, resource, objects);
        this.context =context;
        this.id=resource;
        taskyManagerClasesArrayList=  new ArrayList<>(objects);
    }



    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(id,null);
            viewHolder = new ViewHolder();
            viewHolder.namesTasky =(TextView)convertView.findViewById(R.id.TaskyName);
            convertView.setTag(viewHolder);

        }else {
            viewHolder = (ViewHolder)convertView.getTag();
        }

        TaskyManagerClase taskyManagerClase = taskyManagerClasesArrayList.get(position);
        viewHolder.namesTasky.setText(taskyManagerClase.getNameTasky());



        return convertView;
    }

    private class ViewHolder{
        private TextView namesTasky;
    }
}
