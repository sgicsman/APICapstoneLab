package JTG.recipe.APICapstoneLab.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class RecipeDao {
	
	@PersistenceContext
	private EntityManager em;
	


}
