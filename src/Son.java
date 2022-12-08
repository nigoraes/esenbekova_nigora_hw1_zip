public final class Son extends Father{

    private String habits;
    public Son(Home home,Nature nature,int age,String name,String habits) {
        super(home,nature,age,name);
        this.habits= habits;


    }

    public String getHabits() {
        return habits;
    }

    public  void  saying (){
        System.out.println();
    }

    public String getinfo(){
        return "Age : "  + getAge()  +
                "Name : "  + getName() +
                "Nature: "  + getNature() +
                "\nHome Address: " + getHome().getAddress()+
                "\nHome name: " + getHome().getName();
    }
}
