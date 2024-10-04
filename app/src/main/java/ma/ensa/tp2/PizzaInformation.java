package ma.ensa.tp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import ma.ensa.tp2.R;
import ma.ensa.tp2.classes.Produit;

public class PizzaInformation extends AppCompatActivity {

    private ImageView foto ,share;
    private TextView nom , descreption , ingrediant , preparation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pizza_information);

        foto = findViewById(R.id.fotoP);
        nom = findViewById(R.id.nomP);
        ingrediant = findViewById(R.id.ingredientTxt);
        preparation = findViewById(R.id.preparationTxt);
        descreption = findViewById(R.id.descriptionTxt);


        foto.setImageResource(Integer.parseInt(this.getIntent().getStringExtra("foto")));
        nom.setText(this.getIntent().getStringExtra("nom"));
        ingrediant.setText(this.getIntent().getStringExtra("ingrediant"));
        descreption.setText(this.getIntent().getStringExtra("descreption"));
        preparation.setText(this.getIntent().getStringExtra("preparation"));

        share = findViewById(R.id.share);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain"); // Set the type of content you want to share
                intent.putExtra(Intent.EXTRA_TEXT, "This is the text to share."); // Add the content you want to share
                startActivity(Intent.createChooser(intent, "Share via"));
            }
        });

    }
}