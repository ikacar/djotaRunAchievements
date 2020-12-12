package game.dev.achievements.controller;

import game.dev.achievements.entity.Achievement;
import game.dev.achievements.entity.AchievementResponse;
import game.dev.achievements.entity.PlayerAch;
import game.dev.achievements.repo.AchievementRepo;
import game.dev.achievements.repo.PlayerAchRepo;
import game.dev.achievements.service.PlayerAchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("achievement")
public class AchievementController {

    @Autowired
    AchievementRepo achievementRepo;
    @Autowired
    PlayerAchRepo playerAchRepo;
    @Autowired
    PlayerAchService playerAchService;
    //**********Achievement sifrnik**********
    @GetMapping("/getAll")
    public List<Achievement> getAllAchievements()
    {
        return (List<Achievement>) achievementRepo.findAll();
    }
    @PostMapping("/add")
    public void addAchievement(Achievement ach)
    {
        achievementRepo.save(ach);
    }
    @DeleteMapping("/remove/{id}")
    public void removeAchievement(@RequestParam Long id)
    {
        achievementRepo.deleteById(id);
    }

    //********** Achievements - Player ***************

    @GetMapping("/player/getAchieved")
    public List<AchievementResponse> getAchieved(Long playerId)
    {
        return playerAchService.getAllForPlayer(playerId);
    }
    @PostMapping("/player/addAchieved")
    public void addAchieved(PlayerAch playerAch)
    {
        //change repsonse (not void)
        //todo at the end check if it is his 3rd achievement today if it is send him extra ball
        playerAchRepo.save(playerAch);
    }


}
