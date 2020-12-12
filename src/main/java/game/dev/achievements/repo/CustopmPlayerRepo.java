package game.dev.achievements.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashSet;

@Repository
public class CustopmPlayerRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public HashSet<String> getPlayerAchievements(Long playerId)
    {
        HashSet<String> achieved = new HashSet<>();
        String query = "select achId from Player_Ach where playerId=?";
        //todo change it in order

        jdbcTemplate.query(query, new Long[]{playerId}, (rs, rowNum) ->{
                    achieved.add(rs.getString("ach_Id"));
                    return null;
                });
        return achieved;
    }
}
