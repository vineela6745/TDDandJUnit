package eclipse_workspace.tdd;

public class removeAatbeg {

	public String delete(String k) {
		if(k.charAt(0)=='A'&&k.charAt(1)=='A') {
			k=k.substring(2);
			//System.out.println(k);
		}
		else {
		if(k.charAt(0)=='A')
			k=k.substring(1);
		 if(k.charAt(1) == 'A') {
			k=k.substring(0,1)+k.substring(2);
			//System.out.println(k);
		 }
		}
		return k;
	}

}
