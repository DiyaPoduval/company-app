package com.example.companyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2;
    Button bt1;
    string getUse,getPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


ed1=(EditText) findViewById(R.id.un);
ed2=(EditText) findViewById(R.id.pw);
bt1=(Button) findViewById(R.id.login);

bt1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        getUse=ed1.getText().toString();
        getPass=ed2.getText().toString();
        Intent ob=new Intent(getApplicationContext(), MenuActivity.class);
        if(getUse.equals("admin")&& getPass.equals("12345"))
            startActivity(ob);
        else
            Toast.makeText(getApplicationContext(),"invalid",Toast.LENGTH_LONG).show();
    }
});
    });
    }
}