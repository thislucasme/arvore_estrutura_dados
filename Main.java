
public class Main {

	public static void main(String[] args) {
		
		TreeKnot knot = new TreeKnot(15, new TreeKnot(10, null, null), new TreeKnot(50, new TreeKnot(20, null, null), null));
		
		TreeKnot knot10 = new TreeKnot(10, null, null);
		TreeKnot knot20 = new TreeKnot(20, null, null);
		TreeKnot knot50 = new TreeKnot(50, knot20, null);
		TreeKnot knot15 = new TreeKnot(15, knot10, knot50);
		
		System.out.println("Pre-ordem");
		TreeKnot.showTreePreOrdem(knot15);
		System.out.println();
		
		//saída
		//15 10 50 20 
		
		System.out.println("Em-ordem");
		TreeKnot.showTreeEmOrdem(knot15);
		System.out.println();
		
		//saída
		//10 15 20 50 
		
		System.out.println("Pos-ordem");
		TreeKnot.showTreePosOrdem(knot15);
		System.out.println();
		
		//saída
		//10 20 50 15 

		


	}

}
