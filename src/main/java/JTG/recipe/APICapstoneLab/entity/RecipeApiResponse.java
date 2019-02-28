package JTG.recipe.APICapstoneLab.entity;

import java.util.List;

public class RecipeApiResponse {
	
	private Integer count;
	public List <Hits> hits;
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public List<Hits> getHits() {
		return hits;
	}
	public void setHits(List<Hits> hits) {
		this.hits = hits;
	}
	

}
