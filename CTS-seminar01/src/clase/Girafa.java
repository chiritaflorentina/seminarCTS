package clase;

public class Girafa extends Animal{

	private int inaltime;
	public Girafa(String nume) {
		super(nume);
		this.inaltime=48;
		// TODO Auto-generated constructor stub
	}
	
	public int getInaltime() {
		return inaltime;
	}

	public void setInaltime(int inaltime) {
		this.inaltime = inaltime;
	}

	public Girafa(String nume, int inaltime) {
		super(nume);
		this.inaltime = inaltime;
	}

	@Override
	public void merge() {
		// TODO Auto-generated method stub
		System.out.println("Girafa merge!");
	}
	

}
