public class Main {
    public static void main(String[] args){
// creating an object of the class
//        Car myCar = new Car("Toyota", "Corolla", "Black", 2024);
//        myCar.displayDetails();

//        Rectangle rectangle = new Rectangle(9, 6);
//        int area = rectangle.CalculateArea();
//        System.out.println("Area of a rectangle:" + area);

        Person1 person1 = new Person1();
        // setting name using setter method
        person1.setName("Nomso");

        //setting occupation
        person1.setOccupation("Software Developer");

        //setting stateof origin
        person1.setStateOfOrigin("Imo State");

        //setting age
//        person1.setAge(30);
        person1.setAge(-6);

        //using getter method to get the data
        System.out.println("Name:" + person1.getName());
        System.out.println("Occupation:" + person1.getOccupation());
        System.out.println("State of Origin:" + person1.getStateOfOrigin());
        System.out.println("Age:" + person1.getAge());

    }
}
