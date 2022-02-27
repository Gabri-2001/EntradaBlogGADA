
package EntradaBlogGADA;

/* La clase se creó el 27/02/2022 por Gabriel Ademar.
 * Esta es la modificación de la versión 2.3
 */
/*Al crear la clase como EntradaBlogGADA se debe modificar el nombre de la clase "EntradaBlog+INICIALES" a "EntradaBlogGADA"
*/
public class EntradaBlogGADA {

	
	
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	
	
	/*Al crear la clase como EntradaBlogGADA se debe modificar el nombre del constructor "EntradaBlog" a "EntradaBlogGADA"
	*/
	public EntradaBlogGADA(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/*
	 * Los métodos getID, getTexto, getAutor, devuelveAutor, realmente no se utilizan en ningún momento debido a que el modificador
	 * private no afecta si el main se encuentra en la misma clase. En el caso de que tuvieramos el main en otra clase, deberiamos 
	 * usar dichos métodos de esta forma: NOMBRE_Constructor_Declarado + . + NOMBRE MÉTODO -> Ejemplo: e1.getAutor (en el caso del String autor)*/
	public int getId(){
		return this.id;
	}
	
	
	public String getTexto(){
		return this.texto;
	}
	
	
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	
	public String devuelveAutor(){
		return this.autor;
	}
	
		public static void main(String[] args) {
			/*Al crear la clase como EntradaBlogGADA se debe modificar la declaración del constructor "EntradaBlog" a "EntradaBlogGADA"
			*/
			EntradaBlogGADA e1=new EntradaBlogGADA (1,"ana","Últimas noticias, está disponible BixBy 2.0");
			EntradaBlogGADA e2=new EntradaBlogGADA (1,"Pedro","Últimas noticias, está disponible BixBy 2.0");
			System.out.println(e1);
			System.out.println(e2);
		}
	}

