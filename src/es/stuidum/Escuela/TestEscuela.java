package es.stuidum.Escuela;

public class TestEscuela
{

	public static void main(String[] args) {
		Aula dam = new Aula("dam", 15);
		Aula daw = new Aula("daw", 16);
		
		Alumno ana = new Alumno("Ana", "Abad", 19, true, daw);
		Alumno benito = new Alumno("Benito", "Bueno", 25, false, daw);
		Alumno carmen = new Alumno("Carmen", "Cid", 23, false, dam);
		
		System.out.println(ana.getApellido() + " estudia en " + ana.getAula().getNombre());
		System.out.println(benito.getApellido() + " estudia en " + benito.getAula().getNombre());
		System.out.println(carmen.getApellido() + " estudia en " + carmen.getAula().getNombre());
	}
}
