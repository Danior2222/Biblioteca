<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>..::Bank::..</title>
</head>
<body>
	 <table border="5%" style="width: 100%" bgcolor="#BDBDBD">
  	<jsp:include page="Estado.jsp" />  
	<br></br>
	<br></br>
	
    </table>
	
	<h1 align="center"> ..::Register Advisor::..</h1>
	
	<table  align="center" border="1" bgcolor="grey">
	<br></br>
	<br></br>
		<tr>
			<td><a href="<%=request.getContextPath()%>/Listservlet">Lista de Usuarios</a></td>
		</tr>
	
	</table>

 <form action="<%=request.getContextPath()%>/Profileservlet" method="post">
	<table border="5%" style="width: 30%" bgcolor="#BDBDBD" align="center">

			
			<TR>
				<center>
					<TD>Identification</TD>
					<center />
					<center>
						<td><input type="text" name="identification"/></td>
						<center />
			</TR>
			<TR>
				<center>
					<TD>First Name</TD>
					<center />
					<center>
						<td><input type="text" name="firstName"/></td>
						<center />
			</TR>
			<TR>
				<center>
					<TD>Last Name</TD>
					<center />
					<center>
						<td><input type="text" name="lastName"/></td>
						<center />
			</TR>
			<TR>
				<center>
					<TD>Phone</TD>
					<center />
					<center>
						<td><input type="text" name="phone"/></td>
						<center />
			</TR>
			<TR>
				<center>
					<TD>Email</TD>
					<center />
					<center>
						<td><input type="text" name="email"/></td>
						<center />
			</TR>

			<TR>
				<center>
					<TD>Username</TD>
					<center />
					<center>
						<td><input type="text" name="username"/></td>
						<center />
			</TR>
			<TR>
				<center>
					<TD>Password</TD>
					<center />
					<center>
						<td><input type="text" name="password"/></td>
						<center />
			</TR>
			
			</table>
		<br>
		<center>
			<input type="submit" value="Register"/>			
		</center>
		<br>
	
			</table>
	</form>
</body>
</html>