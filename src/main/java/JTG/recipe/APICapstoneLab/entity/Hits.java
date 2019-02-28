package JTG.recipe.APICapstoneLab.entity;

import java.util.List;

public class Hits {
	
	private Boolean bookmarked = false;
	private List<Recipe> recipes;
	
	
	public Boolean getBookmarked() {
		return bookmarked;
	}
	public void setBookmarked(Boolean bookmarked) {
		this.bookmarked = bookmarked;
	}
	
	
	public List<Recipe> getRecipes() {
		return recipes;
	}
	public void setRecipes(List<Recipe> recipes) {
		this.recipes = recipes;
	}

	
}
