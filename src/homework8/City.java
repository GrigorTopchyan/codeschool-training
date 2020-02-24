package homework8;

public class City {
    private String name;
    private long countOfResidents;
    private double surface;

//    public City() {
//    }

    public City(String name, long countOfResidents, double surface) {
        this.name = name;
        this.countOfResidents = countOfResidents;
        this.surface = surface;
    }



    @Override
    public String toString() {
        return  "  " +
                 name + '\n' +
                "     Count of residents: " + countOfResidents +'\n'+
                "     Surface: " + surface +'\n';
    }
}
