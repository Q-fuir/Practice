package Exercise722;

public class Student extends  Person
{
    int score;//学科

    public Student()
    {
        super();
    }

    public Student(int score)
    {
        this.score = score;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public Student(String name, int age, int score)
    {
        super(name, age);
        this.score = score;
    }

    //考试方法
    public  void test(){
        System.out.println(name+"同学,考试得了："+score+"分");
    }
}
