
package Exeption_Handling;
class abc
{
    void ab()throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
    }
}
public class throws_demo {
    public static void main(String args[]) throws ClassNotFoundException
    {
        Class.forName("com.mysql.jdbc.Driver");
    }
}
