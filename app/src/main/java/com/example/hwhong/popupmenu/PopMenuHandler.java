package com.example.hwhong.popupmenu;

import android.content.Context;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by hwhong on 8/20/16.
 */
public class PopMenuHandler implements PopupMenu.OnMenuItemClickListener {

    private Context context;
    private TextView textView;

    public PopMenuHandler(Context context) {
        this.context = context;
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.amazon:
                Toast.makeText(context, "You've selected Amazon", Toast.LENGTH_SHORT).show();
                break;
            case R.id.beme:
                Toast.makeText(context, "You've selected Beme", Toast.LENGTH_SHORT).show();
                //textView.setText("You've selected Beme");
                break;
            case R.id.google:
                Toast.makeText(context, "You've selected Google", Toast.LENGTH_SHORT).show();
                //textView.setText("You've selected Google");
                break;
            case R.id.etsy:
                Toast.makeText(context, "You've selected Etsy", Toast.LENGTH_SHORT).show();
                //textView.setText("You've selected Etsy");
                break;
        }


        return false;
    }

    public void receive(TextView textView) {
        this.textView = textView;
    }
}
