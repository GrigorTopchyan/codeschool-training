package edu.codeschool.training.enams;

public enum Month {
    JANUARY(30,"Jan"),FEBRUARY(28,"Feb"),MARCH(30,"March"),APRIL(31,"April"),
    MAY(30,"May"),JUNE(31,"Jun"),JULY(30,"Jul"),AUGUST(31,"August"),
    SEPTEMBER(30,"Sep"),OCTOBER(31,"Oct"),NOVEMBER(30,"Nov"),DECEMBER(31,"Dec");


    private int daysCount;
    private String name;

    Month(int daysCount, String name) {
        this.daysCount = daysCount;
        this.name = name;
    }

    @Override
    public String toString() {
        return  name + " - "+ (ordinal()+1) + " - " + daysCount;
    }
}
