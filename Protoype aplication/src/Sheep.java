public class Sheep implements Animal {
        
	public Sheep(){
		
		System.out.println("La oveja es creada");
		
	}
	
	public Animal makeCopy() {
		
		System.out.println("Se copia la oveja");
		
		Sheep sheepObject = null;
		
		try {
			
			/*
                           Llamamos la clase Animal con el metodo Super
                           luego convertimos el resultado a objeto oveja
                        */
			sheepObject = (Sheep) super.clone();
			
		}
		/*
                   Si la clase animal no tuviera el extenden Cloneable nos sacara
                   un error.
                */

		
		catch (CloneNotSupportedException e) {
			  
			System.out.println("Mcdonalds se encargo de la oveja");
			
			e.printStackTrace();
			  
		 }
		
		return sheepObject;
	}
	
        /* 
           En esta función cambiamos el nombre del objeto, es fundamental para
           que cuando en el futuro la llamemos no salga el nombre del objeto,
           ya que sería algo como (nombre de la clase) + @(numeros y letras)
           Ejemplo: Sheep@12d2315
        */
	public String toString(){
		
		return "sebas estuvo aquí";
		
	}
	
}
