package game.dev.achievements.service;

import game.dev.achievements.entity.Achievement;
import game.dev.achievements.entity.AchievementResponse;
import game.dev.achievements.repo.AchievementRepo;
import game.dev.achievements.repo.CustopmPlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service
public class PlayerAchService {

    @Autowired
    AchievementRepo achievementRepo;
    @Autowired
    CustopmPlayerRepo custopmPlayerRepo;
        public List<AchievementResponse> getAllForPlayer(Long playerId)
        {
            List<AchievementResponse> response = new ArrayList<>();
            HashSet<String> achievedSet =  custopmPlayerRepo.getPlayerAchievements(playerId);
            List<Achievement> achievementList = (List<Achievement>) achievementRepo.findAll();
            for(Achievement achievement: achievementList)
            {
                if(achievedSet.contains(achievement.getId()))
                {
                    response.add(new AchievementResponse(achievement, true));
                }
                else
                {
                    response.add(new AchievementResponse(achievement, false));
                }
            }
            return response;
        }
}
