package com.abhishek.planetlist;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ListView;

        import com.abhishek.planetlist.Data.planetcollection;
        import com.abhishek.planetlist.list.customAdapter;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    customAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
lv=findViewById(R.id.lv);
lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);

    startActivity(intent);
    }
});
adapter=new customAdapter(this,planetcollection.getPlanets());
lv.setAdapter(adapter);
    }
}
