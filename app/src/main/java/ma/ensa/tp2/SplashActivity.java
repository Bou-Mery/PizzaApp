//package ma.ensa.tp2;
//
//import android.content.Intent;
//import android.os.Bundle;
//
//import androidx.activity.EdgeToEdge;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
//
//        Thread t = new Thread(){
//          public void run(){
//                Thread t = new Thread();
//                try {
//                    sleep(5000);
//                }catch (InterruptedException e){
//                    e.printStackTrace();
//                }finally {
//                    Intent intent = new Intent(getApplicationContext() , Pizza_list.class);
//                    startActivity(intent);
//                }
//          }
//        };
//        t.start();
//    }
//}
package ma.ensa.tp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    private ImageView loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        loading= findViewById(R.id.loading);
        Animation aniRotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim);
        loading.startAnimation(aniRotate);


        new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                Intent intent = new Intent(getApplicationContext(), Pizza_list.class);
                startActivity(intent);
                finish();
            }
        }).start();
    }
}
