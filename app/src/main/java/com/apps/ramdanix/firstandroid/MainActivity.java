package com.apps.ramdanix.firstandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edUsername;
    private EditText edPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edUsername = findViewById(R.id.edUsername);
        edPassword = findViewById(R.id.edPassword);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String getUsername = edUsername.getText().toString();
                String getPassword = edPassword.getText().toString();

                if (getUsername.equals("admin") && getPassword.equals("admin")){
                    pesan("berhasil login");
                }else{
                    pesan("gagal login");

                }
            }
        });


    }

    public void pesan(String pesan){
        Toast.makeText(MainActivity.this, pesan, Toast.LENGTH_SHORT).show();
    }
}
