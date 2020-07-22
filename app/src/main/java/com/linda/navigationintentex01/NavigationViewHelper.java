package com.linda.navigationintentex01;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.google.android.material.navigation.NavigationView;

public class NavigationViewHelper {
    public static void enableNavigation(final Context context, NavigationView view){
        view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.menu1){
                    Intent intent = new Intent(context, MainActivity.class);
                    context.startActivity(intent);
                } else if(item.getItemId() ==R.id.menu2){
                    Intent intent = new Intent(context, SubActivity.class);
                    context.startActivity(intent);
                }

                return true;
            }
        });
    }
}
