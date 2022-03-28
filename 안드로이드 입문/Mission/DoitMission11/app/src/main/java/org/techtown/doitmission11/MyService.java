package org.techtown.doitmission11;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        String text = intent.getStringExtra("text");

        Intent showIntent = new Intent(getApplicationContext(),MainActivity.class);
        showIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        showIntent.putExtra("text",text + " from Service");
        startActivity(showIntent);

        return super.onStartCommand(intent, flags, startId);

    }
}