package sports.notification.pusher.controllers.football;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/football")
@CrossOrigin
public class FootballController
{
    private static final String LEAGUES_LIST_URL = "http://api.football-data.org/v4/teams/65/matches?season=2023";
    private final Logger logger = LoggerFactory.getLogger(FootballController.class);

    @Value("${football.api.key}")
    private String apiKey;

    public FootballController()
    {
    }

    @GetMapping("/leagues")
    public String getCompetitions()
    {
        final HttpClient client = HttpClient.newHttpClient();
        final HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(LEAGUES_LIST_URL))
                .header("X-Auth-Token", apiKey) // Don't forget to replace this with your actual API token
                .build();

        try
        {
            final HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200)
            {
                return response.body();
            }
            else
            {
                logger.error("Failed to fetch competitions. Status code: {}", response.statusCode());
            }
        }
        catch (final Exception e)
        {
            logger.error("An error occurred while fetching competitions", e);
        }
        return null;
    }
}


