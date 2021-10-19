package model;

public class persona {

		private String sNombre;
		private int iEdad;
		private double dAltura;
		
		public persona() {
			this.sNombre = "";
			this.iEdad = 0;
			this.dAltura = 0.0;
		}
		public persona(String sNombre, int iEdad, double dAltura) {
			this.sNombre = sNombre;
			this.iEdad = iEdad;
			this.dAltura = dAltura;
		}
		public String getsNombre() {
			return sNombre;
		}
		public void setsNombre(String sNombre) {
			this.sNombre = sNombre;
		}
		public int getiEdad() {
			return iEdad;
		}
		public void setiEdad(int iEdad) {
			this.iEdad = iEdad;
		}
		public double getdAltura() {
			return dAltura;
		}
		public void setdAltura(double dAltura) {
			this.dAltura = dAltura;
		}
		
		
		@Override
		public String toString() {
			return "persona [sNombre=" + sNombre + ", iEdad=" + iEdad + ", dAltura=" + dAltura + "]";
		}
	
	
		
	
}
