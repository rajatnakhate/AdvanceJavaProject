package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.MarksDao;
import com.cdac.dto.Marks;

@Service
public class MarksServiceImple implements MarksService {

	@Autowired
	private MarksDao markDao;
	@Override
	public void Addmark(Marks mark) {
	markDao.Addmark(mark);
		
	}
	
	

}
