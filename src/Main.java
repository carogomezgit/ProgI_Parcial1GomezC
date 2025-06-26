import model.Academia;
import model.Curso;
import model.CursoJava;
import model.Academia;

public class Main {
  public static void main(String[] args) throws Exception {

    Academia c = new Academia();

    Curso curso1 = new CursoJava("CURSO01", "abc", 8, 20000);
    Curso curso2 = new CursoJava("CURSO02", "def", 4, 25000);

    c.agregarCurso(curso1);
    c.agregarCurso(curso2);

    c.mostrarCursosDisponibles();

    c.inscribirEstudiante("CURSO01");
    c.inscribirEstudiante("CURSO02");
    c.inscribirEstudiante("CURSO03");


  }
}