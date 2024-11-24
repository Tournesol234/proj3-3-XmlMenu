package com.example.proj3_3;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView testText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testText = findViewById(R.id.test_text);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_test, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.font_small) {
            testText.setTextSize(10);
            Toast.makeText(this, "字体大小：小", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.font_medium) {
            testText.setTextSize(16);
            Toast.makeText(this, "字体大小：中", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.font_large) {
            testText.setTextSize(20);
            Toast.makeText(this, "字体大小：大", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.normal_menu) {
            Toast.makeText(this, "普通菜单项被点击", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.color_red) {
            testText.setTextColor(Color.RED);
            Toast.makeText(this, "字体颜色：红色", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.color_black) {
            testText.setTextColor(Color.BLACK);
            Toast.makeText(this, "字体颜色：黑色", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
