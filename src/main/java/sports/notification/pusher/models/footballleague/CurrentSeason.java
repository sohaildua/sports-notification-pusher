package sports.notification.pusher.models.footballleague;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CurrentSeason(
        @JsonProperty("id") long id,
        @JsonProperty("startDate") String startDate,
        @JsonProperty("endDate") String endDate,
        @JsonProperty("currentMatchday") int currentMatchday,
        @JsonProperty("winner") Object winner
) {
}
