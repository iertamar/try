import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,String> br = new HashMap<String, String>();
		br.put("}", "{");
		br.put(")", "(");
		br.put("]", "[");
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
			Stack<String> st = new Stack<String>();
			String exp = sc.next();
			String[] arrExp = exp.split("");
			for(int j=0;j<arrExp.length;j++){
				if(st.isEmpty() || !st.peek().equals(br.get(arrExp[j]))){
					st.push(arrExp[j]);
				}
				else if(st.peek().equals(br.get(arrExp[j]))){
					st.remove(br.get(arrExp[j]));
				}
			}
			if(st.isEmpty()){
				System.out.println("balanced");
			}else{
				System.out.println("not balanced");
			}
		}
	}
}
