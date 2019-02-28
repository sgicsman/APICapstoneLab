package JTG.recipe.APICapstoneLab.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import grandcircus.labs.CoffeeShopApp.Item;

@Repository
@Transactional
public class RecipeDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<Item> findAll() {
		return em.createQuery("FROM Item", Item.class).getResultList();
	}
	
	public Item findById(Long id) {
		return em.find(Item.class, id);
	}
		


}
