package model;

import java.util.Scanner;

public class Academia {

  // atributos
  private Curso[] cursos = new Curso[500];
  private int cantCursos;
  private float totalIngresos;
  private int inscripciones;

  // metodos constructores
  public Academia(){ // por defecto
  }

  public Academia(float totalIngresos, int inscripciones){ // con parametros
    this.totalIngresos = totalIngresos;
    this.inscripciones = inscripciones;
  }

  // getters
  public float getTotalIngresos(){
    return totalIngresos;
  }

  public int getInscripciones(){
    return inscripciones;
  }

  // metodos
  public void agregarCurso(Curso c){
    if (cantCursos < cursos.length) {
      cursos[cantCursos] = c;
      cantCursos++;
    } else {
      System.out.println("Ya no se pueden agregar cursos");
      System.out.println("Cantidad limite de cursos: 500");
    }
  }

  public void inscribirEstudiante(String codigoCurso) throws Exception{
    for (int i = 0; i < cantCursos; i++) {
      if (cursos[i] != null && cursos[i].getCodigo().equals(codigoCurso)) {
        float precioFinal = cursos[i].;
        System.out.println("Has sido inscripto correctamente");
        totalIngresos += precioFinal;
        inscripciones++;
      } else {
        throw new CursoNoDisponibleException("El curso no está disponible");
      }
    }
  }

  public void mostrarCursosDisponibles(){
    for (int i = 0; i < cursos.length; i++){
      System.out.println(cursos[i]);
    }
  }
}
