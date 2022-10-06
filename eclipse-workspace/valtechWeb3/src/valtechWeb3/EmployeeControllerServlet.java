package valtechWeb3;

import java.io.IOException;

import java.util.List;

import javax.management.RuntimeErrorException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;
import org.apache.jasper.tagplugins.jstl.core.Catch;
import com.valtech.dao.Employee;
import com.valtech.dao.EmployeeDAO;


@WebServlet(urlPatterns= {"/empCtlr"})
public class EmployeeControllerServlet extends HttpServlet {
	
	private EmployeeDAO dao;
	
	@Override
	public void init() throws ServletException {
		dao=new EmployeeDAO();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String submit= req.getParameter("submit");
		try {
		
		if("New Employee".equals(submit)){
			req.getRequestDispatcher("CreateEmp.jsp").forward(req, resp);
			return;
		}
		
		if("updateEmp".equals(submit)) {
            //dao=new EmployeeDAO();
            Employee e= new Employee();
            int id = Integer.parseInt(req.getParameter("id"));
            e.setId(id);
            e.setName(req.getParameter("name"));
            e.setAge(Integer.parseInt(req.getParameter("age")));
            e.setGender(req.getParameter("gender"));
            e.setSalary(Double.parseDouble(req.getParameter("salary")));
            dao.updateEmployee(e);
            
        }
		
		if("Save".equals(submit)) {
			Employee e=new Employee();
			e.setId(dao.getNextValidId());
			e.setName(req.getParameter("name"));
			e.setAge(Integer.parseInt(req.getParameter("age")));
			e.setGender(req.getParameter("gender"));
			e.setSalary(Double.parseDouble(req.getParameter("salary")));
			dao.saveEmployee(e);
		}else {
			
		}
		loadEmpsAndGotoEmpsPage(req, resp);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

	private void loadEmpsAndGotoEmpsPage(HttpServletRequest req, HttpServletResponse resp)
			throws Exception, ServletException, IOException {
		List<Employee> emps = dao.getEmployees();
        req.setAttribute("emps", emps);
		req.getRequestDispatcher("Emps.jsp").forward(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//logic here and forward it to jsp page;
		try {
			String empId = req.getParameter("empId");
			String submit =req.getParameter("submit");
			
            if (empId == null) {
            	loadEmpsAndGotoEmpsPage(req, resp);;
                return;
            
		}
        
		int id=Integer.parseInt(req.getParameter("empId"));
		
		if("update".equals(submit)) {
            Employee e = dao.getEmployee(id);
            req.setAttribute("e", e);
            req.getRequestDispatcher("Update.jsp").forward(req,resp);
            return;
        }
		
		if("delete".equals(submit)) {
			dao.getEmployee(id);
			loadEmpsAndGotoEmpsPage(req, resp);
			dao.deleteEmployees(id);
            return;
		}
			Employee e=dao.getEmployee(id);
			req.setAttribute("e", e);
			req.getRequestDispatcher("Emp.jsp").forward(req, resp);
			
		}catch (Exception ex) {
			throw new RuntimeException(ex);
		}
		
	}
	
}
