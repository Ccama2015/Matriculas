package unsa.edu;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class RelacionAlumnos extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		      
		PersistenceManager pm = PMF.get().getPersistenceManager();
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		Query q = pm.newQuery(Alumnos.class);
		String temp = "";

		try{
			
			List<Alumnos> alu = (List<Alumnos>)q.execute(temp);
			out.println("<br><br><table border='1' width='100%' class='listar_registros'><tr>"
					+ "<th> CUI </td><th> NOMBRES </th><th> APELLIDOS </th><th>  DNI </th>"
					+ "<th> FECHA DE NACIMIENTO </th>" + "<th> DIRECCION </th>" + "<th> TELEFONO </th></tr>");
					
					
			for(Alumnos p:alu){
				out.print("<tr>");
				out.println("<td>"+  p.getCui()+ "</td>" + "<td>"+p.getNombre() + "</td><td>" + (p.getApellidoPaterno()+ " " + p.getApellidoMaterno())+ "</td>" 
						+ "<td>" + p.getDni()+"</td>"+ "<td>" + p.getNacimiento() + "</td>" + "<td>"+ (p.getDireccion() + " " + p.getDistrito()) +"</td>"
										+ "<td>"+p.getNumTelefono() + "</td>");
												
										out.print("</tr>");
			}
			out.println("</table>");
		}catch(Exception e){
			out.println("Ups .. ERROR");
		}finally{
			 q.closeAll();
		}
	}
}




