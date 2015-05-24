package action;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import persistance.Firepreventionstation;
import persistance.Plans;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.HibernateSessionFactory;

public class FirstAction extends ActionSupport {
	private int operand1;
	private int operand2;

	static List query() {
		System.out.println("测试:");
		Session s = null;
		Transaction tx = null;
		List plans = null;

		try {
			s = HibernateSessionFactory.getSession();
			tx = s.beginTransaction();
			String sql = "SELECT * from plans";
			Query que = s.createSQLQuery(sql).addEntity(Plans.class);
			plans = que.list();
		} finally {
			if (s != null)
				s.close();
		}
		return plans;

	}

	public String execute() throws Exception {

		Map request = (Map) ActionContext.getContext().get("request");
		List plans = query();
		System.out.println(plans.size());
		Iterator it = plans.iterator();
		while (it.hasNext()) {
			Plans msg = (Plans) it.next();
			System.out.println(msg.getDesigner());
		}

		if (plans != null) // 如果代码数和是非负整数，跳到positive.jsp页面
		{
			request.put("plans", plans);
			System.out.print(request.size())  ;
			return "positive";
		} else // 如果代码数和是负整数，跳到negative.jsp页面
		{
			return "negative";
		}
	}

	public int getOperand1() {
		return operand1;
	}

	public void setOperand1(int operand1) {
		System.out.println(operand1);
		this.operand1 = operand1;
	}

	public int getOperand2() {
		return operand2;
	}

	public void setOperand2(int operand2) {
		System.out.println(operand2);
		this.operand2 = operand2;
	}

}