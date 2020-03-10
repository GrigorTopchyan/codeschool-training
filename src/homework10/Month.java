package homework10;

public enum Month {
    JANUARY("JANUARY",31), FEBRUARY("FEBRUARY",28), MARCH("MARCH",31),
    APRIL("APRIL",30), MAY("MAY",31), JUNE("JUNE",30),
    JULY("JULY",31), AUGUST("AUGUST",31), SEPTEMBER("SEPTEMBER",30),
    OCTOBER("OCTOBER",31), NOVEMBER("NOVEMBER",30), DECEMBER("DECEMBER",31);
    private String name;
    private int daysCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDaysCount() {
        return daysCount;
    }

    public void setDaysCount(int daysCount) {
        this.daysCount = daysCount;
    }

    Month(String name, int daysCount) {
        this.name = name;
        this.daysCount = daysCount;
    }
}
