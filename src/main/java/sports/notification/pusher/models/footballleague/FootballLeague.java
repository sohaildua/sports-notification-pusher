package sports.notification.pusher.models.footballleague;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record FootballLeague(
        @JsonProperty("id") long id,
        @JsonProperty("area") Area area,
        @JsonProperty("name") String name,
        @JsonProperty("code") String code,
        @JsonProperty("type") String type,
        @JsonProperty("emblem") String emblem,
        @JsonProperty("plan") String plan,
        @JsonProperty("currentSeason") CurrentSeason currentSeason,
        @JsonProperty("numberOfAvailableSeasons") int numberOfAvailableSeasons,
        @JsonProperty("lastUpdated") String lastUpdated
) {
}
