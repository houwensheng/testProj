package hou.test.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class testLambda {

	public static void main(String[] args) {
		
		testLambda tt = new testLambda();
		tt.loop();
		tt.sort();

	}
	
	public void loop() {
		String[] atp = {"Rafael Nadal", "Novak Djokovic",  
			       "Stanislas Wawrinka",  
			       "David Ferrer","Roger Federer",  
			       "Andy Murray","Tomas Berdych",  
			       "Juan Martin Del Potro"};  
		
		List<String> players =  Arrays.asList(atp);  
		  
		// 以前的循环方式  
		for (String player : players) {  
		     System.out.print(player + "; ");  
		}  
		System.out.println("\n\n");
		// 使用 lambda 表达式以及函数操作(functional operation)  
		players.forEach((player) -> System.out.print(player + "; "));  
		System.out.println("\n\n");
		// 在 Java 8 中使用双冒号操作符(double colon operator)  
		players.forEach(System.out::println);
	}
	
	public void sort() {
		String[] players = {"Rafael Nadal", "Novak Djokovic",   
			    "Stanislas Wawrinka", "David Ferrer",  
			    "Roger Federer", "Andy Murray",  
			    "Tomas Berdych", "Juan Martin Del Potro",  
			    "Richard Gasquet", "John Isner"};  
			   
			// 1.1 使用匿名内部类根据 name 排序 players  
			Arrays.sort(players, new Comparator<String>() {  
			    @Override  
			    public int compare(String s1, String s2) {  
			        return (s1.compareTo(s2));  
			    }  
			}); 
			System.out.println(players.toString());
			
			// 1.2 使用 lambda expression 排序 players  
			Comparator<String> sortByName = (String s1, String s2) -> (s1.compareTo(s2));  
			Arrays.sort(players, sortByName);  
			  
			// 1.3 也可以采用如下形式:  
			Arrays.sort(players, (String s1, String s2) -> (s1.compareTo(s2)));  
	}

}
