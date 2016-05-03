package com.app.sri.fragmentcreating;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Sridevi on 2/2/2016.
 */
public class Fragmentone extends Fragment{

    ListView listView;
    ArrayAdapter<String> adapter;
    String[] skills;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
          View view=inflater.inflate(R.layout.onefragment,container,false);
        listView=(ListView)view.findViewById(R.id.listView);
        skills=getResources().getStringArray(R.array.skills);
        adapter=new ArrayAdapter<String>(getActivity(),R.layout.listview,R.id.text,skills);
        listView.setAdapter(adapter);
        return view;
    }
}
