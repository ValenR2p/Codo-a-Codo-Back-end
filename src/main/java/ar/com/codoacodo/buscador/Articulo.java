package ar.com.codoacodo.buscador;

public class Articulo {
	//atributos
	private String img;
	private String titulo;
	private String autor;
	private float precio;
	//constructores
	public Articulo() {
		
	}
	//metodos
	//VOID significa que retorna ningun dato u valor
	public void detalle() {
		//mostrar por consola los datos, en este caso del objeto
		System.out.println("Imagen: " + img);
		System.out.println("Titulo: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Precio: " + precio);
	}
}
