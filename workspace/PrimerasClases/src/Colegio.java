
public class Colegio extends edificio { // colegio estaba en rojo porque me pedia el constructor 
	private int  numeroAulas;
	private boolean pabellon;
	public Colegio(String direccion, int codigoPostal, float altura,
			boolean calefaccionCentral),int numeroAulas {
		super(direccion, codigoPostal, altura, calefaccionCentral);
		// TODO Auto-generated constructor stub
		this.numeroAulas=numeroAulas;
	}

}
	public int getNumeroAulas() {
		return numeroAulas;
	}
	public void setNumeroAulas(int numeroAulas) {
		this.numeroAulas = numeroAulas;
	}
	public boolean isPabellon() {
		return pabellon;
	}
	public void setPabellon(boolean pabellon) {
		this.pabellon = pabellon;
	}
