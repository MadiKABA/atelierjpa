package sn.atelier.dao;

import java.util.List;

import sn.atelier.entities.Categorie;

public interface ICategorie {
	
	public int add(Categorie categorie);
	public List<Categorie> getAll();
	public Categorie getById(int id);
	public int update(Categorie categorie);
	public int delete(int id);

}
