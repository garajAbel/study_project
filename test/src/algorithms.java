import java.util.Scanner;

public class algorithms extends Main {
    public static boolean test(){
        Scanner scan = new Scanner(System.in);
        int code = scan.nextInt();
        boolean res = Admin(code);
        return res;

    }
    public static int Code(){
        return 23082008;
    }
    public static boolean Admin(int code){
        if(code == Code()){
            return true;

        }
        else{
            return false;
        }
    }
    public static String[] Info(){
        String data = "23.08.2008";
        String fullName = "Saktapbergen Zangar Akhantayuli";
        String study = "'Orda' college";
        String[] Info = {data,fullName,study};
        return Info;

    }
}
