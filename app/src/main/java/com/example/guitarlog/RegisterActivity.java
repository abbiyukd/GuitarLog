package com.example.guitarlog;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.guitarlog.R;


public class RegisterActivity extends AppCompatActivity {

    private DatabaseHandler databaseHandler;
    private User usermodel;
    private EditText etUsernameRegister;
    private EditText etPasswordRegister;
    private Button btRegister;
    private String username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initView();
        register();
    }

    private void register() {
        btRegister.setOnClickListener(V ->
                initDataHandler()
        );
    }

    private void initView() {
        etUsernameRegister = findViewById(R.id.etUsernameRegister);
        etPasswordRegister = findViewById(R.id.etPasswordRegister);
        btRegister = findViewById(R.id.btRegister);
    }

    private void initUser() {
        username = etUsernameRegister.getText().toString();
        password = etPasswordRegister.getText().toString();

        usermodel = new User();
        usermodel.setUsername(username);
        usermodel.setPassword(password);
    }

    private Boolean validation() {
        username = etUsernameRegister.getText().toString();
        password = etPasswordRegister.getText().toString();

        if(username.isEmpty()){
            Toast.makeText(this, "Isikan username", Toast.LENGTH_SHORT).show();
            Log.e("Validation","false");
            return false;
        }

        if(password.isEmpty()){
            Toast.makeText(this, "Isikan Password", Toast.LENGTH_SHORT).show();
            Log.e("Validation","false");
            return false;
        }

        if(TextUtils.isEmpty(password) || password.length() < 6)
        {
            etPasswordRegister.setError("Isi password minimal 6 karakter");
            return false;
        }

        Log.e("Validation","true");
        return true;
    }
    private void initDataHandler() {
        if (validation()) {
            initUser();

            databaseHandler = new DatabaseHandler(this);
            databaseHandler.addUser(usermodel);
            User model = databaseHandler.getMahasiswa(1);
            Log.e("record", model.getUsername().toString());
            Intent admin = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(admin);
            finish();
        }

    }
}
