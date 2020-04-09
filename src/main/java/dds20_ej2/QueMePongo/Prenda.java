package dds20_ej2.QueMePongo;

public class Prenda {

	//private String nombre;
	private Tipo tipo;
	private Categoria categoria;
	private String tela;
	private String colorPrincipal;
	private String colorSecundario;

	public enum Tipo {
		CAMISA , REMERA, PANTALON , ZAPATOS, AROS
	}
	public enum Categoria {
		SUPERIOR, CALZADO, INFERIOR, ACCESORIOS
	}

	private void validarCategoria() throws CategoriaInvalidaException {
		switch (categoria) {
		case SUPERIOR :
			if (tipo != Tipo.CAMISA && tipo != Tipo.REMERA)
				throw new CategoriaInvalidaException();
			break;
		case CALZADO:
			if (tipo != Tipo.PANTALON)
				throw new CategoriaInvalidaException();
			break;
		case INFERIOR:
			if (tipo != Tipo.ZAPATOS)
				throw new CategoriaInvalidaException();
			break;
		case ACCESORIOS:
			if (tipo != Tipo.AROS)
				throw new CategoriaInvalidaException();
			break;
		default:
			break;
		}
	}
	public void CargarPrenda( Tipo tipo, Categoria categoria, String tela, String colorPrincipal) throws CategoriaInvalidaException {
		this.tipo = tipo;
		this.categoria = categoria;
		this.tela = tela;
		this.colorPrincipal = colorPrincipal;
		validarCategoria();
	}
	public void CargarPrenda(Tipo tipo, Categoria categoria, String tela, String colorPrincipal, String colorSecundario) throws CategoriaInvalidaException {
		this.tipo = tipo;
		this.categoria = categoria;
		this.tela = tela;
		this.colorPrincipal = colorPrincipal;
		this.setColorSecundario(colorSecundario);
		validarCategoria();
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public String getTela() {
		return tela;
	}
	public void setTela(String tela) {
		this.tela = tela;
	}
	public String getColorPrincipal() {
		return colorPrincipal;
	}
	public void setColorPrincipal(String colorPrincipal) {
		this.colorPrincipal = colorPrincipal;
	}
	public String getColorSecundario() {
		return colorSecundario;
	}
	public void setColorSecundario(String colorSecundario) {
		this.colorSecundario = colorSecundario;
	}


}
