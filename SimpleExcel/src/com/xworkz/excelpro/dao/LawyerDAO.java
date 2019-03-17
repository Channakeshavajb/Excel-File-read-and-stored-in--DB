package com.xworkz.excelpro.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xworkz.excelpro.dto.LawyerDTO;
import com.xworkz.hibernate.util.HibernateUtil;

public class LawyerDAO {
	
	public LawyerDAO() {
		// TODO Auto-generated constructor stub
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	public void save(LawyerDTO dto) {
		System.out.println("invoked save method");
		Session session=HibernateUtil.getFactory().openSession();
		Transaction tx=session.beginTransaction();
		try {
			System.out.println("saving the data:\t"+dto);
			session.save(dto);
			tx.commit();
			System.out.println("data was saved successfully");

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("exception created :\t");
			e.printStackTrace();
		}

		finally {

			session.close();
		}
		
	}

}
