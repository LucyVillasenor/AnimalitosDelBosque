
public abstract class Animal {

	//Metodos
	public abstract void desplazarse();
	public abstract void hacerSonidos();
		
}

///////////////////////////////

class Buho extends Animal{
	//Atributos
	int numDeAlas = 2;
	
	@Override
	public void desplazarse() {
		System.out.println("El Buho utiliza sus "+ numDeAlas+" alitas para desplazarse ");
	}

	@Override
	public void hacerSonidos() {
		System.out.println("El buho hace ululación como sonido");
		
	}
}//Class Buho

///////////////////////////////////

class Venado extends Animal{
	int numDePatitas=4;

	@Override
	public void desplazarse() {
		System.out.println("El Venado utiliza sus "+ numDePatitas+" patitas para desplazarse ");
	}

	@Override
	public void hacerSonidos() {
		System.out.println("El venado hace sonidos como: gruñir y bramidos");
		
	}
}//Class Venado

///////////////////////////////////

class MonosAullador extends Animal{
	
	int numDePatitas=4;
	
	@Override
	public void desplazarse() {
	System.out.println("El Mono Aullador utiliza sus "+ numDePatitas+" patitas y su colita para desplazarse ");
	}
	
	@Override
	public void hacerSonidos() {
	System.out.println("El Mono Aullador hace sonidos como: gruñir y bramidos");
	
	}
}//Class MonosAullador

///////////////////////////////////

class Jaguar extends Animal{

	int numDePatitas=4;
	
	@Override
	public void desplazarse() {
	System.out.println("El Jaguar utiliza sus "+ numDePatitas+" patitas para desplazarse ");
	}
	
	@Override
	public void hacerSonidos() {
	System.out.println("El Jaguar hace sonidos como: gruñir y rugir");
	
	}
}//Class Jaguar

///////////////////////////////////

class Rana extends Animal{

	int numDePatitas=4;
	
	@Override
	public void desplazarse() {
	System.out.println("La rana utiliza sus "+ numDePatitas+" patitas para saltar y desplazarse ");
	}
	
	@Override
	public void hacerSonidos() {
	System.out.println("La rana hace el sonido de croar");
	
	}
}//Class Rana

class Serpiente extends Animal{


	@Override
	public void desplazarse() {
	System.out.println("La serpente utiliza su porpio cuerpo y se arrastra para poder desplazarse ");
	}
	
	@Override
	public void hacerSonidos() {
		System.out.println("La serpiente hace el sonido de sisear (ssss)");
	
	}
}//Class Rana


