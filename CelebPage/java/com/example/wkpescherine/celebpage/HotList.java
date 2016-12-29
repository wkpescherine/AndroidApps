package com.example.wkpescherine.celebpage;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HotList extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hot_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }else if (id == R.id.action_search){
            Intent myintent = new Intent(this,Search.class);
            startActivity(myintent);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent myintent = new Intent(this,Home.class);
            startActivity(myintent);
        } else if (id == R.id.nav_wrap) {
            Intent myintent = new Intent(this,Wrap.class);
            startActivity(myintent);
        } else if (id == R.id.nav_hotlist) {
            Intent myintent = new Intent(this,HotList.class);
            startActivity(myintent);
        }else if (id == R.id.nav_celebdish) {
            Intent myintent = new Intent(this,CelebDish.class);
            startActivity(myintent);
        }else if (id == R.id.nav_latest) {
            Intent myintent = new Intent(this,Latest.class);
            startActivity(myintent);
        }else if (id == R.id.nav_givingcarpet) {
            Intent myintent = new Intent(this,GivingCarpet.class);
            startActivity(myintent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void onClickMyPage(View v) {
        Intent myintent = new Intent(this,MyPage.class);
        startActivity(myintent);
    }

    public void onClickSettings(View v) {
        Intent myintent = new Intent(this,Settings.class);
        startActivity(myintent);
    }

    public void onClickStyle(View v) {
        TextView beauty = (TextView) findViewById(R.id.hot_list_beauty);
        TextView living = (TextView) findViewById(R.id.hot_list_living);
        TextView style = (TextView) findViewById(R.id.hot_list_style);

        beauty.setTextColor(0xffffffff);
        living.setTextColor(0xffffffff);
        style.setTextColor(0xfffca800);
    }

    public void onClickBeauty(View v) {
        TextView beauty = (TextView) findViewById(R.id.hot_list_beauty);
        TextView living = (TextView) findViewById(R.id.hot_list_living);
        TextView style = (TextView) findViewById(R.id.hot_list_style);

        style.setTextColor(0xffffffff);
        living.setTextColor(0xffffffff);
        beauty.setTextColor(0xfffca800);
    }

    public void onClickLiving(View v) {
        TextView beauty = (TextView) findViewById(R.id.hot_list_beauty);
        TextView living = (TextView) findViewById(R.id.hot_list_living);
        TextView style = (TextView) findViewById(R.id.hot_list_style);

        beauty.setTextColor(0xffffffff);
        style.setTextColor(0xffffffff);
        living.setTextColor(0xfffca800);
    }
}
