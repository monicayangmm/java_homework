<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
  </head>
  <body>
  <%--  <strong>HI ${student.name} ,</strong> <br/>
   <strong>HI ${student.age} ,</strong>  --%>
        <table border="1" align="center">
          <tr>
            <th>序号</th>
        	<th>姓名</th>
        	<th>年龄</th>
        	<th>班级</th>
        	<th>地址</th>
          </tr>
          <c:forEach var="st" items="${students }">
         	<tr>
         		<td>${st.id }</td>
         		<td>${st.name }</td>
         		<td>${st.age }</td>
         		<td>${st.grade.getName()}</td>
         		<td>${st.address.getAddress() }</td>
         	</tr>
         	
         </c:forEach>
         </table>
  </body>
</html>
