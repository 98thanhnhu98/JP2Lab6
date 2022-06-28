package JP2Lab6.Part4;

public class Car<N,M,P>{
    private int id;
    private N Name;
    private M prive;
    private P production;
    public Car(){}
    public Car(int id,N Name,M price,P production) throws IllegalAccessException , InstantiationException{
        this.id = id;
        this.Name = Name;
        this.prive= price;
        this.production = production;
    }
    public int getId() {
        return id;
    }

    public N getName() {
        return Name;
    }

    public M getPrive() {
        return prive;
    }

    public P getProduction() {
        return production;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", prive=" + prive +
                ", production='" + production + '\'' +
                '}';
    }
}
