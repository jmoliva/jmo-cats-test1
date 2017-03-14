package net.technologichron.android;

//import net.technologichron.android.control.NumberPicker;
import android.widget.NumberPicker;
import android.app.Activity;
import android.os.Bundle;

public class NumberPickerExample extends Activity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        NumberPicker np;
        np = (NumberPicker) findViewById(R.id.numberPicker);

        //Populate NumberPicker values from minimum and maximum value range
        //Set the minimum value of NumberPicker
        np.setMinValue(1);
        //Specify the maximum value/number of NumberPicker
        np.setMaxValue(680);

        //Gets whether the selector wheel wraps when reaching the min/max value.
        np.setWrapSelectorWheel(true);
    }
}