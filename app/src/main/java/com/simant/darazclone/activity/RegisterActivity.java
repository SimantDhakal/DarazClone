package com.simant.darazclone.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.simant.darazclone.R;
import com.simant.darazclone.parser.HttpParse;

import java.util.HashMap;

public class RegisterActivity extends AppCompatActivity {

    Button btn_create_account;
    EditText etPhone, editText_Password;

    String PhoneSTR, PasswordSTR;
    String finalResult;
    String HttpURL = "http://192.168.137.1:3000/daraz_users";
    Boolean CheckEditText;
//    ProgressDialog progressDialog;
    HashMap<String, String> hashMap = new HashMap<>();
    HttpParse httpParse = new HttpParse();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        // button create account
        btn_create_account = findViewById(R.id.btnSignup);
        etPhone = findViewById(R.id.etPhone);
        editText_Password = findViewById(R.id.etPassword);

        //Adding Click Listener on button.
        btn_create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Checking whether EditText is Empty or Not
                CheckEditTextIsEmptyOrNot();

                if (CheckEditText) {
                    UserRegisterFunction(PhoneSTR, PasswordSTR);
                } else {
                    Toast.makeText(getApplicationContext(), "Please fill all form fields", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void CheckEditTextIsEmptyOrNot() {

        PhoneSTR = etPhone.getText().toString();
        PasswordSTR = editText_Password.getText().toString();

        if (TextUtils.isEmpty(PhoneSTR) || TextUtils.isEmpty(PasswordSTR)) {
            CheckEditText = false;
        } else {
            CheckEditText = true;
        }
    }

    public void UserRegisterFunction(final String phone_str, final String password_str) {
        class UserRegisterFunctionClass extends AsyncTask<String, Void, String> {

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
            }

            @Override
            protected void onPostExecute(String httpResponseMsg) {
                super.onPostExecute(httpResponseMsg);
            }

            @Override
            protected String doInBackground(String... params) {
                hashMap.put("phoneNo", params[0]);
                hashMap.put("password", params[1]);
                finalResult = httpParse.postRequest(hashMap, HttpURL);
                return finalResult;
            }
        }

        UserRegisterFunctionClass userRegisterFunctionClass = new UserRegisterFunctionClass();
        userRegisterFunctionClass.execute(phone_str, password_str);
        Intent loadActivity = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(loadActivity);
    }
}