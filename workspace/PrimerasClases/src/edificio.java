
public class edificio {
	private String direccion; // si pongo private nadie puede cambiar el atributo de fuera
	private int codigoPostal;
	private float altura;
	private boolean calefaccionCentral;
	public edificio(String direccion, int codigoPostal, float altura,
			boolean calefaccionCentral) {
		 // super es el mecanismo para envair info a las clases madre, aqui he quitado el super x q la clase que esta mas por encima es edificio
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.altura = altura;
		this.calefaccionCentral = calefaccionCentral;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public boolean isCalefaccionCentral() {
		return calefaccionCentral;
	}
	public void setCalefaccionCentral(boolean calefaccionCentral) {
		this.calefaccionCentral = calefaccionCentral;
	}
	
}
