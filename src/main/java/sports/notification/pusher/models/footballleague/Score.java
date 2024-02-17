package sports.notification.pusher.models.footballleague;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Score(
        @JsonProperty("winner") String winner,
        @JsonProperty("duration") String duration,
        @JsonProperty("fullTime") FullTime fullTime,
        @JsonProperty("halfTime") HalfTime halfTime
) {}
