package com.belajar.spring.service.impl;

import com.belajar.spring.dao.StudentDAO;
import com.belajar.spring.entity.Student;
import com.belajar.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sukenda on 29/07/18.
 * Project belajar-spring
 */

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    @Override
    public Student save(Student param) {
        return studentDAO.save(param);
    }

    @Override
    public Student update(Student param) {
        return studentDAO.update(param);
    }

    @Override
    public int delete(Student param) {
        return studentDAO.delete(param);
    }

    @Override
    public List<Student> find() {
        return studentDAO.find();
    }

    @Override
    public Student findById(int id) {
        return studentDAO.findById(id);
    }
}
