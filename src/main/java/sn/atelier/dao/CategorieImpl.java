package sn.atelier.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sn.atelier.entities.Categorie;

public class CategorieImpl implements ICategorie{

	private EntityManager em;
	private int ok=0;
	
	
	public CategorieImpl() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("AtelierJPA");
		em=emf.createEntityManager();
	}

	@Override
	public int add(Categorie categorie) {
		try {
			
		
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return ok;
	}

	@Override
	public List<Categorie> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Categorie categorie) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
