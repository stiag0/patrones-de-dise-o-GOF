public class CloneFactory {

	/*
            Aqui retornamos cualquier clase o subclase de animal
            y crea una copia y lo guarda en su propia ubicación de
            memoria.
        */
	public Animal getClone(Animal animalSample) {


		return animalSample.makeCopy();
		
	}
	
}
