package edu.codeschool.training.classes_objects.homeWork11.Task1;

public enum  Month {
        JANUARY("January",31), FEBRUARY("February",28), MARCH("March",31),
        APRIL("April",30), MAY("Mey",31), JUNE("June",30), JULY("July",31),
        AUGST("Augst",31), SEPTEMBER("September",30), OCTOBER("October",31),
        NOVEMBER("November",30), DECEMBER("December",31);

        String name;
        int  daysCount;

        Month(String name, int daysCount) {
                this.name = name;
                this.daysCount = daysCount;
        }

        @Override
        public String toString() {
                return String.format("%s-%d-%d",name,ordinal()+1,daysCount);
        }

}
