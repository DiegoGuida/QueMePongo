package dds20_ej2.queMePongo;

import static org.hamcrest.CoreMatchers.instanceOf;

import org.junit.Assert;
import org.junit.Test;

import dds20_ej2.queMePongo.Prenda.Categoria;
import dds20_ej2.queMePongo.Prenda.Tipo;

public class PrendaTest {

	private Prenda prenda1 = new Prenda( );
	private Prenda prenda2 = new Prenda( );
	private Prenda prenda3 = new Prenda( );

	@Test
	public void cargarPrendaCorrecta() throws CategoriaInvalidaException {
		prenda1.CargarPrenda(Tipo.CAMISA, Categoria.SUPERIOR, "algodon", "azul");
		prenda2.CargarPrenda(Tipo.REMERA, Categoria.SUPERIOR, "algodon", "azul");
		Assert.assertThat(prenda1, instanceOf(Prenda.class));
	}

	@Test (expected=CategoriaInvalidaException.class)
	public void cargarPrendaIncorrecta() throws CategoriaInvalidaException {
		prenda3.CargarPrenda(Tipo.PANTALON, Categoria.SUPERIOR, "jean", "azul","negro" );
		Assert.assertThat(prenda3, instanceOf(Prenda.class));
	}
}
