package sports.notification.pusher.models.footballleague;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record FootballDataResponse(
        @JsonProperty("count") int count,
        @JsonProperty("competitions") FootballLeague[] competitions
) {
}