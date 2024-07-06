public class Car {
    String brand;
    String model;
    String color;
    int year;

        public Car(String brand, String model, String color, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public void  displayDetails(){
            System.out.println("Brand:" + brand);
        System.out.println("Model:" + model);
        System.out.println("Color:" + color);
        System.out.println("Year:" + year);
    }

}
