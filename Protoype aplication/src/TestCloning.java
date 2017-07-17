public class TestCloning {
	
	public static void main(String[] args){
		/* 
                    Maneja las rutas del método makeCopy 
                    a las subclases de Animal
                */
		
		CloneFactory animalMaker = new CloneFactory();
		
		// Creamos una instancia de la oveja
		
		Sheep sally = new Sheep();
		
		/*
                    Creamos una copia de sally y guardamos en su propio espacio 
                    de memoria
                */              
                
                Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);
		
			
		System.out.println(sally);
		
		System.out.println(clonedSheep);
		
		System.out.println("Sally HashCode: " + System.identityHashCode(System.identityHashCode(sally)));
		
		System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(clonedSheep)));
	}
	
}

