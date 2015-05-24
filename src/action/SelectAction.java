package action;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import persistance.Plans;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.HibernateSessionFactory;

public class SelectAction extends ActionSupport {
	private int idplans;

	static Plans query(int id) {
		
		Session s = null;
		Transaction tx = null;
		List plans = null;

		Plans plan  = null;
		try {
			s = HibernateSessionFactory.getSession();
			tx = s.beginTransaction();
			plan =  (Plans) s.get(Plans.class, id);
			tx.commit();
		} finally {
			if (s != null)
				s.close();
		}
		return  plan;

	}

	public String execute() {
		System.out.println("这里是action" + idplans);
		Plans plan = null;
		if ((plan  = query(idplans)) != null)
		{
			System.out.println("查询成功");
			  ActionContext actionContext = ActionContext.getContext();
		        Map session = actionContext.getSession();
		        session.put("selectedplan", plan);
			return "selectsuccess";
		}
		return null;

	}

	public int getIdplans() {
		return idplans;
	}

	public void setIdplans(int idplans) {
		this.idplans = idplans;
	}

}
