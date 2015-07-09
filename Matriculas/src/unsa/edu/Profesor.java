package unsa.edu;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Profesor {
	@PrimaryKey
	
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private String Nombre;
	
	@Persistent
	private String ApellidoPaterno;
	
	@Persistent
	private String ApellidoMaterno;
	
	@Persistent
	private String DNI;
	
	@Persistent
	private String Direccion;
	
	@Persistent
	private String Departamento;
	
	@Persistent
	private String Provincia;
	
	@Persistent
	private String Distrito;
	
	@Persistent
	private String FechaNacimiento;
	
	@Persistent
	private String Sexo;
	
	@Persistent
	private int Telefono;
	
	@Persistent
	private String GradoAcademico;
	
	@Persistent
	private String DepartamentoAcademico;
	
	@Persistent
	private String CursosAcargo;
	
	public Profesor (String DNI, String Nombre,String ApellidoPaterno, String ApellidoMaterno,String FechaNacimiento,String Sexo, 
			String Direccion,String Departamento,String Provincia,String Distrito, 
			String GradoAcademico, String DepartamentoAcademico, String CursosAcargo ){
		
		this.Nombre = Nombre;
		this.ApellidoPaterno =ApellidoPaterno;
		this.ApellidoMaterno =ApellidoMaterno;
		this.DNI = DNI;
		this.FechaNacimiento = FechaNacimiento;
		this.Sexo = Sexo;
		this.Direccion = Direccion;
		this.Departamento = Departamento;
		this.Provincia = Provincia;
		this.Distrito = Distrito;
		this.GradoAcademico = GradoAcademico;
		this.DepartamentoAcademico = DepartamentoAcademico;
		this.CursosAcargo = CursosAcargo;
	}
		public String getNombre() {
		return Nombre;
	}
	public String getApellidoPaterno() {
		return ApellidoPaterno;
	}
	public String getApellidoMaterno() {
		return ApellidoMaterno;
	}
	public String getDNI() {
		return DNI;
	}
	public String getFechaNacimiento() {
		return FechaNacimiento;
	}
	public String getSexo() {
		return Sexo;
	}
	public String getDireccion() {
		return Direccion;
	}
	public String getDepartamento() {
		return Departamento;
	}
	public String getProvincia() {
		return Provincia;
	}
	public String getDistrito() {
		return Distrito;
	}
	public int getTelefono() {
		return Telefono;
	}
	public String getGradoAcademico() {
		return GradoAcademico;
	}
	public String getDepartamentoAcademico() {
		return DepartamentoAcademico;
	}
	public String getCursosAcargo() {
		return CursosAcargo;
	}
	
	
	public void setNombre (String nom) {
		this.Nombre = nom;
	}
	public void setApellidoPaterno (String aPaterno) {
		this.ApellidoPaterno = aPaterno;
	}
	public void setApellido (String aMaterno) {
		this.ApellidoMaterno = aMaterno;
	}
	public void setDNI (String dni) {
		this.DNI = dni;
	}
	public void setFechaNacimiento (String fech) {
		this.FechaNacimiento = fech;
	}
	public void setSexo (String sexo) {
		this.Sexo = sexo;
	}
	public void setDireccion (String direc) {
		this.Direccion = direc;
	}
	public void setDepartamento (String depar) {
		this.Departamento = depar;
	}
	public void setProvincia (String prov) {
		this.Provincia = prov;
	}
	public void setDistrito (String distr) {
		this.Distrito = distr;
	}
	public void setTelefono (int tel) {
		this.Telefono = tel;
	}
	public void setGradoAcademico (String gradoaca) {
		this.GradoAcademico = gradoaca;
	}
	public void setDepartamentoAcademico (String deacad) {
		this.DepartamentoAcademico = deacad;
	}
	public void setCursosAcargo (String curso) {
		this.CursosAcargo = curso;
	}
	
	@Override
	public String toString() 
	{
		return "Nombres: " + Nombre + "     " + "ApellidosPaterno: " + ApellidoPaterno + "     "
				+ "ApellidosMaterno: " + ApellidoMaterno + "     " + "DNI: " + DNI 
				+ "     " + "Fecha de Nacimiento: " + FechaNacimiento  +"     "+ "Sexo: " + Sexo + 
				"     "+ "Direccion: " + Direccion
				+ "     "+ "Departamento: " + Departamento + "     " + "Provincia: " + Provincia + "     " + 
				"Distrito: " + Distrito +"     "
                 + "Telefono: " + Telefono + "     " + "Grado Academico: " + GradoAcademico + "     " + 
				"Departamento Academico: " + DepartamentoAcademico + "     "+ "Cursos a Cargo: " + CursosAcargo +
				"<br>-------------------------------------------------------------------------------------------------------------------------------------------------------------------";
	}
	
}