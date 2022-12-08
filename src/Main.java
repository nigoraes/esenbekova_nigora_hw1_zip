public class Main {
    public static void main(String[] args) {

Father father = new Father(40,"Adilet",new Home("Suvorova",11),Nature.KIND);
        System.out.println(father.getinfo());
        father.drive();
        father.drive("Naryn");



        Son son =new Son(new Home("Suvorova ",11),Nature.CALM,15,"Aibek","games");
        System.out.println(son.getinfo());
        son.drive();
        son.drive("Osh");


        Son son2 =new Son(new Home("Suvorova ",11),Nature.SOCIABLE,18,"Marat","talking the phone");
        System.out.println(son.getinfo());
        son.drive();
        son.drive("Bishkek");

    }
}