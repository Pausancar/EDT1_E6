package es.stuidum.Escuela;

public class Aula
{
	/* Atributos */
	  private String nombre;
	  private int numAlumnos;

	  /* Constructor por defecto */
	  public Aula () 
	  {
	    nombre = "";
	    numAlumnos = 0;
	  }
	 
	  /* Constructor con parámetros */
	  public Aula (String n, int num) 
	  {
	    nombre = n;
	    numAlumnos = num;
	  }

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public int getNumAlumnos()
	{
		return numAlumnos;
	}

	public void setNumAlumnos(int numAlumnos)
	{
		this.numAlumnos = numAlumnos;
	}
}
