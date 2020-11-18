package com.cdac.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;


import com.cdac.dto.Student;

@Repository
public class StudentDaoImple implements StudentDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void insertStudent(Student student) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(student);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
	}

	
	@Override
	public boolean checkStudent(Student student) {
		boolean b=hibernateTemplate.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) throws HibernateException {
				Transaction tr=session.beginTransaction();
				Query q=session.createQuery("from Student where studentName = ? and mobNo = ? ");
				q.setString(0,student.getStudentName());
				q.setString(1, student.getMobNo());
				List<Student> li= q.list();
				boolean flag= !li.isEmpty();
				student.setFormNo(li.get(0).getFormNo());
				tr.commit();
				session.flush();
				session.close();
				return flag;
			}
		});
		return b;
	}

	/*@Override
	public void deleteStudent(String studentName) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.delete(new Student(studentName));
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}
*/
	@Override
	public Student selectStudent(int formNo) {
		Student student = hibernateTemplate.execute(new HibernateCallback<Student>() {

			@Override
			public Student doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Student ex = (Student)session.get(Student.class,formNo);
				tr.commit();
				session.flush();
				session.close();
				return ex;
			}
			
		});
		return student;
	}


	
	
	@Override
	public void updateStudent(Student student) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();				
				session.update(student);				
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}
		
		
		
		
		
	

	@Override
	public List<Student> selectAll(int formNo) {
		List<Student> studList=hibernateTemplate.execute(new HibernateCallback<List<Student>>() {

			@Override
			public List<Student> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q=session.createQuery("from Student where formNo = ?");
				q.setInteger(0, formNo);
				List<Student> li=q.list();
				System.out.println(li);
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
		});
		return studList;
	}


	@Override
	public List<Student> selectAll() {
		List<Student> list=	hibernateTemplate.execute(new HibernateCallback<List<Student>>() {

			@Override
			public List<Student> doInHibernate(Session session) throws HibernateException {
				Transaction tr=session.beginTransaction();
				Query q=session.createQuery("from Student");
				List<Student> li=q.list();
				return li;
			}
		});
		return list;
	}


	
	

	
}
