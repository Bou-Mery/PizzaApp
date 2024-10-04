package ma.ensa.tp2.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import ma.ensa.tp2.R;
import ma.ensa.tp2.classes.Produit;

public class PizzaAdapter extends BaseAdapter {

    private List<Produit> produits;
    private LayoutInflater inflater;

    public PizzaAdapter() {
    }

    public PizzaAdapter(List<Produit> produits, Activity activity) {
        this.produits = produits;
        this.inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int i) {
        return produits.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null )
           view=inflater.inflate(R.layout.produit_item , null);

        ImageView photo = view.findViewById(R.id.photo);
        TextView nom = view.findViewById(R.id.nom);
        TextView nbrIngrediant = view.findViewById(R.id.nbrIngrediant);
        TextView duree = view.findViewById(R.id.duree);

        photo.setImageResource(produits.get(i).getPhoto());
        nom.setText(produits.get(i).getNom());
        nbrIngrediant.setText(produits.get(i).getNbrIngredients()+"");
        duree.setText(produits.get(i).getDurre()+"");

        return view ;

    }
}
