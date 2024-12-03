package Task_2.Dineables;

public class DineableStats {
    private static int peopleServedCount = 0;
    private static int robotsServedCount = 0;

    public static void setPeopleServedCount(int peopleServedCount) {
        DineableStats.peopleServedCount = peopleServedCount;
    }

    public static int getPeopleServedCount() {
        return peopleServedCount;
    }

    public static void setRobotsServedCount(int robotsServedCount) {
        DineableStats.robotsServedCount = robotsServedCount;
    }

    public static int getRobotsServedCount() {
        return robotsServedCount;
    }
}
