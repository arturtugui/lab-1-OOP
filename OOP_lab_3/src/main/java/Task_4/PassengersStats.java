package Task_4;

public class PassengersStats {
    private static int PeopleTotalCount = 0;
    private static int RobotsTotalCount = 0;

    public static int getPeopleTotalCount() {
        return PeopleTotalCount;
    }

    public static void setPeopleTotalCount(int peopleTotalCount) {
        PeopleTotalCount = peopleTotalCount;
    }

    public static int getRobotsTotalCount() {
        return RobotsTotalCount;
    }

    public static void setRobotsTotalCount(int robotsTotalCount) {
        RobotsTotalCount = robotsTotalCount;
    }
}
