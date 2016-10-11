package h1.task67;

public class NuclearMarine {
	private String name;
	private double speed;
	private int crew;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getCrew() {
		return crew;
	}

	public void setCrew(int crew) {
		this.crew = crew;
	}

	public NuclearMarine(String name, double speed, int crew) {
		setName(name);
		setSpeed(speed);
		setCrew(crew);
		NuclearMarineEngine engine = new NuclearMarineEngine();
	}


	public class NuclearMarineEngine {
		private NuclearMarineEngine() {
			start();
		}

		private void start() {
			//engine logic
			System.out.println("Marine started.");
		}
	}
}
