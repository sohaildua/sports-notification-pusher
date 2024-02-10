package sports.notification.pusher.models.footballleague;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Area(
        @JsonProperty("id") long id,
        @JsonProperty("name") String name,
        @JsonProperty("code") String code,
        @JsonProperty("flag") String flag
) {
}
