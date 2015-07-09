package unsa.edu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.http.*;



@SuppressWarnings("serial")
public class ModificarCurso extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query q = pm.newQuery(Alumnos.class);
		
		String codigo = req.getParameter("codigo");
		String nombre = req.getParameter("nombre");
		q.setFilter("codigo == codigoParam");
		q.declareParameters("String codigoParam");
		
		try{
			List<Curso> alu = (List<Curso>) q.execute(codigo);
			resp.getWriter().println("<p>EXITO EN CAMBIAR</p>");
			resp.getWriter().println("<p>El siguiente nombre</p>");
			for(Curso p: alu){
				resp.getWriter().println(p.toString() + "\n");
				resp.getWriter().println("<p>Se modifico" + p.getNomcurso() + " por " + nombre);
				p.setNomcurso(nombre);
			}
		}catch(Exception e){
			resp.getWriter().print("Ups .. ERROR");
		}finally{
			 q.closeAll();
		}
	}
}
