package weather;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	/*@Autowired
	private DailyForecastRepo dailyRepo;
	@Test
	public void DailyForecastTest() {
		apiHelper Pick = new apiHelper();
		DailyForecast gotWeather = Pick.getWeather();
		dailyRepo.save(gotWeather);
	}
	@Test
	public void weatherTest() {
		apiHelper Pick = new apiHelper();
		DailyForecast gotWeather = Pick.getWeather();
		//RestTemplate restTemplate = new RestTemplate();
		//Cards shuffle = restTemplate.getForObject("https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1", Cards.class);
		System.out.println(gotWeather);
	}
	*/

}
