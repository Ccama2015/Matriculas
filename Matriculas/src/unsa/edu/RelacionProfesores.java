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
public class RelacionProfesores extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		Query q = pm.newQuery(Profesor.class);

		String temp = "";

			
			try{
				List<Profesor> profe = (List<Profesor>)q.execute(temp);
					out.println("<br><br><table border='1' width='100%' class='listar_registros'><tr>"
							+ "<th> DNI </td><th> NOMBRES </th><th> APELLIDOS </th><th>  FECHA DE NACIMIENTO </th>"
							+ "<th> DIRECCION </th>" + "<th> TELEFONO </th>" + "<th> CURSOS A CARGO </th></tr>");
							
							
					for(Profesor p:profe){
						out.print("<tr>");
						out.println("<td>"+  p.getDNI()+ "</td>" + "<td>"+p.getNombre() + "</td><td>" + (p.getApellidoPaterno()+ " " + p.getApellidoMaterno())+ "</td>" 
								+ "<td>" + p.getFechaNacimiento()+"</td>"+ "<td>"+ (p.getDireccion() + " " + p.getDistrito()) +"</td>"
												+ "<td>"+p.getTelefono() + "</td><td>"+p.getCursosAcargo() + "</td>");
														
												out.print("</tr>");
					}
					out.println("</table>");
			}catch(Exception e){
				out.println("Ups .. ERROR");
			}
				finally{
					 q.closeAll();
			}
	}
}