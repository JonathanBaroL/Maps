package gpi.servicemaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button gpi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gpi=(Button)findViewById(R.id.gpi);
        gpi.setOnClickListener(new View.OnClickListener()
                               {
                                   public void onClick(View arg0){
                                       Intent intend = new Intent(MainActivity.this, gpiService.class);
                                       startActivity(intend);



                                   }
                               }

        );




    }
}
