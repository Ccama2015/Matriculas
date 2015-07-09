package unsa.edu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ModificarProfesor extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query q = pm.newQuery(Profesor.class);
		
		String DNI = req.getParameter("DNI");
		String Nombre = req.getParameter("Nombre");
		q.setFilter("DNI == DNIParam");
		q.declareParameters("String DNIParam");
		
		try{
			List<Profesor> profe = (List<Profesor>) q.execute(DNI);
			resp.getWriter().println("<p>EXITO EN CAMBIAR</p>");
			resp.getWriter().println("<p>El siguiente nombre</p>");
			for(Profesor p: profe){
				resp.getWriter().println(p.toString() + "\n");
				resp.getWriter().println("<p>Se modifico" + p.getNombre() + " por " + Nombre);
				p.setNombre(Nombre);
			}
		}catch(Exception e){
			resp.getWriter().print("Ups .. ERROR");
		}finally{
			 q.closeAll();
		}
	}
}
