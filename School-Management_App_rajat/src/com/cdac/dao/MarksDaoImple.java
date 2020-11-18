package com.cdac.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;


import com.cdac.dto.Marks;

@Repository
public class MarksDaoImple  implements MarksDao{

	@Autowired
	private HibernateTemplate hiber_temp;
	@Override
	public void Addmark(Marks mark) {
		hiber_temp.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				
				Transaction tr=session.beginTransaction();
				session.save(mark);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
		
	}
	
	
}


