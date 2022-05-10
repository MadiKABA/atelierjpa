package sn.atelier.dao;

import java.util.List;

import sn.atelier.entities.Produit;

public interface IProduit {
	
	public int add(Produit produit);
	public List<Produit> getAll();
	public Produit getById(int id);
	public int update(Produit produit);
	public int delete(int id);
	

}
