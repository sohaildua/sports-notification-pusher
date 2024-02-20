package sports.notification.pusher.models.footballleague;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record FootballMatch(
        @JsonProperty("id") int id,
        @JsonProperty("homeTeam") Team homeTeam,
        @JsonProperty("awayTeam") Team awayTeam,
        @JsonProperty("score") Score score,
        @JsonProperty("odds") Odds odds,
        @JsonProperty("referees") Referee[] referees
) {}

