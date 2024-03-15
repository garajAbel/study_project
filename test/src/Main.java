import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    public int test = 1234;
//    private String[] info = {"Zangar","23.08.2008","Saktapbrgen","Akhantay"};
    public static void main(String[] args) {
//        Cat friscas = new Cat("Friscas","white,brone");
//        int[] list1 = algorithms.test();
//        int[] list2 = {12,32,45,67,843,12,100,56,67};
//        list2 = Sort(list2);
//        for(String elem : info){
//            System.out.println(elem);
//        }
//        if(algorithms.test()){
//            System.out.println("Hello Zangar");
//            String[] info = algorithms.Info();
//            for(String elem : info){
//                System.out.println(elem);
//            }
//        }
//        else{
//            System.out.println("Password is not a true");
//        }
//        test2();
        chico dog1 = new chico(10,"black");
        buldog dog2 = new buldog(12,"white");
        System.out.println("test 1 completed");
        dog1.voice();
        dog2.voice();
        System.out.println("test 2 completed");
        System.out.println(chico.getEyes() + " " + buldog.getLeg());
        System.out.println("test 3 completed");

    }



    public static int[] Sort(int[] list){
        int max;

        for(int i =0;i < list.length;i++){
            for(int j=0;j< list.length;j++){
                if (list[j] > list[i] ){
                    max = list[i];
                    list[i] = list[j];
                    list[j] = max;
                }

            }
        }
        return list ;
    }
    public static void test2(){
        int num = 1;
        while(true){
            System.out.print(num + " ");
            if(num >= 512 ){
                break;
            }
            num = num * 2;

        }
    }
}
