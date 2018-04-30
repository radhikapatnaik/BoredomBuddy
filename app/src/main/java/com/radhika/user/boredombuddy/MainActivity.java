package com.radhika.user.boredombuddy;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void browser1(android.view.View view) {
        Intent browser1intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.co.in/search?q=events+around+me&rlz=1C1RLNS_enIN775IN776&oq=events+around+me&aqs=chrome..69i57j0l5.5256j0j8&sourceid=chrome&ie=UTF-8"));
        startActivity(browser1intent);
    }

    public void browser2(View view) {
        Intent browser2intent = new android.content.Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.co.in/search?q=library+around+me&rlz=1C1RLNS_enIN775IN776&oq=libra&aqs=chrome.3.69i57j0l5.4824j0j8&sourceid=chrome&ie=UTF-8"));
        startActivity(browser2intent);
    }

    public void browser3(View view) {
        Intent browser3intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.co.in/search?q=fun+facts&rlz=1C1RLNS_enIN775IN776&source=lnms&tbm=isch&sa=X&ved=0ahUKEwiW1vmq28raAhVJsI8KHa7DCsoQ_AUICigB&biw=1366&bih=662"));
        startActivity(browser3intent);
    }

    public void call(View view){
        Intent activityintent =new Intent(getBaseContext(),callActivity.class);
        startActivity(activityintent);
    }
    public void music(View view) {
        Intent intent = new Intent("android.intent.action.MUSIC_PLAYER");
        startActivity(intent);
    }
    public void junk(View view){
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("*/*");
        startActivityForResult(intent,7);
    }
}
