package sports.notification.pusher.models.footballleague;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Referee(
        @JsonProperty("id") int id,
        @JsonProperty("name") String name,
        @JsonProperty("type") String type,
        @JsonProperty("nationality") String nationality
) {}
