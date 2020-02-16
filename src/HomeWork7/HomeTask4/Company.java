package HomeWork7.HomeTask4;

public class Company {
    private int employeeCount=0;
    private Employee [] array= new Employee[10];

    public  void hireEmployee(Employee employee) {
        if(employeeCount<array.length){
        array[employeeCount++]=employee;}
        else{ Employee [] newArray= new Employee[array.length*2];
            for (int i = 0; i <array.length ; i++) {
                newArray[i]=array[i];
            }
             newArray[employeeCount]=employee;

        }

    }
        public  void fireEmployee(Employee employee){
            for (int i = 0; i <array.length ; i++) {
                if(array[i].equals(employee)){
                    for (int j = 0; j <array.length-1 ; j++) {
                        array[j]=array[j+1];
                    }
                    employeeCount--;
                    array[array.length-1]=null;
                    break;


                }
            }
        }
}
