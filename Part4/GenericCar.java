package JP2Lab6.Part4;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

public class GenericCar{
    public GenericCar() throws IllegalAccessException, InstantiationException {
        list.add(new Car(1, "Lamborghini", 12000, ""));
        list.add(new Car(2, "Gt-R", 8000, "Japanese"));
        list.add(new Car(3, "Ferrari", 10000, "American"));
    }
    private LinkedList<Car> list = new LinkedList<Car>();
    private static Scanner sc = new Scanner(System.in);

    public void menu() {
        System.out.println("1. Add" +
                "\n2. Display" +
                "\n3. GetSize" +
                "\n4. CheckEmpty" +
                "\n5. Delete");
    }

    public void Display() {
        for (Car car1 : list) {
            System.out.println(car1.toString());
        }
    }
    public void getSize(){
        int size = list.size();
        System.out.println("size : " + size);
    }
    public void checkEmpty() {
        for (Car car1 : list) {
            if (car1.getPrive() == null || car1.getProduction() == null || car1.getName() == null){
                System.out.println(car1 + "\n --> IS NULL");
            }else if (car1.getPrive() == "" || car1.getProduction() == "" || car1.getName() == ""){
                System.out.println(car1 + "\n --> IS NULL");
            } else {
                System.out.println(car1 + "\n --> NOT NULL");
            }
        }
    }

    public void add() throws IllegalAccessException, InstantiationException {
        System.out.println("Nhập id :");
        int id = sc.nextInt();
        System.out.println("Nhập Name :");
        String a = sc.next();
        System.out.println("Nhập giá :");
        String b = sc.next();
        System.out.println("Nhập nơi sản suất");
        String make = sc.next();
        Car car = new Car(id, a, b, make);
        Pattern bCheck = compile("\\d");
        Pattern aCheck = compile("[a-zA-Z]");

        if (bCheck.matcher(b).find() & aCheck.matcher(a).find()){
            list.add(car);
        }else {
            System.err.println("ERROR INPUT");
        }
    }
    public void delete(){
        System.out.println("Nhập địa chỉ id cần xóa :");
        int id = sc.nextInt();
        try {
            for (Car car : list) {
                if (car.getId() == id) {
                    list.remove(car);
                }
            }
        }catch (Exception a){
            a.printStackTrace();
        }
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        GenericCar car = new GenericCar();
        car.menu();
        while (true){
            int chon = sc.nextInt();
            switch (chon){
                case 1:
                    car.add();
                    car.menu();
                    break;
                case 2:
                    car.Display();
                    car.menu();
                    break;
                case 3:
                    car.getSize();
                    car.menu();
                    break;
                case 4:
                    car.checkEmpty();
                    car.menu();
                    break;
                case 5:
                    car.delete();
                    car.menu();
                    break;
            }
        }
    }
}
