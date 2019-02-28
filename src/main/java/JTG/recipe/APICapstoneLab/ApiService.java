package JTG.recipe.APICapstoneLab;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import JTG.recipe.APICapstoneLab.entity.Hits;

import JTG.recipe.APICapstoneLab.entity.RecipeApiResponse;

@Component
public class ApiService {
	
	private RestTemplate restTemplate = new RestTemplate();

	//private RestTemplate restTemplateWithUserAgent;
	
//	public List<Card> drawCards(int count) {
//		String url = "https://deckofcardsapi.com/api/deck/3l0483xpl21f/draw/?count=" + count;
//
//		DrawCardsResponse response = restTemplateWithUserAgent.getForObject(url, DrawCardsResponse.class);
//
//		return response.getCards();
//	}
	public List<Hits> getRecipeApiResponse(String query) {
	String url = UriComponentsBuilder.fromHttpUrl("https://api.edamam.com/search")
			.queryParam("q", query)
			.queryParam("app_id", "6b761d3c")
			.queryParam("app_key", "30dec420259202ca868638f285001cf2")
			.queryParam("to", 10)
			.toUriString();
	System.out.println(url);
	RecipeApiResponse response = restTemplate.getForObject(url, RecipeApiResponse.class);
	return response.getHits();	

}
}
