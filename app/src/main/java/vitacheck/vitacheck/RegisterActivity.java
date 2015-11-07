package vitacheck.vitacheck;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private EditText rNameView;
    private EditText rEmailView;
    private EditText rPaswordView;
    private EditText rConfirmPasswordView;
    private EditText rDOB;
    private EditText rWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rNameView = (EditText) findViewById(R.id.PersonName);
        rEmailView = (EditText) findViewById(R.id.email);
        rPaswordView = (EditText) findViewById(R.id.password);
        rConfirmPasswordView = (EditText) findViewById(R.id.password_confirm);
        rDOB = (EditText) findViewById(R.id.date_of_birth);
        rWeight = (EditText) findViewById(R.id.weight);

    }

}
