package JTG.recipe.APICapstoneLab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.restserver.dao.ProductDao;

@Controller
public class RecipeController {
	
	@Autowired
	private RecipeDao productDao;
	
	
	@RequestMapping("/")
	public ModelAndView showHome() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	

}
