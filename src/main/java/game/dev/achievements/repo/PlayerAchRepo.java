package game.dev.achievements.repo;

import game.dev.achievements.entity.PlayerAch;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerAchRepo extends CrudRepository<PlayerAch, Long> {

}
