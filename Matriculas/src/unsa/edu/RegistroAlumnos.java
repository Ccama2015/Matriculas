package unsa.edu;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class RegistroAlumnos extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		      
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		String cui = req.getParameter("cui");
		String nombre = req.getParameter("nombre");
		String apellidoPaterno = req.getParameter("apellidoPaterno");
		String apellidoMaterno = req.getParameter("apellidoMaterno");
		
		try {
			Alumnos alu = new Alumnos(cui, nombre, apellidoPaterno, apellidoMaterno);
			pm.makePersistent(alu);
			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/registroAlumno.jsp");
			rd.forward(req, resp);
			resp.getWriter().print("GUARDADO\n" + alu.toString());
		} catch (Exception e) {
			resp.getWriter().print("ERROR");
		} finally {
			pm.close();
		}
	}
}
