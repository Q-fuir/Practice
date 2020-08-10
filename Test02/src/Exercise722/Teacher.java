package Exercise722;

public class Teacher extends Person
{
    String subject;

    public Teacher()
    {
        super();
    }

    public Teacher(String name, int age)
    {
        super(name, age);
    }

    public Teacher(String name, int age, String subject)
    {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject()
    {
        return subject;
    }

    public void setSubject(String subject)
    {
        this.subject = subject;
    }

    //讲课方法
    public void teach(){
        System.out.println(name+"老师,讲授"+subject+"课");
    }

}
