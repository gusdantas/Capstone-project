package com.gustavohidalgo.quaiscalingudum.views;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gustavohidalgo.quaiscalingudum.R;
import com.gustavohidalgo.quaiscalingudum.interfaces.OnEditNotificationListener;
import com.gustavohidalgo.quaiscalingudum.models.Notification;

public class AddNotificationActivity extends AppCompatActivity implements OnEditNotificationListener {
    private Notification mNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_notification);

        if(savedInstanceState == null) {
            Intent intent = getIntent();
            mNotification = intent.getParcelableExtra("old_notification");

            if (mNotification == null) {
                getSupportActionBar().setTitle("New notification");
                mNotification = new Notification();
            } else {
                getSupportActionBar().setTitle("Edit notification");
            }

            toEta(mNotification);
        }
    }

    @Override
    public void toEta(Notification notification) {
        EtaFragment etaFragment = EtaFragment.newInstance(notification);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.activity_add_notification, etaFragment, "eta").commit();
    }

    @Override
    public void toPickLine(Notification notification) {
        PickLineFragment pickLineFragment = PickLineFragment.newInstance(notification);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.activity_add_notification, pickLineFragment, "pickline").commit();
    }

    @Override
    public void toDetails(Notification notification) {
        DetailsFragment detailsFragment = DetailsFragment.newInstance(notification);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.activity_add_notification, detailsFragment, "details").commit();
    }

    @Override
    public void toSetNotifications(Notification notification) {
        SetNotificationsFragment setNotificationsFragment = SetNotificationsFragment
                .newInstance(notification);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.activity_add_notification, setNotificationsFragment, "notifications")
                .commit();
    }
}