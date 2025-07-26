package com.ujwal.securebox;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class VaultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vault);

        TextView vaultMsg = findViewById(R.id.vaultMessage);
        vaultMsg.setText(getString(R.string.Vault_text));
    }

}

