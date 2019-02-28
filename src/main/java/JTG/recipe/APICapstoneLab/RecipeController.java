package JTG.recipe.APICapstoneLab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import JTG.recipe.APICapstoneLab.entity.Hits;

import JTG.recipe.APICapstoneLab.entity.RecipeApiResponse;

@Controller
public class RecipeController {
	
/*	@Autowired
	private RecipeDao productDao;*/
	
    @Autowired
    private ApiService apiService;
	
	
	@RequestMapping("/")
	public ModelAndView showHome() {
	    List<Hits> hits = apiService.getRecipeApiResponse("fish");
		ModelAndView mav = new ModelAndView("index", "recipes", hits);
		return mav;
	}
	
	

}
