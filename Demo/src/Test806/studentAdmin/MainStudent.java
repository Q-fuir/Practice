package Test806.studentAdmin;



import Test806.studentAdmin.dao.Impl.StudentDaoImpl;
import Test806.studentAdmin.domain.Student;

import java.util.List;

/**
 * @author Eric Lee
 * @date 2020/8/6 15:47
 */
public class MainStudent {
    public static void main(String[] args) {
        System.out.println("-------- 欢迎登录low版学生管理系统---------");

        StudentDaoImpl studentDao = new StudentDaoImpl();
        System.out.println("----------学生列表------------------------");
        List<Student> list = studentDao.findAll();
        for (Student s:list){
            System.out.println(s);
        }
        System.out.println("----------保存学生------------------------");

        // new Student
//        studentDao.save();
        Student student =new Student(null,"lisi","女",60,"阜新","123456");
        boolean flag =  studentDao.save(student);
        System.out.println(flag);
        System.out.println("----------修改学生------------------------");

        // 修改
        Student student1 =new Student();
        student1.setId(4);
        student1.setScore(100);
         boolean f2=studentDao.update(student1);
         System.out.println(f2);
        System.out.println("----------删除学生------------------------");
        // 删除
         boolean flag1=studentDao.remove(3);
        System.out.println(flag);

    }
}
