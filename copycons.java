class Copycons
{
    String name;
    int age;
    
    Copycons(String name,int age)
    {
        this.name=name;
        this.age=age;
        System.out.println(this.age);

    }
    Copycons(Copycons copy )
    {
        this.name=copy.name;
        this.age=copy.age;
        System.out.println(this.name);

    }
    public static void main(String args[])
    {
        Copycons original = new Copycons("mathi",19);
        Copycons copy = new Copycons(original);
    }
}