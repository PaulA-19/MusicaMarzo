package datos;

public class Nota implements Comun {

	public String note;

	public Nota(String note) {
		this.note = note;

		// TODO Auto-generated constructor stub
	}

	public void sonar() {
		Tarea t = new Tarea();
		t.sonar(this);

	}

	public void sonar(String time) {
		Tarea t = new Tarea();
		t.sonar(this);

	}

}
