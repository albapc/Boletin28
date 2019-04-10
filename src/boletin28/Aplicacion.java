package boletin28;

public class Aplicacion {

    public static void main(String[] args) {
        Uno obj1 = new Uno();
        Dos obj2 = new Dos();
        Tres obj3 = new Tres();
        Cuatro obj4 = new Cuatro();

        System.out.println("obj1.test = " + obj1.test()); //1
        System.out.println("obj1.result1 = " + obj1.result1()); //1
        System.out.println("obj2.test = " + obj2.test()); //2
        System.out.println("obj2.result1 = " + obj2.result1()); //2
        System.out.println("obj3.test = " + obj3.test()); //2
        System.out.println("obj4.result1 = " + obj4.result1()); //4
        System.out.println("obj3.result2 = " + obj3.result2()); //2
        System.out.println("obj4.result2 = " + obj4.result2()); //4
        System.out.println("obj3.result3 = " + obj3.result3()); //2
        System.out.println("obj4.result3 = " + obj4.result3()); //2
        
        //this = referidos a esta clase
        // super = referidos a un objeto de la super clase (la que está por encima)
    }

}
