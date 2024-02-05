package sports.notification.pusher.controllers.football;

import java.time.Duration;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/football")
public class FootballController
{
    private static final String LEAGUES_LIST_URL = "http://api.football-data.org/v4/competitions/";

    private final RestTemplate restTemplate;

    public FootballController(final RestTemplate restTemplate)
    {
        this.restTemplate = restTemplate;
    }

    // call the function and make it to football league
    @GetMapping("/leagues")
    public List<String> getFootballLeagues(){
        List<String> list = null;
                return list;
    }

}

