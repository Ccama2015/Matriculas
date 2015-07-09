package unsa.edu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;



@SuppressWarnings("serial")
public class EliminarCurso extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query q = pm.newQuery(Curso.class);
		
		String codigo = req.getParameter("codigo");
		q.setFilter("codigo == codigoParam");
		q.declareParameters("String codigoParam");
		RequestDispatcher view=req.getRequestDispatcher("WEB-INF/eliminarAlumnos.jsp");
		
		try{
			List<Curso> alu = (List<Curso>) q.execute(codigo);
			resp.getWriter().println("<p>EXITO AL BORRAR</p>");
			resp.getWriter().println("<p>El siguiente Curso</p>");
			for(Curso p: alu){
				resp.getWriter().println(p.toString());
				
				pm.deletePersistent(p);
			}
			resp.getWriter().println("<ul>");
		}catch(Exception e){
			resp.getWriter().print("Ups .. ERROR");
		}finally{
			 q.closeAll();
		}
	}
}
