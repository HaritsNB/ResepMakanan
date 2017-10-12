package haritsnb.resepmakanan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailResep extends AppCompatActivity {
    ImageView img;
    TextView detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_resep);

        img = (ImageView)findViewById(R.id.img);
        detail = (TextView)findViewById(R.id.detail);

        Intent obj = getIntent();

            String titleku = obj.getStringExtra("title");
            getSupportActionBar().setTitle(titleku);

            int imgku = obj.getIntExtra("img",0);
            img.setImageResource(imgku);

            String detailku = obj.getStringExtra("detail");
            detail.setText(detailku);
    }
}
