package com.khrystynahryb.arraylist_json;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class JsonService extends AppCompatActivity {
   private ArrayList<ItemDoctorModel> arrayList;

    public ArrayList<ItemDoctorModel> getDoctorsList(){
        return arrayList;
}
    public void array (){
        arrayList = new ArrayList<>();
        try {
            JSONObject object = new JSONObject(readJSON());
            JSONArray array = object.getJSONArray("doctors");
            for (int i = 0; i < array.length(); i++) {

                JSONObject jsonObject = array.getJSONObject(i);
                String type = jsonObject.getString("type");
                String name = jsonObject.getString("name");
                String email = jsonObject.getString("email");

                ItemDoctorModel model = new ItemDoctorModel(type, name, email);
                model.setType(type);
                model.setName(name);
                model.setEmail(email);
                arrayList.add(model);
            }
        } catch (JSONException | IOException e) {
            // e.printStackTrace();
        }
    }
    public String readJSON()throws IOException {
        String json = null;

        try {
        InputStream inputStream = getAssets().open("doctors.json");
        int size = inputStream.available();
        byte[] buffer = new byte[size];
        //read value in the byte array
        inputStream.read(buffer);
        inputStream.close();
        //convert byte to string
        json = new String(buffer, "UTF-8");
        } catch (IOException e) {
        //Toast.makeText(this, "Error reading from json", Duration.ofSeconds(4)).show();
        }

        return json;
    }
}
