package JTG.recipe.APICapstoneLab.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import JTG.recipe.APICapstoneLab.entity.RecipeApiResponse;

@Repository
@Transactional
public class RecipeDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<RecipeApiResponse> findAll() {
		return em.createQuery("FROM RecipeSQL", RecipeApiResponse.class).getResultList();
	}
	
//	public  findById(Long id) {
//		return em.find(.class, id);
//	}
		


}
