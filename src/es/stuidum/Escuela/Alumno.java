package es.stuidum.Escuela;

public class Alumno
{
	/* Atributos */
	  private String nombre;
	  private String apellido;
	  private int edad;
	  private boolean pagado;
	  private Aula aula;

	  /* Constructor por defecto */
	  public Alumno () 
	  {
	    nombre = "";
	    apellido = "";
	    edad = 0;
	    pagado = false;
	    aula = new Aula();
	  }
	 
	  /* Constructor con parámetros */
	  public Alumno (String n, String a, int e, boolean p, Aula au) 
	  {
	    nombre = n;
	    apellido = a;
	    edad = e;
	    pagado = p;
	    aula = au;
	  }

	public boolean isPagado()
	{
		return pagado;
	}

	public void setPagado(boolean pagado)
	{
		this.pagado = pagado;
	}

	public Aula getAula()
	{
		return aula;
	}

	public void setAula(Aula aula)
	{
		this.aula = aula;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getApellido()
	{
		return apellido;
	}

	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}

	public int getEdad()
	{
		return edad;
	}

	public void setEdad(int edad)
	{
		this.edad = edad;
	}
}
