package P_after_class;

public class Test1
{
    public static void main(String[] args)
    {
        Teacher teacher= new Teacher();
        teacher.eat(30,"周老师");
        teacher.teach(30,"周老师","java");
        Student student = new Student();
        student.eat(18,"韩同学");
        student.study(18,"韩同学","java");
    }
}
