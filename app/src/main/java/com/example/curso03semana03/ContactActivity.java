package com.example.curso03semana03;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class ContactActivity extends AppCompatActivity {

    private TextInputLayout inputLayoutName, inputLayoutEmail;
    private TextInputEditText inputName, inputEmail, inputMessage;
    private MaterialCardView cardMessage;
    private MaterialButton buttonSend;
    private TextView textRequiredMessage, textErrorMessage, textMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        setupViews();
        MaterialToolbar topAppBar = findViewById(R.id.topAppBar_contact);
        setSupportActionBar(topAppBar);

        topAppBar.setNavigationOnClickListener(view -> onBackPressed());

        inputsChangesListeners();
        sendMail();
    }

    private void sendMail() {
        buttonSend.setOnClickListener(view -> checkInputs());
    }

    private void checkInputs() {
        if (Objects.requireNonNull(inputName.getText()).toString().trim().isEmpty()) {
            inputLayoutName.setErrorEnabled(true);
            inputLayoutName.setError(getString(R.string.error_input_empty));
        } else if (Objects.requireNonNull(inputEmail.getText()).toString().trim().isEmpty()) {
            inputLayoutEmail.setErrorEnabled(true);
            inputLayoutEmail.setError(getString(R.string.error_input_empty));
        } else if (!Patterns.EMAIL_ADDRESS.matcher(inputEmail.getText().toString()).matches()) {
            inputLayoutEmail.setErrorEnabled(true);
            inputLayoutEmail.setError(getString(R.string.error_email_false));
        } else if (Objects.requireNonNull(inputMessage.getText()).toString().trim().isEmpty()) {
            cardMessage.setStrokeColor(getColor(R.color.colorError));
            textMessage.setTextColor(getColor(R.color.colorError));
            textRequiredMessage.setVisibility(View.INVISIBLE);
            textErrorMessage.setVisibility(View.VISIBLE);
        } else {
            sendParameters();
        }
    }

    private void sendParameters() {
        Toast.makeText(this, getString(R.string.envoy), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    private void setupViews() {
        inputLayoutName = findViewById(R.id.inputLayout_name);
        inputLayoutEmail = findViewById(R.id.inputLayout_mail);
        inputName = findViewById(R.id.input_name);
        inputEmail = findViewById(R.id.input_mail);
        inputMessage = findViewById(R.id.input_message);
        buttonSend = findViewById(R.id.button_sendMail);
        cardMessage = findViewById(R.id.card_message);
        textRequiredMessage = findViewById(R.id.text_requiredMessage);
        textErrorMessage = findViewById(R.id.text_errorMessage);
        textMessage = findViewById(R.id.text_message);
    }

    private void inputsChangesListeners() {
        inputName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                inputLayoutName.setErrorEnabled(false);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        inputEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                inputLayoutEmail.setErrorEnabled(false);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        inputMessage.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @RequiresApi(api = Build.VERSION_CODES.R)
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                cardMessage.setStrokeColor(getColor(R.color.material_on_surface_stroke));
                textErrorMessage.setVisibility(View.INVISIBLE);
                textRequiredMessage.setVisibility(View.VISIBLE);
                textMessage.setTextColor(getColor(R.color.colorTextPrimary));
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

}