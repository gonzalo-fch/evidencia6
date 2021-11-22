package Cuaderno;

public class Cuaderno {
	private int cantHojas;

	public void escribir() {
		throw new UnsupportedOperationException();
	}

	public void arrancarHoja() {
		throw new UnsupportedOperationException();
	}

	public int getCantHojas() {
		return this.cantHojas;
	}

	public void setCantHojas(int aCantHojas) {
		this.cantHojas = aCantHojas;
	}
}