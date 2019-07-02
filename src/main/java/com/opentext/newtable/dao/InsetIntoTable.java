package com.opentext.newtable.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opentext.newtable.dto.NewTableBean;

public class InsetIntoTable {
	
	  public static void main( String[] args )
	    {
	    	
	Configuration cfg=new Configuration();
	    	cfg.configure("hibernate.cfg.xml");
	    	cfg.addAnnotatedClass(NewTableBean.class);
	    	
	    	
	    	
	    	
	    	
	    	NewTableBean nb=new NewTableBean();
	    
	    	nb.setEmp_attitude("average");
	    	nb.setEmp_extcurr("swim");
	    	nb.setEmp_social("average");
	    	
	    	
	    	
	    	
	    	   SessionFactory factory=cfg.buildSessionFactory();
	           Session s=factory.openSession();
	           
	           
	          Transaction t=s.beginTransaction();
	           s.save(nb);
	           t.commit();
	           s.close();
	           
	    }


}
