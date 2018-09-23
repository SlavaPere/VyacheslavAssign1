package vyacheslav.perepelytsya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import android.content.res.Configuration;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void dialOnClick(View view){
        Intent phoneIntent = new Intent(Intent.ACTION_CALL);
        try {
            startActivity(phoneIntent);
        }
            catch (SecurityException exception) {
                Toast.makeText(SecondActivity.this, "DIAL_PHONE Denied", Toast.LENGTH_SHORT)
                        .show();
            }
    }
    // Check screen orientation or screen rotate event here
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        //Ctrl + F11
        // Checks the orientation of the screen for landscape and portrait
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(this, "landscape", Toast.LENGTH_LONG).show();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(this, "portrait", Toast.LENGTH_LONG).show();
        }
    }
}
