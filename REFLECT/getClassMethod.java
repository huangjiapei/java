package Reflect;

class Target
{
    int age;
    String name;
}
public class getClassMethod
{
    public static void main(String[] args)
    {
        //1.通过类名获取
        Class c1=Target.class;

        //2.通过实例对象获取
        Target target=new Target();
        Class c2=target.getClass();

        //3.通过forName获取
        try
        {
            Class c3=Class.forName("Reflect.Target");
        }catch(ClassNotFoundException e)
        {
            System.out.println("class not found");
        }

    }
}
