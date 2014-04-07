package tp2;

public class Ej1_Numeros {
	// inciso a //
	public static void conFor(int a, int b){
		for(int i=a;i<=b;i++){
			System.out.println(i);
		}
	}
	
	// inciso b //
	public static void conWhile(int a, int b){
		while(a<=b){
			System.out.println(a);
			a++;
		}
	}
	
	// inciso c //
	public static void recursivo(int a, int b){
		System.out.println(a);
		if (a<b){
			recursivo(++a,b);
		}
	}
	
	public static void main(String[] args){
		int a=2, b=5 ;
		if (a <= b){
			System.out.println("con for");
			conFor(a,b);
			System.out.println("con while");
			conWhile(a,b);
			System.out.println("recursivo");
			recursivo(a,b);
			System.out.println("a=" + Integer.toString(a) + " b=" + Integer.toString(b));
		}else{
			System.out.println("Capo a es mayor que b");
		}
	}
}
