package bagimsizgirisimciler.com.biduyuru;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    Spinner spinner,spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        spinner = (Spinner) findViewById(R.id.spinnerFakulte);
        spinner2 = (Spinner) findViewById(R.id.spinnerBolum);
        final TextView textView = findViewById(R.id.textView3);



        ArrayAdapter adapterSpinner = ArrayAdapter.createFromResource(this, R.array.Fakulte,android.R.layout.simple_spinner_item);
        adapterSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapterSpinner);



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                if(position!=0){

                    setSpinner2(position);

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });





    }
    public void setSpinner2(int pos) {
        ArrayAdapter adapterSpinner2;
        switch (pos){
            case(1):
                adapterSpinner2 = ArrayAdapter.createFromResource(this, R.array.Bolum_bos,android.R.layout.simple_spinner_item);
                adapterSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinner2.setAdapter(adapterSpinner2);
                break;
            case(2):
                adapterSpinner2 = ArrayAdapter.createFromResource(this, R.array.Bolum_2,android.R.layout.simple_spinner_item);
                adapterSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinner2.setAdapter(adapterSpinner2);

                break;
            case(3):
                adapterSpinner2 = ArrayAdapter.createFromResource(this, R.array.Bolum_bos,android.R.layout.simple_spinner_item);
                adapterSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinner2.setAdapter(adapterSpinner2);
                break;
            case(4):
                adapterSpinner2 = ArrayAdapter.createFromResource(this, R.array.Bolum_bos,android.R.layout.simple_spinner_item);
                adapterSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinner2.setAdapter(adapterSpinner2);
                break;
            case(5):
                adapterSpinner2 = ArrayAdapter.createFromResource(this, R.array.Bolum_5,android.R.layout.simple_spinner_item);
                adapterSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinner2.setAdapter(adapterSpinner2);

                break;
            case(6):
                adapterSpinner2 = ArrayAdapter.createFromResource(this, R.array.Bolum_6,android.R.layout.simple_spinner_item);
                adapterSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinner2.setAdapter(adapterSpinner2);

                break;
            case(7):
                adapterSpinner2 = ArrayAdapter.createFromResource(this, R.array.Bolum_7,android.R.layout.simple_spinner_item);
                adapterSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinner2.setAdapter(adapterSpinner2);

                break;
            case(8):
               adapterSpinner2 = ArrayAdapter.createFromResource(this, R.array.Bolum_8,android.R.layout.simple_spinner_item);
                adapterSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinner2.setAdapter(adapterSpinner2);

                break;
            case(9):
                adapterSpinner2 = ArrayAdapter.createFromResource(this, R.array.Bolum_bos,android.R.layout.simple_spinner_item);
                adapterSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinner2.setAdapter(adapterSpinner2);
                break;
            case(10):
                adapterSpinner2 = ArrayAdapter.createFromResource(this, R.array.Bolum_bos,android.R.layout.simple_spinner_item);
                adapterSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinner2.setAdapter(adapterSpinner2);
                break;
            case(11):
                adapterSpinner2 = ArrayAdapter.createFromResource(this, R.array.Bolum_11,android.R.layout.simple_spinner_item);
                adapterSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinner2.setAdapter(adapterSpinner2);

                break;
            case(12):
                 adapterSpinner2 = ArrayAdapter.createFromResource(this, R.array.Bolum_12,android.R.layout.simple_spinner_item);
                adapterSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinner2.setAdapter(adapterSpinner2);

                break;
            case(13):
                adapterSpinner2 = ArrayAdapter.createFromResource(this, R.array.Bolum_13,android.R.layout.simple_spinner_item);
                adapterSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinner2.setAdapter(adapterSpinner2);
                break;
            case(14):
                adapterSpinner2 = ArrayAdapter.createFromResource(this, R.array.Bolum_14,android.R.layout.simple_spinner_item);
                adapterSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinner2.setAdapter(adapterSpinner2);
                break;
            case(15):
                adapterSpinner2 = ArrayAdapter.createFromResource(this, R.array.Bolum_bos,android.R.layout.simple_spinner_item);
                adapterSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinner2.setAdapter(adapterSpinner2);
                break;
            case(16):
                adapterSpinner2 = ArrayAdapter.createFromResource(this, R.array.Bolum_bos,android.R.layout.simple_spinner_item);
                adapterSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinner2.setAdapter(adapterSpinner2);
                break;
            case(17):
                adapterSpinner2 = ArrayAdapter.createFromResource(this, R.array.Bolum_17,android.R.layout.simple_spinner_item);
                adapterSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinner2.setAdapter(adapterSpinner2);
                break;
            case(18):
                adapterSpinner2 = ArrayAdapter.createFromResource(this, R.array.Bolum_18,android.R.layout.simple_spinner_item);
                adapterSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinner2.setAdapter(adapterSpinner2);
                break;
            case(19):
                adapterSpinner2 = ArrayAdapter.createFromResource(this, R.array.Bolum_bos,android.R.layout.simple_spinner_item);
                adapterSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinner2.setAdapter(adapterSpinner2);
                break;
        }

    }

}

