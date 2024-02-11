package sports.notification.pusher.controllers.football;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import sports.notification.pusher.models.footballleague.FootballDataResponse;

@RestController
@RequestMapping("/football")
public class FootballController
{
    private static final String LEAGUES_LIST_URL = "http://api.football-data.org/v4/competitions/";
    private final Logger logger = LoggerFactory.getLogger(FootballController.class);
    private final RestTemplate restTemplate;

    public FootballController(final RestTemplate restTemplate)
    {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/leagues")
    public ResponseEntity<?> getFootballLeagues() {
        try {
            final FootballDataResponse response = restTemplate.getForObject(LEAGUES_LIST_URL, FootballDataResponse.class);
            logger.debug("Response Entity: {}", response);
            return ResponseEntity.ok(response);
        } catch (final RestClientException e) {
            final String errorMessage = "Error fetching football leagues: " + e.getMessage();
            logger.error(errorMessage);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
        }
    }
}


