package opintro;

public class Main {

	public static void main(String[] args) {

		System.out.println("Hello java");
		
		double dolarDun=9.00;
		double dolarBugun=9.00;
		if(dolarDun<dolarBugun) {
			System.out.println("Dolar Arttı");
		}else if(dolarDun>dolarBugun) {
			System.out.println("Dolar Düştü");
		}else {
			System.out.println("Dolar aynı fiyatında");
		}
		
		
		
		
		String kredi1="İhtiyaç Kredisi";
		String kredi2="Öğrenci Kredisi";
		String kredi3="Çiftçi Kredisi";
		String kredi4="Esnaf Kredisi";
		String kredi5="Emekli Kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		
		
		
		
		String [] krediler = {"İhtiyaç kredisi","Öğrenci kredisi",
				"Çiftçi kredisi","Esnaf kredisi","Emekli kredisi "
		};
		
		for(String kredi : krediler)
		System.out.println(kredi);
		
		
		
		
	}

}
