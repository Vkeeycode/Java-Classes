public class Person1 {
    private String name;
    private String occupation;
    private String stateOfOrigin;
    private int age;

    // getter method for name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getStateOfOrigin() {
        return stateOfOrigin;
    }

    public void setStateOfOrigin(String stateOfOrigin) {
        this.stateOfOrigin = stateOfOrigin;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0){
        this.age = age;
    } else {
            System.out.println("invalid age");
        }
    }
}