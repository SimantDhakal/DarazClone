package com.simant.darazclone.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.simant.darazclone.R;
import com.simant.darazclone.modal.UserModal;
import com.simant.darazclone.retrofit_class.ApiInterface;
import com.simant.darazclone.retrofit_class.Client;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    EditText editText_phone, editText_password;
    Button btn_login;
    String user_phone_n, user_password_n, loginStats = "1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        btn_login = findViewById(R.id.btnLogin);
        editText_phone = findViewById(R.id.etPhone);
        editText_password = findViewById(R.id.etPassword);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getUSerDetail(editText_phone.getText().toString());
            }
        });

    }
    public void getUSerDetail(String phone_no) {
        ApiInterface apiInterface = Client.getRetrofit().create(ApiInterface.class);
        Call<List<UserModal>> userList = apiInterface.getUser(phone_no);

        userList.enqueue(new Callback<List<UserModal>>() {
            @Override
            public void onResponse(Call<List<UserModal>> call, Response<List
                    <UserModal>> response) {

                if (response.body().size() != 0) {
                    for (UserModal UserModal : response.body()) {
                        user_phone_n = UserModal.getPhoneNo();
                        user_password_n = UserModal.getPassword();
                        if ((editText_phone.getText().toString().equals(user_phone_n) || (editText_password.getText().toString().equals(user_password_n)))) {
                            // change logged in stats
                            Intent intent = new Intent(getApplicationContext(), DashboardActivity.class);
                            startActivity(intent);
                            finish();
                        } else {
                            Toast.makeText(getApplicationContext(), "Credential don't match. Please enter correct username and password", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }

            @Override
            public void onFailure(Call<List<UserModal>> call, Throwable t) {

            }
        });
    }
}