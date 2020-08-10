package Exercise722;

public class TestPerson
{
    public static void main(String[] args)
    {
        Teacher t = new Teacher();
        Student s = new Student();
        t.name="王小平";
        t.subject="java";
        t.teach();
        s.name="李小乐";
        s.score=90;
        s.test();

    }
}
