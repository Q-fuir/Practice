package Test806.studentAdmin.dao;

import Test806.studentAdmin.domain.Student;

import java.util.List;

public interface StudentDao {
    // 学生列表 查询所有学生
    public List<Student> findAll();
    //  保存某个学生
    public boolean save(Student student);
    //  删除某个学生
    public boolean remove(Integer id);
    //  修改某个学生
    public boolean update(Student student);

}
