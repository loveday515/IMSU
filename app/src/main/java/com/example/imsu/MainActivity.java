package com.example.imsu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    //Variables
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    Menu menu;
    TextView textView;
    WebView myBrowser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        /*---------------------Hooks------------------------*/

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        ActionBarDrawerToggle toggle = new
                ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new HomeFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_home);
        }


    }


    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new HomeFragment()).commit();
                break;

            case R.id.nav_homepage:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new HomePageFragment()).commit();

                break;
            case R.id.nav_school_portals:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new SchoolPortalsFragment()).commit();
                break;

            case R.id.nav_aspirants_menu:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new AspirantsMenuFragment()).commit();
                break;

            case R.id.nav_university_faculties:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new UniversityFacultiesFragment()).commit();
                break;

            case R.id.nav_staffs_webmail:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new StaffsWebmailFragment()).commit();
                break;

            case R.id.nav_register_skill_group:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new EntrepreneurialFragment()).commit();
                break;

            case R.id.nav_Vice_chancellor:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ViceChancellorFragment()).commit();
                break;

            case R.id.nav_dvc_academics:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new DvcAcademicsFragment()).commit();
                break;

            case R.id.nav_registrar:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new RegistrarFragment()).commit();
                break;

            case R.id.nav_ict_unit:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ICTFragment()).commit();
                break;

            case R.id.nav_help_support:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new HelpFragment()).commit();
                break;

            case R.id.nav_contact_us:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ContactFragment()).commit();
                break;

            case R.id.nav_library:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new LibraryFragment()).commit();
                break;


        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}












