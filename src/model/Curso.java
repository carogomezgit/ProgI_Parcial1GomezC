package model;

public abstract class Curso implements Inscribible {

  // atributos
  private String codigo;
  private String nombre;
  protected int duracionHoras;
  protected float precioBase;

  // metodo constructor
  public Curso(String codigo, String nombre, int duracionHoras, float precioBase){
    this.codigo = codigo;
    this.nombre = nombre;
    this.duracionHoras = duracionHoras;
    this.precioBase = precioBase;
  }

  // getters
  public String getCodigo(){
    return codigo;
  }

  public String getNombre(){
    return nombre;
  }

  public int getDuracionHoras(){
    return duracionHoras;
  }

  public float getPrecioBase(){
    return precioBase;
  }

  // setters
  public void setCodigo(String codigo){
    this.codigo = codigo;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public void setDuracionHoras(int duracionHoras){
    this.duracionHoras = duracionHoras;
  }

  public void setPrecioBase(float precioBase){
    this.precioBase = precioBase;
  }

  // metodo abstracto
  public abstract String getLenguaje();

  // metodos
  @Override
  public String toString() {
    return "Curso: " + codigo
        + "\nNombre: " + nombre
        + "\nLenguaje: " + getLenguaje()
        + "\nDuracion en Horas: " + duracionHoras
        + "\nPrecio Base: " + precioBase;
  }

  public void mostrarCurso(){
    System.out.println(toString());
  }
}
