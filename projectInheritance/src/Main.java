
import static com.sun.source.util.DocTrees.instance;
import java.util.Arrays;
import projectinheritance.Lingkaran;
import java.util.Random;
import projectinheritance.Silinder;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        Lingkaran ling = new Lingkaran(5);
        System.out.println(ling.toString());
//        Lingkaran[] arr = new Lingkaran[5];
        //Silinder[] arr = new Silinder[5];
        Lingkaran[] arr = new Lingkaran[5];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            int rand_int1 = rand.nextInt(2);
            int rand_int2 = rand.nextInt(10);
            int rand_int3 = rand.nextInt(10);
//            System.out.println(rand_int1);
            if (rand_int1 == 0) {
                System.out.println("Lingkaran : "+ i);
                arr[i] = new Lingkaran(rand_int2);
            } else {
                System.out.println("Silinder : " + i);
                arr[i] = new Silinder(rand_int2, rand_int3);
            }
        }
        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
////            if( arr[i] instanceof Lingkaran){
////                System.out.println(arr[i]);
////            } else 
//            if (arr[i] instanceof Silinder){
//                System.out.println((Silinder) arr[i]);
//            }
//        }
    }
    
}
