package com.xworkz.excelpro.service;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.xworkz.excelpro.dto.LawyerDTO;

public class Service {
	public Service() {
		// TODO Auto-generated constructor stub
		System.out.println("created\t"+this.getClass().getSimpleName());
	}
	
	List<LawyerDTO> list=new ArrayList<LawyerDTO>();

	public List<LawyerDTO> service(String location)
	{
		System.out.println("service method invoked");
		try {
			System.out.println("starting service method");
			FileInputStream fio=new FileInputStream(location);
			Workbook workbook=new XSSFWorkbook(fio);
			System.out.println("the workbook has\t" + workbook.getNumberOfSheets() + "\tsheets:");
			
			Sheet sheet=workbook.getSheetAt(0);
			Row row;
			
			for(int i=1;i<=sheet.getLastRowNum();i++) {
				
				row=sheet.getRow(i);
				
				String name;
				if(row.getCell(1)==null) {
					name=null;
				}
				else
				{
					name=row.getCell(1).toString();
				}
				
				String exp;
				if(row.getCell(2)==null) {
					exp=null;
				}
				else
				{
					exp=row.getCell(2).toString();
				}
				
				String specialist;
				if(row.getCell(3)==null) {
					specialist=null;
				}
				else
				{
					specialist=row.getCell(3).toString();
				}
				
				String phoneNo;
				if(row.getCell(4)==null) {
					phoneNo=null;
				}
				else
				{
					phoneNo=row.getCell(4).toString();
				}
				
				String address;
				if(row.getCell(5)==null) {
					address=null;
				}
				else
				{
					address=row.getCell(5).toString();
				}
				
				
				
				LawyerDTO dto=new LawyerDTO();
				dto.setName(name);
				dto.setPhoneNo(Double.parseDouble(phoneNo));
				dto.setSpecialist(specialist);
				dto.setExp(Double.parseDouble(exp));
				dto.setAddress(address);
				
				list.add(dto);
			}
			
			return list;

		} 
		
		catch (Exception e) {
			// TODO: handle exception
			System.err.println("exception created :\t");
			e.printStackTrace();
		}

		return null;
	}
}
