package ca.yorku.mcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import ca.yorku.mcalc.MCalc.MCalcModel;

public class EntryForm extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mortgage_layout);
    }

    public void buttonClicked(View v) {
        String p = ((EditText) findViewById(R.id.principleBox)).getText().toString();
        String n = ((EditText) findViewById(R.id.amortizationBox)).getText().toString();
        String r = ((EditText) findViewById(R.id.interestBox)).getText().toString();

        MCalcModel model = new MCalcModel(p, n, r);
        String answer = "$" + model.computePayment();
        ((TextView) findViewById(R.id.result)).setText(answer);
    }
}

