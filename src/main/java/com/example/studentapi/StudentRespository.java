package com.example.studentapi;

public interface StudentRespository {
    void save(Student student);

    Student get(String id);

    Student delete(String id);

    void  update(Student student);
}
