public class Fraction {

	private int brojnik;
	private int nazivnik;
	
	public int getBrojnik() {
		return brojnik;
	}
	/*public void setBrojnik(int brojnik) {
		this.brojnik = brojnik;
	}
	*/
	
	public int getNazivnik() {
		return nazivnik;
	}
	/*public void setNazivnik() {
		this.nazivnik = nazivnik;
	}
	*/
	
	public Fraction() {
		this.brojnik = 0;
		this.nazivnik = 0;
	}
	
	public Fraction(int brojnik, int nazivnik) {
		this.brojnik = brojnik;
		this.nazivnik = nazivnik;
	}
	
	public Fraction add(Fraction f) {
		int b, n, pom;
		n = this.nazivnik * f.getNazivnik();
		b = (this.brojnik * f.getNazivnik()) + (this.nazivnik * f.getBrojnik());
		pom = gcd(b, n);
		if (pom != 1) {
			b /= pom;
			n /= pom;
		}
		return new Fraction(b, n);
	}
	
	public Fraction subtract(Fraction f) {
		int b, n, pom;
		n = this.getNazivnik() * f.getNazivnik();
		b = (this.getBrojnik() * f.getNazivnik()) - (this.getNazivnik() * f.getBrojnik());
		pom = gcd(b, n);
		if (pom != 1) {
			b /= pom;
			n /= pom;
		}
		return new Fraction(b, n);
	}
	
	public Fraction multiply(Fraction f) {
		int b, n, pom;
		b = this.getBrojnik() * f.getBrojnik();
		n = this.getNazivnik() * f.getNazivnik();
		pom = gcd(b, n);
		if (pom != 1) {
			b /= pom;
			n /= pom;
		}
		return new Fraction(b, n);
	}
	
	public Fraction divide(Fraction f) {
		int b, n, pom;
		b = this.getBrojnik() * f.getNazivnik();
		n = this.getNazivnik() * f.getBrojnik();
		pom = gcd(b, n);
		if (pom != 1) {
			b /= pom;
			n /= pom;
		}
		return new Fraction(b, n);
	}
	
	public Fraction invert() {
		int b, n, pom;
		b = this.getNazivnik();
		n = this.getBrojnik();
		pom = gcd(b, n);
		if (pom != 1) {
			b /= pom;
			n /= pom;
		}
		return new Fraction(b, n);
	}

	public Fraction negate() {
		int b, n, pom;
		b = this.getBrojnik() * (-1);
		n = this.getNazivnik();
		if (this.getNazivnik() < 0 && b < 0) {
			b *= (-1);
			n *= (-1);
		}
		pom = gcd(b, n);
		if (pom != 1) {
			b /= pom;
			n /= pom;
		}
		return new Fraction(b, n);
	}
	
	public String toString() {
		return String.format("%d / %d", this.getBrojnik(), this.getNazivnik());
	}
	
	private static int gcd(int x, int y) {
		return (y == 0) ? x : gcd(y, x % y);
	}
	
}
