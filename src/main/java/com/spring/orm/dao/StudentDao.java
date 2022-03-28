package com.spring.orm.dao;
import java.util.*;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import com.spring.orm.entites.Student;

import antlr.collections.List;
public class StudentDao {
private HibernateTemplate hiber;
@Transactional //  @Transactional annotation se hum insert,update,delete perform ker skte hai.
public int insert (Student st)
{
	Integer r=(Integer) this.hiber.save(st);
	return r;
}
@Transactional
public void updateStudent(Student st)
{
	this.hiber.update(st);
}
@Transactional
public void delStudent(Student st)
{
	this.hiber.delete(st);
}
public Student showStudent(int sid)
{
	Student student=this.hiber.get(Student.class, sid);
	return student;
}
public ArrayList<Student> showAllStudent()
{
	ArrayList<Student> student=(ArrayList<Student>) this.hiber.loadAll(Student.class);
	return student;
}
public HibernateTemplate getHiber() {
	return hiber;
}
public void setHiber(HibernateTemplate hiber) {
	this.hiber = hiber;
}
}