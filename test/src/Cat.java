public class Cat {
    private String name;
    private String color;
     public Cat(String name, String color){
         this.name = name;
         this.color = color;
     }
    public String getName(){
        return name;
    }

    public void setName(String a){
        name = a;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
}
