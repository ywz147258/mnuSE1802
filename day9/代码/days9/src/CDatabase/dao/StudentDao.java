package CDatabase.dao;

import CDatabase.entity.Student;

import java.util.List;

public class StudentDao implements Dao<Student>{

    //查询
    @Override
    public List<Student> selects(Student student){
        //select * from student where name like name
        return null;
    }
}
