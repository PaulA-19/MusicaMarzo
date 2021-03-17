package datos;

public class Tarea extends Thread implements Comun {

	private String n, time;

	public void sonar(Nota n) {
		this.n = n.note;
		run();

	}

	public void sonar(Nota n, String time) {
		this.n = n.note;
		this.time = time;
		run();

	}

	@Override
	public void run() {
		if (time == null) {
			p.play(n);

		} else {
			p.play(n + "/" + time);

		}
//		super.run();
	}

}
