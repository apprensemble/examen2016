package q3;

public class MonthResult {
	String nom;
	Integer nombre;
	Float prix;

	public MonthResult(String nom, Integer nombre, Float prix) {
		super();
		this.nom = nom;
		this.nombre = nombre;
		this.prix = prix;
	}

	public MonthResult() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getNombre() {
		return nombre;
	}

	public void setNombre(Integer nombre) {
		this.nombre = nombre;
	}

	public Float getPrix() {
		return prix;
	}

	public void setPrix(Float prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Month [nom=" + nom + ", nombre=" + nombre + ", prix=" + prix
				+ "]";
	}

}
