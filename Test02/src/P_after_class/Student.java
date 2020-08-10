package P_after_class;

public class Student
{
    String StudentName;//学生姓名
    int StudentAge;//学生年龄
    String content;//学习内容

    public Student()
    {
        super();
    }

    public Student(String studentName, int studentAge, String content)
    {
        StudentName = studentName;
        StudentAge = studentAge;
        this.content = content;
    }

    public String getStudentName()
    {
        return StudentName;
    }

    public void setStudentName(String studentName)
    {
        StudentName = studentName;
    }

    public int getStudentAge()
    {
        return StudentAge;
    }

    public void setStudentAge(int studentAge)
    {
        StudentAge = studentAge;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    //吃饭方法
    public void eat(int StudentAge,String StudentName){
        System.out.println("年龄为"+StudentAge+"的"+StudentName+"正在吃饭....");
    }
    //讲课方法
    public void study(int StudentAge,String StudentName,String content){
        System.out.println("年龄为"+StudentAge+"的"+StudentName+"正在专心致志的听着"+content+"的知识");
    }
}
