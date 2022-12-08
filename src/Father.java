public class Father extends GrandFather {

    private String name;
    private int age;



    public Father( int age, String name,Home home,Nature nature) {
        super(home,nature);
        this.name = name;
        this.age = age;


    }

    public Father(Home home, Nature nature, int age, String name) {
        super(home,nature);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public final void drive() {
        System.out.println("is driving");
    }

    public void drive(String city) {
        System.out.println(city);
    }


    public String getinfo(){
        return "Age : "  + age  +
                "Name : "  + name +
                "Nature: "  + getNature() +
                "\nHome Address: " + getHome().getAddress()+
                "\nHome name: " + getHome().getName();
    }
}