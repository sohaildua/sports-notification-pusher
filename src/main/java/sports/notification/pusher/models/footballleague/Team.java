package sports.notification.pusher.models.footballleague;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Team(
        @JsonProperty("id") int id,
        @JsonProperty("name") String name,
        @JsonProperty("shortName") String shortName,
        @JsonProperty("tla") String tla,
        @JsonProperty("crest") String crest
) {}
