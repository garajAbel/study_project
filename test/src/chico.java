public class chico extends dog{
    public int age;
    public String color;
    @Override
    public void voice(){
        System.out.println("Hello from chico class");
    }
    public chico(int age,String color){
        this.age = age;
        this.color = color;
    }
    public static int getLeg(){
        return leg;
    }
    public static int getEyes(){
        return eyes;
    }
    public String getColor(){
        return color;
    }
    public int getAge(){
        return age;
    }
}
