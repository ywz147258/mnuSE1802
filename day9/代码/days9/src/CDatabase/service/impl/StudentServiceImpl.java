package CDatabase.service.impl;

import CDatabase.dao.StudentDao;
import CDatabase.entity.Student;
import CDatabase.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao=new StudentDao();

    //搜索
    @Override
    public List<Student> searchList(String userName) {
        Student student = new Student();
        student.setName(userName);
        return studentDao.selects(student);
    }
}
