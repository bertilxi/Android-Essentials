package folderit.net.ejemplos.clase2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.ToggleButton;

import folderit.net.ejemplos.R;

public class ViewsActivity extends Activity {
    @Override
    // la actividad esta siendo creada
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui1);

        //
        // Button
        //

        final Button mButton = new Button(this);

        mButton.setText("Tocame");

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // hacer algo
                mButton.setText("Hey no me toques");
            }
        });

        mButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return false;
            }
        });

        //
        //  ToggleButton
        //

        final ToggleButton mToggleButton = new ToggleButton(this);

        // mToggleButton.setOnClickListener();  no tiene sentido

        mToggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mToggleButton.setTextOn("ONNNNNN");
                } else {
                    mToggleButton.setTextOff("OFFFFF");
                }
            }
        });

        //
        //  Switch
        //

        Switch mSwitch = new Switch(this);

        mSwitch.toggle();
        mSwitch.setChecked(false);
        mSwitch.setText("Hola");

        mSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // hagan algo
            }
        });

        //
        // ImageButton
        //

        ImageButton mImageButton = new ImageButton(this);

        mImageButton.setImageResource(R.mipmap.ic_launcher);

        // mismos listeners que Button

        //
        // ImageView
        //

        ImageView mImageView = new ImageButton(this);

        mImageView.setImageResource(R.mipmap.ic_launcher);

        // mismos listeners que Button y ImageButton

        //
        // TextView
        //

        TextView mTextView = new TextView(this);

        mTextView.setText("Hola");

        //
        // EditText
        //

        EditText mEditText = new EditText(this);

        // estos listeners tambien los tienen los demas widgets pero tienen mas sentido con este

        mEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

            }
        });

        mEditText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                return false;
            }
        });


        //
        // DatePicker
        //

        DatePicker mDatePicker = new DatePicker(this);

        mDatePicker.setMinDate(0);
        mDatePicker.setMaxDate(0);

        mDatePicker.getDayOfMonth();
        mDatePicker.getMonth();
        mDatePicker.getYear();

        // para tomar una fecha seleccionada hay que implementar a DatePickerDialog.OnDateSetListener
        // y usar el metodo onDateSet provisto por este

        //
        // TimePicker
        //

        TimePicker mTimePicker = new TimePicker(this);

        mTimePicker.getBaseline();
        mTimePicker.getHour();
        mTimePicker.getMinute();
        mTimePicker.setHour(0);
        mTimePicker.setMinute(0);

        // para tomar una fecha seleccionada hay que implementar a TimePickerDialog.OnTimeSetListener
        // y usar el metodo onTimeSet provisto por este


        //
        // CheckBox
        //

        CheckBox mCheckBox = new CheckBox(this);

        mCheckBox.setChecked(true);

        mCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // lo mismo que un toggle
            }
        });

        //
        // RadioButton
        //

        RadioButton radioButton1 = new RadioButton(this);

        radioButton1.toggle();
        radioButton1.setText("Hola");
        radioButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // lo mismo que un toggle
            }
        });

        //
        // RadioGroup
        //

        RadioButton radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton radioButton4 = (RadioButton) findViewById(R.id.radioButton4);

        RadioGroup mRadioGroup = new RadioGroup(this);

        mRadioGroup.addView(radioButton2);
        mRadioGroup.addView(radioButton3);
        mRadioGroup.addView(radioButton4);

        mRadioGroup.clearCheck();

        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case -1:
                        Log.v("TAG", "Choices cleared!");
                        break;
                    case R.id.radioButton2:
                        Log.v("TAG", "elegiste el primero");
                        break;
                    case R.id.radioButton3:
                        Log.v("TAG", "elegiste el segundo");
                        break;
                    case R.id.radioButton4:
                        Log.v("TAG", "elegiste el tercero");
                        break;
                }

            }
        });

    }

    @Override
    protected void onStart() { // la actividad esta por mostrarse
        super.onStart();
    }

    @Override
    protected void onResume() { // la actividad es visible
        super.onResume();
    }

    @Override
    protected void onPause() { // la actividad esta por pasar a segundo plano
        super.onPause();
    }

    @Override
    protected void onStop() { // la actividad no es mas visible
        super.onStop();
    }

    @Override
    protected void onDestroy() { // la actividad esta por ser destruida
        super.onDestroy();
    }
}