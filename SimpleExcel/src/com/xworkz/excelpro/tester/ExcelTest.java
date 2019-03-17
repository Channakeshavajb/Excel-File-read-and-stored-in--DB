package com.xworkz.excelpro.tester;

import java.util.Iterator;
import java.util.List;

import com.xworkz.excelpro.dao.LawyerDAO;
import com.xworkz.excelpro.dto.LawyerDTO;
import com.xworkz.excelpro.service.Service;
import com.xworkz.hibernate.util.HibernateUtil;

public class ExcelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Service services= new Service();
		List<LawyerDTO> list=services.service("Lawyer.xlsx");
		Iterator<LawyerDTO> iterator=list.iterator();
		while(iterator.hasNext()) {
		
			LawyerDTO dto=(LawyerDTO)iterator.next();
			LawyerDAO dao=new LawyerDAO();
			dao.save(dto);
		}
		
		HibernateUtil.getFactory().close();
	}

}
