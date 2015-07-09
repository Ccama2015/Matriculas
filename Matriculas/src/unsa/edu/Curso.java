package unsa.edu;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Curso {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	private String nomcurso;
	
	@Persistent
	private int creditos;
	
	@Persistent
	private int codigo;
	
	@Persistent
	private String profesor;
	
	@Persistent
	private String deptacademico;
	
	@Persistent
	private int prerequisitos;
	
	@Persistent
	private int horas;
	
	@Persistent
	private int grupos;
	
	public Curso(String nomcurso, int creditos, int codigo, String profesor,String deptacademico, int prerequisitos, int horas,int grupos) {
		super();
		this.nomcurso = nomcurso;
		this.creditos = creditos;
		this.codigo = codigo;
		this.profesor = profesor;
		this.deptacademico =deptacademico;
		this.prerequisitos =prerequisitos;
		this.horas =horas;
		this.grupos =grupos;
	}
	public Curso(String nombre,int creditos,int codigo){
		super();
		this.nomcurso = nomcurso;
		this.creditos = creditos;
		this.codigo = codigo;
	}
	public String getNomcurso() {
		return nomcurso;
	}

	public void setNomcurso(String nomcurso) {
		this.nomcurso = nomcurso;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public String getDeptacademico() {
		return deptacademico;
	}

	public void setDeptacademico(String deptacademico) {
		this.deptacademico = deptacademico;
	}
	
	public int getPrerequisitos() {
		return prerequisitos;
	}

	public void setPrerequisitos(int prerequisitos) {
		this.prerequisitos = prerequisitos;
	}
	
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	public int getGrupos() {
		return grupos;
	}

	public void setGrupos(int grupos) {
		this.grupos = grupos;
	}
	
	public Key getKey() {
		return key;
	}
	
	@Override
	public String toString() {
		String resp = nomcurso + " : " + creditos + " : " +codigo + " : " + profesor  + " : " + deptacademico + " : " + prerequisitos + " : " + horas + " : " + grupos;  
		return resp;
	}
}
