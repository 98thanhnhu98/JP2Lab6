package JP2Lab6.part1.ex1;

public class Doctor implements Comparable {
    private String name = "";
    private int task = 0;
    public Doctor(String name , int task){
        this.name = name;
        this.task = task;
    }

    public Doctor(){}

    public int compareTo(Object obj){
        Doctor doctor = (Doctor) obj;
        int a = 0 ;
        int b = 0;

        a= this.task;
        b= this.task;

        if (a < b){
            return -1;
        }
        if (a > b){
            return 1;
        }
        return 0;
    }
    public String toString(){
        return "\nThe Doctor is apppinted for = " + name + "\nThe prority " +
                "for the appointment is = " + task;
    }

}
