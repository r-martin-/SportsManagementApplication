package com.example.ross.sportsmanagementapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class CreateEvent extends AppCompatActivity implements View.OnClickListener {

    EditText teamName;
    EditText sport;
    EditText age;
    EditText town;
    Spinner spinner;
    Spinner gender;
    Button submit;
    String[] counties;
    String[] gender1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);

        teamName = (EditText)findViewById(R.id.editTeamName);

        sport = (EditText)findViewById(R.id.editSport);

        age = (EditText)findViewById(R.id.editAge);

        town = (EditText)findViewById(R.id.editTown);

        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(this);


         spinner = (Spinner) findViewById(R.id.county);
        counties = getResources().getStringArray(R.array.counties_in_ireland);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.counties_in_ireland, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        //showToast("Spinner1: position=" + position + " id=" + id);



                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }

        );




        gender = (Spinner) findViewById(R.id.editGender);
        gender1 = getResources().getStringArray(R.array.genderArray);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.genderArray, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        gender.setAdapter(adapter1);

        gender.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        //showToast("Spinner1: position=" + position + " id=" + id);
                        int index = parent.getSelectedItemPosition();
                        Toast.makeText(getBaseContext(),
                                "You have selected item : " + gender1[index],
                                Toast.LENGTH_SHORT).show();


                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }

        );
    }






    @Override
    public void onClick(View v) {

        String str = teamName.getText().toString();
        String str1 = sport.getText().toString();
        String str2 = age.getText().toString();
        String str3 = town.getText().toString();

        String ans = str + str1 + str2 + str3;







        Toast msg = Toast.makeText(getBaseContext(),str+"\n"+ str1+"\n"+ str2+"\n"+ str3,Toast.LENGTH_LONG);
        msg.show();

    }



}


