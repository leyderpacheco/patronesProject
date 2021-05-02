
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.sql.*,java.util.*"%>
<%
    String nombre = request.getParameter("nombre");
    session.putValue("nombre", nombre);
    String contrasenia = request.getParameter("contrasenia");
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://bt3x6sqzzia63q81xhss-mysql.services.clever-cloud.com:3306/bt3x6sqzzia63q81xhss?useSSL=false", "ucriwfoitusxxebc", "cyRHveEce5UMiKamPgJV");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("select * from `emprendedor` where nombre='" + nombre + "' and contrasenia='" + contrasenia + "'");
    try {
        rs.next();
        if (rs.getString("contrasenia").equals(contrasenia) && rs.getString("nombre").equals(nombre)) {
            
            response.sendRedirect("areasEmpren.html");
        } else {
            out.println("Invalid password or username.");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
%>