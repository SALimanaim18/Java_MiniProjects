package TP12;

public class MaPile <T>{
	MyArrayList<T> pile=new MyArrayList();
    public void empiler(T element) {
    	pile.add(element);
    }
    public T depiler() {
    	T ss=pile.get(pile.length()-1);
    	 Remove();
    	return ss;
		}
    public void Remove() {
        int dernierIndice = pile.length() -1;
        if (dernierIndice >= 0) {
        	 MyArrayList<T> temp = new MyArrayList<>();
            for (int i = 0; i < dernierIndice; i++) {
                temp.add(pile.get(i));
            }
            pile=temp;
        }}
    public boolean estVide() {
    	if(pile.length()==0)
    	   return true;
    	else return false;}
    public int length() {
    	return pile.length();
    }
    public void vider() {
    	
    	for (int i = 0; i < pile.length(); i--) {
			Remove();
		}
    	
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pile.length(); i++) {
            sb.append(pile.get(i)).append(" ");
        }
        return sb.toString().trim();
    }
	public static void main(String args[]) {
		MaPile<Integer> p=new MaPile();
		System.out.println(p.length());
		p.empiler(0);
		p.empiler(12);
		p.empiler(22);
		p.empiler(33);
		p.empiler(422);
	
	    System.out.println(p.toString());
			
		//System.out.println(p.length());
	
		System.out.println(p.depiler());
	
		System.out.println(p.toString());
		System.out.println(p.estVide());
		p.vider();
		System.out.println(p.estVide());
		p.empiler(33);
		p.empiler(422);
		System.out.println(p.estVide());
	}
	
    
}
