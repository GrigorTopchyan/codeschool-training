package HomeWork11.Months;

public enum Month {
    JANUARY (31, "JAN"), FEBRUARY(28,"FEB"),MARCH(31,"MAR"),APRIL(30,"APR"),
    MAY(31,"MAY"),JUNE(30,"JUN"),JULY(31,"JUL"),AUGUST(31,"AUG"),
    SEPTEMBER(30,"SEP"), OCTOBER(31,"OCT"),NOVEMBER(30,"NOV"),DECEMBER(31,"DEC");
    private int daysCount;
    private String name;

    Month(int daysCount, String name) {
        this.daysCount = daysCount;
        this.name = name;
    }



    @Override
    public String toString() {
        return name+"-" +(ordinal()+1)+ "-" +daysCount;
    }
}
