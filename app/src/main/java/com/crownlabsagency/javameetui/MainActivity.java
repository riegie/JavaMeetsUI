package com.crownlabsagency.javameetui;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // An int variable to hold a value.
    private int value = 0;

    // A bunch of Buttons and a TextView
    private Button btnAdd;
    private Button btnTake;
    private TextView txtValue;
    private Button btnGrow;
    private Button btnShrink;
    private Button btnReset;
    private Button btnHide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get a reference to all the buttons in our UI
        // Match them up to all our Button objects we declared earlier
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnTake = (Button) findViewById(R.id.btnTake);
        txtValue = (TextView) findViewById(R.id.txtValue);
        btnGrow = (Button) findViewById(R.id.btnGrow);
        btnShrink = (Button) findViewById(R.id.btnShrink);
        btnReset = (Button) findViewById(R.id.btnReset);
        btnHide = (Button) findViewById(R.id.btnHide);

        // Listen for all the button clicks
        btnAdd.setOnClickListener(this);
        btnTake.setOnClickListener(this);
        txtValue.setOnClickListener(this);
        btnGrow.setOnClickListener(this);
        btnShrink.setOnClickListener(this);
        btnReset.setOnClickListener(this);
        btnHide.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        // A local variable to use later
        float size;
        // View is the parent class for Button, TextView and more.
        // Calling v.getId() will return the ID property of the UI widget that has been clicked which
        // is also the widget that triggered the call to onClick.
        switch(v.getId()) {
            case R.id.btnAdd:
                this.value++;
                txtValue.setText("" + value);
                break;

            case R.id.btnTake:
                this.value--;
                txtValue.setText("" + value);
                break;

            case R.id.btnReset:
                this.value = 0;
                txtValue.setText("" + value);
                break;

        }

    }
}
