<%-- <%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%> --%>
<%@page import="com.valtech.dao.Employee"%>
<%@page import="com.valtech.dao.EmployeeDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%List<Employee> emps=(List<Employee>) request.getAttribute("emps"); %>
    <table>
        <thead>
            <tr>
                <td>Id</td>
                <td>Name</td>
                <td>Age</td>
                <td>Gender</td>
                <td>Salary</td>
                <td>Operations</td>
            </tr>
        </thead>
        <tbody>
            <%for(Employee e:emps){%>
            <tr>
                <td><%=e.getId() %></td>
                <td><%=e.getName() %></td>
                <td><%=e.getAge() %></td>
                <td><%=e.getGender() %></td>
                <td><%=e.getSalary() %></td>
                <td><a href="empCtlr?empId=<%=e.getId() %>"><button >View Details</button></a>
                <a href="empCtlr?submit=delete&empId=<%=e.getId() %>"><button >Delete</button></a>
                <a href="empCtlr?submit=update&empId=<%= e.getId()%>"><button  >Update</button></a>
                </td>
            </tr>
            <%} %>
        
        </tbody>
        
        <!--  <a href="empCtlr?empId=1"><button >First Employee</button></a>
        <a href="empCtlr?empId=15"><button >Last Employee</button></a>-->
        
    </table>
    <form action="empCtlr" method="post">
    <input type="submit" name="submit" value="New Employee"/>
   
   
    
    </form>
    
</body>
</html>