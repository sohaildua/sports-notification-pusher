package sports.notification.pusher.models.footballleague;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Odds(
        @JsonProperty("msg") String message
) {}
