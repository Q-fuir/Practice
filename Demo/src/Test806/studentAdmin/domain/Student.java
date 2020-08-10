package Test806.studentAdmin.domain;

/**
 *CREATE TABLE `studentmanage` (
 *   `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '学生id',
 *   `name` varchar(20) NOT NULL COMMENT '学生姓名',
 *   `gender` varchar(6) DEFAULT NULL COMMENT '性别',
 *   `score` int(6) DEFAULT NULL COMMENT '学生成绩',
 *   `addr` varchar(20) DEFAULT NULL COMMENT '地址',
 *   `tel` varchar(20) DEFAULT NULL COMMENT '学生电话',
 *   PRIMARY KEY (`id`)
 * ) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
 */
public class Student {
    // JavaBean
    private  Integer id;
    private  String name;
    private  String gender;
    private  Integer score;
    private  String  addr;
    private String tel;

    public Student() {}

    public Student(Integer id, String name, String gender, Integer score, String addr, String tel)
    {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.score = score;
        this.addr = addr;
        this.tel = tel;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public Integer getScore()
    {
        return score;
    }

    public void setScore(Integer score)
    {
        this.score = score;
    }

    public String getAddr()
    {
        return addr;
    }

    public void setAddr(String addr)
    {
        this.addr = addr;
    }

    public String getTel()
    {
        return tel;
    }

    public void setTel(String tel)
    {
        this.tel = tel;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                ", addr='" + addr + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
