//paquete
package ar.com.codoacodo.buscador;

//nombre de clase
public class Buscador {
	
	//Programacion orientada a objetos (Atributos privados)
	
	
	//atributos
	private String claveBusqueda;
	
	
	private Articulo[] resultados;//Articulo es un vector el cual sera igual a resultados
	
	private int cantidadResultados;
	
	
	
	//constructor; funciona como una funcion
	public Buscador() {
		System.out.println("Nace un buscador");
		
		
		
		//Cuando nace, definimos el tamaño del resultado
		resultados = new Articulo[0];
		//Con lo de arriba se crea un array/vector vacio
		//para su uso futuro, pues es distinto a javaScript
		
		
		//Dentro de un array solo se puede meter el valor 
		//definido de dicho array, en este solo se pueden meter 
		//articulos, no se pueden meter floats, int, double,etc
	}
	
	//metodos
	//Esto es una funcion
	public void buscar() {
		System.out.println("Buscando " + claveBusqueda);
		
		//Aca debo de cargar el array de resultados con objetos
		//de la clase Articulo
		//Simular que encontramos 3 resultados
		
		Articulo res1 = new Articulo();
		Articulo res2 = new Articulo();
		Articulo res3 = new Articulo();
		
		
		//Instacio nuevamente el array de resultados
		resultados = new Articulo[3];//Lenght 0 1 2
		
		resultados[0] = res1;
		resultados[1] = res2;
		resultados[2] = res3;
		
		//Muestro la cantidad de resultados encontradps
		cantidadResultados = resultados.length;
	} 
	
	public void cambiarClave(String nuevaClave) {
		claveBusqueda = nuevaClave;
	}
	
	public int getCantRes() {
		return cantidadResultados;
	}
	
	public String getClaveBusqueda() {
		if(claveBusqueda == null) {
			return "";
		}
		return claveBusqueda;
	}

	
	//VISIBILIDAD: - es private; + es public; # es protected
	//Todas las clases tienen un constructor por defecto
	//El constructor sirve para definir valores por defecto
}
