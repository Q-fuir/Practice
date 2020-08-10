package P_after_class;

public class Teacher
{
    String TeacherName;//教师姓名
    int TeacherAge;//教师年龄
    String content;//讲课内容

    public Teacher()
    {
        super();
    }

    public Teacher(String teacherName, int TeacherAge, String content)
    {
        TeacherName = teacherName;
        this.TeacherAge = TeacherAge;
        this.content = content;
    }

    public String getTeacherName()
    {
        return TeacherName;
    }

    public void setTeacherName(String teacherName)
    {
        TeacherName = teacherName;
    }

    public int TeacherAge()
    {
        return TeacherAge;
    }

    public void setTeacherAge(int TeacherAge)
    {
        this.TeacherAge = TeacherAge;
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
    public void eat(int TeacherAge,String TeacherName){
            System.out.println("年龄为"+TeacherAge+"的"+TeacherName+"正在吃饭....");
    }
    //讲课方法
    public void teach(int TeacherAge,String TeacherName,String content){
        System.out.println("年龄为"+TeacherAge+"的"+TeacherName+"正在亢奋的讲着"+content+"的知识");
    }
}
