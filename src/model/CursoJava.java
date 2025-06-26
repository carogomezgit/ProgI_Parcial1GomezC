package model;

public class CursoJava extends Curso implements Inscribible {

  // atributos
  private float porcDescuento = 0.90f;

  public CursoJava(String codigo, String nombre, int duracionHoras, float precioBase) {
    super(codigo, nombre, duracionHoras, precioBase);
  }

  @Override
  public String getLenguaje() {
    return "Java";
  }

  @Override
  public float calcularCostoFinal() {
    if (duracionHoras > 5)
      return precioBase * porcDescuento;
    return precioBase;
  }
}
