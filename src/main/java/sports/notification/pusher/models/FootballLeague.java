package sports.notification.pusher.models;

public record FootballLeague(long id,long areaId,String areaName, String areaCode, String areaFlag,
                             String name,String code, String type,String emblem, String plan, long currentSeasonId,
                             String currentSeasonStartDate, String currentSeasonEndDate, String currentSeasonCurrentMatchday,
                             String currentSeasonWinnerm, int numberOfAvailableSeasons, String lastUpdated)
{
}
