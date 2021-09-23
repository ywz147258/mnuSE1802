package CDatabase.service;

import CDatabase.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> searchList(String userName);
}
