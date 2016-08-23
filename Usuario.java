class Usuario{
	private String login, nombre;
	private int nivel;

	public Usuario(){
		this.login = "desconocido";
		this.nombre = "desconocido";
		this.nivel = -1;
	}

	public Usuario(String login, String nombre, int nivel){
		this.login = login;
		this.nombre = nombre;
		this.nivel = nivel;
	}

	public void setLogin(String login){
		this.login = login;
	}

	public String getLogin(){
		return this.login;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return this.nombre;
	}

	public void setNivel(int nivel){
		this.nivel = nivel;
	}

	public int getNivel(){
		return this.nivel;
	}

	public String toString(){
		return "Objeto de la clase Usuario.\nEl login es " + this.getLogin() 
		+ "\nEl nombre es " + this.getNombre() 
		+ "\nEl nivel es " + this.getNivel();
	}
}
