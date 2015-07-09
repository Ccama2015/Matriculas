package unsa.edu;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import javax.jdo.PersistenceManager;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class RegistroProfesores extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		      
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		String DNI = req.getParameter("DNI");
		String Nombre = req.getParameter("Nombre");
		String ApellidoPaterno = req.getParameter("ApellidoPaterno");
		String ApellidoMaterno = req.getParameter("ApellidoMaterno");
		String FechaNacimiento = req.getParameter("FechaNacimiento");
		String Sexo = req.getParameter("Sexo");
		String Direccion = req.getParameter("Direccion");
		String Departamento = req.getParameter("Departamento");
		String Provincia = req.getParameter("Provincia");
		String Distrito = req.getParameter("Distrito");
		String GradoAcademico = req.getParameter("GradoAcademico");
		String DepartamentoAcademico = req.getParameter("DepartamentoAcademico");
		String CursosAcargo = req.getParameter("CursosAcargo");
		
		try {
			Profesor profe = new Profesor(DNI, Nombre, ApellidoPaterno, ApellidoMaterno, FechaNacimiento, Sexo,
					Direccion, Departamento, Provincia, Distrito, GradoAcademico, DepartamentoAcademico, CursosAcargo);
			pm.makePersistent(profe);
			resp.getWriter().print("GUARDADO\n" + profe.toString());
		} catch (Exception e) {
			resp.getWriter().print("ERROR");
		} finally {
			pm.close();
		}
	}
}
