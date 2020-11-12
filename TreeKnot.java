
public class TreeKnot {
	//nó
	private int value;
	private TreeKnot left;
	private TreeKnot rigth;
	
	//criar ávore
	
	public TreeKnot(int value, TreeKnot left, TreeKnot rigth) {
		this.value = value;
		this.left = left;
		this.rigth = rigth;
	}
	
	//mostrar arvore
	public static void showTreePreOrdem(TreeKnot t) {
		System.out.print(t.value+" ");
		if(t.left != null) {
			showTreePreOrdem(t.left);
		}
		if(t.rigth != null) {
			showTreePreOrdem(t.rigth);
		}
	}
	
	
	//primeiro percorre toda a esquerda, mostra a raiz, e depois percorre a esquerda
	public static void showTreeEmOrdem(TreeKnot t) {
		if(t.left != null) {
			showTreeEmOrdem(t.left);
		}
		System.out.print(t.value+" ");
		if(t.rigth != null) {
			showTreeEmOrdem(t.rigth);
		}
	}
	//percorre a esquerda, depois a direita, depois mostra a raiz
	public static void showTreePosOrdem(TreeKnot t) {
		if(t.left != null) {
			showTreePosOrdem(t.left);
		}
		if(t.rigth != null) {
			showTreePosOrdem(t.rigth);
		}
		System.out.print(t.value+" ");
	}

}
