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


import com.cdac.dto.Faculty;
import com.cdac.dto.Student;

@Repository
public class FacultyDaoImple implements FacultyDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void insertFaculty(Faculty faculty) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			//for  inserting the data 
			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(faculty);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
	}

	//for checking that faculty is registerd or not properly ..login 
	@Override
	public boolean checkFaculty(Faculty faculty) {
		boolean b=hibernateTemplate.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) throws HibernateException {
				Transaction tr=session.beginTransaction();
				Query q=session.createQuery("from Faculty where facultyName = ? and facultyPass = ? ");
				q.setString(0,faculty.getFacultyName());
				q.setString(1, faculty.getFacultyPass());
				List<Faculty> li= q.list();
				boolean flag= !li.isEmpty();
				faculty.setFormNo(li.get(0).getFormNo());
				tr.commit();
				session.flush();
				session.close();
				return flag;
			}
		});
		return b;
	}

	
		
	}

	
	
	

