package sports.notification.pusher.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import sports.notification.pusher.models.footballleague.FootballMatch;

@Service
public class FootballMatchService {

    private final Logger logger = LoggerFactory.getLogger(FootballMatchService.class);
    private final ObjectMapper objectMapper;

    public FootballMatchService(final ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public List<FootballMatch> mapResponse(final String jsonResponse) {
        final List<FootballMatch> footballMatches = new ArrayList<>();
        try {
            final JsonNode root = objectMapper.readTree(jsonResponse);
            final JsonNode matchesNode = root.get("matches");
            if (matchesNode != null && matchesNode.isArray()) {
                for (final JsonNode matchNode : matchesNode) {
                    final FootballMatch match = objectMapper.readValue(matchNode.toString(), FootballMatch.class);
                    footballMatches.add(match);
                }
            }
        } catch (final Exception e) {
            logger.error("An error occurred while mapping football matches response: {}", e.getMessage(), e);
        }
        return footballMatches;
    }
}
