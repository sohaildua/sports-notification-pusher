package sports.notification.pusher.models.footballleague;

import com.fasterxml.jackson.annotation.JsonProperty;

public record HalfTime(
        @JsonProperty("home") int home,
        @JsonProperty("away") int away
) {}
