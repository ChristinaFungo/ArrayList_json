package com.khrystynahryb.arraylist_json;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterDoctor extends BaseAdapter {

    Context context;
    ArrayList<ItemDoctorModel> arrayList;

    public AdapterDoctor(Context context, ArrayList<ItemDoctorModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item_doctors,parent,false);
        }
        TextView type = (TextView) convertView.findViewById(R.id.tv_type_doctor);
        TextView name = (TextView) convertView.findViewById(R.id.tv_name_doctor);
        TextView email = (TextView) convertView.findViewById(R.id.tv_email_doctor);
        type.setText(arrayList.get(position).getType());
        name.setText(arrayList.get(position).getName());
        email.setText(arrayList.get(position).getEmail());

        return convertView;
    }
}
