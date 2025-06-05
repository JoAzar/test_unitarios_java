import org.junit.Assert; //JUnit 4
import org.junit.Test;

public busquedaTest() {
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
}
