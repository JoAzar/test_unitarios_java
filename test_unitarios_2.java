import org.junit.Assert;
import org.junit.Test;

public class Test_unitarios_2 {

  public int segundoValorMayorDelArreglo(int[] arreglo) {
    if(arreglo.length < 2) throw new RuntimeException("Pocos elementos");
    int max = Math.max(arreglo[0], arreglo[1]);
    int ret = Math.min(arreglo[0], arreglo[1]);
    for(int i=2; i < arreglo.length; ++i) {
      if(arreglo[i] > max) {
        ret = max;
        max = arreglo[i];
      }
      else if(arreglo[i] > ret)
        ret = arreglo[i];
    }
    return ret;
  }

  @Test(expected=RuntimeException.class)
  public void arregloConUnElemento() {
    int[] lista = {1};
    segundoValorMayorDelArreglo(lista);
  }

  @Test
  public void arregloConDosElementos() {
    int[] lista = {2,3};
    int resultado = segundoValorMayorDelArreglo(lista);
    Assert.assertEquals(2, resultado);
  }

  @Test(expected=RuntimeException.class)
  public void arregloVacio() {
    int[] lista = {};
    segundoValorMayorDelArreglo(lista);
  }

  @Test(expected=NullPointerException.class)
  public void arregloNulo() {
    int[] lista = null;
    int resultado = segundoValorMayorDelArreglo(lista);
  }

  @Test
  public void arregloConDuplicados() {
    int[] lista = {1, 2, 3, 5, 5};
    int resultado = segundoValorMayorDelArreglo(lista);
    Assert.assertEquals(5, resultado);
  }

  @Test
  public void arregloConTodosIguales() {
    int[] lista = {3,3,3,3};
    int resultado = segundoValorMayorDelArreglo(lista);
    Assert.assertEquals(3, resultado);
  }

  @Test
  public void arregloConValoresNegativos() {
    int[] lista = {-1, -2, -3, -10};
    int resultado = segundoValorMayorDelArreglo(lista);
    Assert.assertEquals(-2 ,resultado);
  }
  
}
