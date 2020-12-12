package game.dev.achievements.entity;

public class AchievementResponse {
    Achievement achievement;
    boolean achieved;

    public AchievementResponse() {
    }

    public AchievementResponse(Achievement achievement, boolean achieved) {
        this.achievement = achievement;
        this.achieved = achieved;
    }

    public Achievement getAchievement() {
        return achievement;
    }

    public void setAchievement(Achievement achievement) {
        this.achievement = achievement;
    }

    public boolean isAchieved() {
        return achieved;
    }

    public void setAchieved(boolean achieved) {
        this.achieved = achieved;
    }
}
