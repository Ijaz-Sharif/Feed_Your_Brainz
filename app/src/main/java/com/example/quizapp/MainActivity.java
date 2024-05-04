package com.example.quizapp;

import static com.example.quizapp.Utils.Constant.setUserLoginStatus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.quizapp.Screens.AccountActivity;
import com.example.quizapp.Screens.TopicActivity;

public class MainActivity extends AppCompatActivity {
    private SensorManager sensorManager;
    private Sensor accelerometer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener(sensorListener, accelerometer, SensorManager.SENSOR_DELAY_NORMAL);

    }
    private final SensorEventListener sensorListener = new SensorEventListener() {
        private static final float SHAKE_THRESHOLD = 10.5f;
        private long lastTime = 0;
        private float lastX = 0, lastY = 0, lastZ = 0;

        @Override
        public void onSensorChanged(SensorEvent event) {
            if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
                long currentTime = System.currentTimeMillis();
                if ((currentTime - lastTime) > 100) {
                    long timeDiff = currentTime - lastTime;
                    lastTime = currentTime;

                    float x = event.values[0];
                    float y = event.values[1];
                    float z = event.values[2];

                    float speed = Math.abs(x + y + z - lastX - lastY - lastZ) / timeDiff * 10000;

                    if (speed > SHAKE_THRESHOLD) {
                        // Shake detected, do something
                        Toast.makeText(getApplicationContext(), "Shake detected!", Toast.LENGTH_SHORT).show();
                    }

                    lastX = x;
                    lastY = y;
                    lastZ = z;
                }
            }
        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int accuracy) {
            // Not needed for this example
        }
    };
    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(sensorListener);
    }

    public void startQuiz(View view){
        startActivity(new Intent(this, TopicActivity.class));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.logout) {
            setUserLoginStatus(MainActivity.this,false);
            startActivity(new Intent(MainActivity.this, AccountActivity.class));
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}