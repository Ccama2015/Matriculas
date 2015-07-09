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
public class RelacionCurso extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		Query q = pm.newQuery(Curso.class);

		String temp = "";

			
			try{
				List<Curso> personas = (List<Curso>)q.execute(temp);
					out.println("<br><br><table border='1' width='100%' class='listar_registros'><tr><th>Nombre curso</th><th>Creditos</th><th>Profesor</td><th>Departamento academico</th><th>codigo</th><th>Pre requisitos</th><th>Horas</th><th>Numero de grupos</th></tr>");
					for(Curso p:personas){
						out.print("<tr>");
						out.println("<td>"+p.getNomcurso() + "</td><td>" +p.getCreditos()+ "</td><td>" +  p.getProfesor()+ "</td><td>" + p.getDeptacademico() +"</td><td>" + p.getCodigo() +"</td><td>" + p.getPrerequisitos() +"</td><td>" + p.getHoras() +"</td><td>" + p.getGrupos() +"</td><td> <a href=remove?name="+ p.getCodigo() +">Eliminar</a></td>");
						out.print("</tr>");
					}
					out.println("</table>");
					out.println("<a href=../NewFile.jsp>Regresar</a>");
			}catch(Exception e){}
				finally{
					 q.closeAll();
			}
	}
}