package com.example.wency.jb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    public void onItemClick(AdapterView<?> listView,
                                            View v,
                                            int position,
                                            long id){
                        if(position == 0){
                            Intent intent = new Intent(MainActivity.this, BurgerCategoryActivity.class);
                            intent.putExtra("message", "burger");
                            startActivity(intent);
                        }

                        if(position == 1){
                            Intent intent = new Intent(MainActivity.this, BurgerCategoryActivity.class);
                            intent.putExtra("message", "noodle");
                            startActivity(intent);
                        }

                        if(position == 2){
                            Intent intent = new Intent(MainActivity.this, BurgerCategoryActivity.class);
                            intent.putExtra("message", "breakfast");
                            startActivity(intent);
                        }

                        if(position == 3){
                            Intent intent = new Intent(MainActivity.this, BurgerCategoryActivity.class);
                            intent.putExtra("message", "dessert");
                            startActivity(intent);
                        }

                        if(position == 4){
                            Intent intent = new Intent(MainActivity.this, BurgerCategoryActivity.class);
                            intent.putExtra("message", "chickenjoy");
                            startActivity(intent);
                        }

                        if(position == 5){
                            Intent intent = new Intent(MainActivity.this, BurgerCategoryActivity.class);
                            intent.putExtra("message", "ricemeal");
                            startActivity(intent);
                        }

                        if(position == 6){
                            Intent intent = new Intent(MainActivity.this, BurgerCategoryActivity.class);
                            intent.putExtra("message", "sides");
                            startActivity(intent);
                        }

                        if(position == 7){
                            Intent intent = new Intent(MainActivity.this, BurgerCategoryActivity.class);
                            intent.putExtra("message", "kidsmeal");
                            startActivity(intent);
                        }
                    }
                };
       ListView listView = (ListView) findViewById(R.id.list_options);
       listView.setOnItemClickListener(itemClickListener);
    }
}
