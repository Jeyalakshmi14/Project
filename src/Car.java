public class Car {
    String model;
    String color;
    int cost;
    int milage;
    public Car(String model,String color,int cost,int milage){
        this.model=model;
        this.color=color;
        this.cost=cost;
       this. milage=milage;
    }
    public void startCar(){
        System.out.println("car started"+model);
    }
    public void stopCar(){
        System.out.println("car stopped"+model);
    }
    public void carDetails(){
        System.out.println("model of the car is "+model);
        System.out.println("color of the car is "+color);
        System.out.println("cost of the car is "+cost);
        System.out.println("milage of the car is "+milage);
    }
}
