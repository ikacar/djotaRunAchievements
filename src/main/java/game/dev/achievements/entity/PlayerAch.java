package game.dev.achievements.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Time;

@Entity
public class PlayerAch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Long playerId;
    Long achId;
    Time time;

    public PlayerAch() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public Long getAchId() {
        return achId;
    }

    public void setAchId(Long achId) {
        this.achId = achId;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
