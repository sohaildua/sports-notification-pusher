package sports.notification.pusher.models.footballleague;

import com.fasterxml.jackson.annotation.JsonProperty;

public record FootballMatch(
        @JsonProperty("id") int id,
        @JsonProperty("homeTeam") Team homeTeam,
        @JsonProperty("awayTeam") Team awayTeam,
        @JsonProperty("score") Score score,
        @JsonProperty("odds") Odds odds,
        @JsonProperty("referees") Referee[] referees
) {}

