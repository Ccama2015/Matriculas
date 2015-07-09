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
public class RegistroCurso extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		      
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		String nombre = req.getParameter("nombre");
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		int creditos = Integer.parseInt(req.getParameter("creditos"));
		
		try {
			Curso alu = new Curso(nombre,codigo,creditos);
			pm.makePersistent(alu);
			resp.getWriter().print("GUARDADO\n" + alu.toString());
		} catch (Exception e) {
			resp.getWriter().print("ERROR");
		} finally {
			pm.close();
		}
	}
}
