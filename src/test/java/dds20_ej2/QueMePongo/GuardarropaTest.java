package dds20_ej2.QueMePongo;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dds20_ej2.QueMePongo.Prenda.Categoria;
import dds20_ej2.QueMePongo.Prenda.Tipo;

public class GuardarropaTest {
	private Prenda camisa = new Prenda( );
	private Prenda remera = new Prenda( );
	private Prenda pantalon = new Prenda( );
	private Prenda zapatos = new Prenda( );
	private Prenda aros = new Prenda( );
	private Guardarropa vestir = new Guardarropa();
	private Guardarropa deportivo = new Guardarropa();

	@Before
	public void init() throws CategoriaInvalidaException {
		camisa.CargarPrenda(Tipo.CAMISA, Categoria.SUPERIOR, "algodon", "azul");
		remera.CargarPrenda(Tipo.REMERA, Categoria.SUPERIOR, "algodon", "azul");
		pantalon.CargarPrenda(Tipo.PANTALON, Categoria.INFERIOR, "jean", "azul","negro" );
		zapatos.CargarPrenda(Tipo.ZAPATOS, Categoria.CALZADO, "cuero", "negro" );
		aros.CargarPrenda(Tipo.AROS, Categoria.ACCESORIOS, "oro", "oro" );

		vestir.agregarPrendaAlGuardarropas(camisa);
		vestir.agregarPrendaAlGuardarropas(remera);
		vestir.agregarPrendaAlGuardarropas(pantalon);
		vestir.agregarPrendaAlGuardarropas(zapatos);
		vestir.agregarPrendaAlGuardarropas(aros);
	}

	@Test
	public void generarAtuendoTest() throws PrendasInsuficientesException  {
		List<Prenda> atuendo = vestir.generarAtuendos();
		Assert.assertTrue(atuendo.size()>=3);
	}
	@Test (expected=PrendasInsuficientesException.class)
	public void prendasInsuficientesTest() throws PrendasInsuficientesException  {
		deportivo.agregarPrendaAlGuardarropas(remera);
		List<Prenda> atuendo = deportivo.generarAtuendos();
		Assert.assertTrue(atuendo.size()>=3);
	}

}
