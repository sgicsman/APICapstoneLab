package JTG.recipe.APICapstoneLab.entity;

import java.util.List;

public class RecipeApiResponse {
	
	public List <RecipeApi> hits;

	public List<RecipeApi> getHits() {
		return hits;
	}

	public void setHits(List<RecipeApi> hits) {
		this.hits = hits;
	}


}
