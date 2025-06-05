import org.junit.Assert; //JUnit 4
import org.junit.Test;

public class busquedaTest() {
  public boolean buscar(int[] b, int x) {
    int i = 0;
    while(i < b.length && b[i] != x)
      ++i;
    if(i < b.length)
      return true;
    else
      return false;
  }
  
  @Test
  public void buscarValorInexistenteTest() {
    int[] listaDeEnteros = {1,2,3};
    int buscado = -3;
    boolean resultado = buscar(listaDeEnteros, buscado);
    Assert.assertFalse(resultado);
  }
  
  @Test
  public void buscarValorExistente() {
    int[] listaDeEnteros = {1,2,3};
    int buscado = 3;
    boolean resultado = buscar(listaDeEnteros, buscado);
    Assert.assertTrue(resultado);
  }

  @Test(expected=NullPointerException.class)
  public void buscarEnListaVacia() {
    int[] listaDeEnteros = {};
    int buscado = 2;
    buscar(listaDeEnteros, buscado);
  }

  @Test(expected=NullPointerException.class)
  public void buscarEnListaNula() {
    int[] listaDeEnteros = null;
    int buscado = 1;
    buscar(listaDeEnteros, buscado);
  }
  
  @Test
  public void buscarNegativosEnListaNegativa() {
    int[] listaDeEnteros = {-1, -3, -5, -10};
    int buscado = -10;
    boolean resultado = buscar(listaDeEnteros, buscado);
    Assert.assertEquals(-10, resultado);
  }
    
}
