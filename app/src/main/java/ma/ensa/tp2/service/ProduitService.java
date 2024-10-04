package ma.ensa.tp2.service;

import java.util.ArrayList;
import java.util.List;

import ma.ensa.tp2.classes.Produit;
import ma.ensa.tp2.dao.IDao;

public class ProduitService implements IDao<Produit> {

    private ArrayList<Produit> produits = new ArrayList<>();

    @Override
    public boolean create(Produit o) {
        return this.produits.add(o);
    }

    @Override
    public boolean update(Produit o) {
        return false;
    }

    @Override
    public boolean delete(Produit o) {
        return produits.remove(o);
    }

    @Override
    public List<Produit> findAll() {
        return produits;
    }

    @Override
    public Produit findById(int id) {
        for(Produit p : produits)
            if(p.getId()==id)
                return p;
        return null;
    }
}
