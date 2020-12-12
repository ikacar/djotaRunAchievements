package game.dev.achievements.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Achievement{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;
    String description;
    //consider createing independent entyty gift
    //    Gift gift;

    char type;
    Long powerUpId;
    Long amount;
    public Achievement() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public Long getPowerUpId() {
        return powerUpId;
    }

    public void setPowerUpId(Long powerUpId) {
        this.powerUpId = powerUpId;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
