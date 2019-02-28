package JTG.recipe.APICapstoneLab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import JTG.recipe.APICapstoneLab.entity.RecipeApi;

@Controller
public class RecipeController {
	
/*	@Autowired
	private RecipeDao productDao;*/
    @Autowired
    private ApiService apiService;
	
	
	@RequestMapping("/")
	public ModelAndView showHome() {
	    List<RecipeApi> hits = apiService.getRecipeApiResponse("chicken");
		ModelAndView mav = new ModelAndView("index", "hits", hits);
		return mav;
	}
	
	

}
