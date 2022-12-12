package ar.com.codoacodo.buscador;

public class HomeMain {

	public static void main(String[] args) {
		//Para crear un objeto, se hace asi:
		//Clase nombreDelObjeto = new Clase();
		Buscador miBuscador = new Buscador();
		//Ahora miBuscador esta vivo, entonces podemos ejecutar
		//cualquiera de sus metodos publicos
		
		//Primero defino cual es la clave de busqueda
		miBuscador.cambiarClave("iron man");
		//Ejecuto el metodo buscar() del objeto miBuscador
		miBuscador.buscar();
		
		//muestro la cantidad de resultados, del buscador
		System.out.println("Hemos encontrado " +miBuscador.getCantRes() + " resultados para " + miBuscador.getClaveBusqueda());
	}

}
