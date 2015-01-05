package com.shuai.processmanager.ui;

import java.util.List;

import com.shuai.processmanager.R;

import android.os.Bundle;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {
    private static final String TAG=MainActivity.class.getSimpleName();
    private Context mContext;
    private ActivityManager mActivityManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mContext=this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mActivityManager=(ActivityManager) mContext.getSystemService(Context.ACTIVITY_SERVICE);
        List<RunningAppProcessInfo> runningApps = mActivityManager.getRunningAppProcesses();
        for(RunningAppProcessInfo item:runningApps){
            Log.d(TAG, item.toString());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
