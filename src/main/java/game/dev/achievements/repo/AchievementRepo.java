package game.dev.achievements.repo;

import game.dev.achievements.entity.Achievement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AchievementRepo extends CrudRepository<Achievement, Long> {


}
