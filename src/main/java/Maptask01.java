import java.util.HashMap;
import java.util.Scanner;

public class Maptask01 {

    /*
map1() isminde bir method oluşturun.
Parametresi   bir Integer -String map  ve bir int
return tipi String
Tamsayı değerlerini (int) döndürün.
ÖRNEK:
Map:
              1 ,  "Lion"
              2 ,  "Tiger"
              3 ,  "Elephant"
              4 ,  "Cat"
              5  , "Dog"
Integer 3
Cevap Elephant olmalı.
*/
    public static void main(String[] args) {

        java.util.HashMap<Integer,String> hm=new java.util.HashMap<>();

        hm.put(1,"lion");
        hm.put(2,"tiger");
        hm.put(3,"elephant");
        hm.put(4,"cat");
        hm.put(5,"dog");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int number = sc.nextInt();
        System.out.println("map1(hm,number) = " + map1(hm, number));


    }// *** main sonu ***

    private static String map1(HashMap<Integer,String> hm, int number ) {


        return hm.get(number);
    }
}
