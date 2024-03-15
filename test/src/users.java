public class users {
    private String name;
    protected int ID;
    private int age;
    private String password = "";

    public users(String name,int age){
        this.name = name;
        this.age = age;
        this.ID = IDusers.sum();
    }


    public void setPassword(String password) {
        this.password = password;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getPassword(){
        return password;
    }
    public int getID(){
        return ID;
    }

}
