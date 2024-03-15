public class buldog extends dog{
    public final int age;
    public String color;
    public buldog(int age,String color){
        this.age = age;
        this.color = color;
    }
    @Override
    public void voice(){
        System.out.println("Hello from buldog class");
    }
    public static int getLeg(){
        return leg;
    }
    public static int getEyes(){
        return eyes;
    }
    public int getAge(){
        return age;
    }
    public String getColor(){
        return color;
    }

}
