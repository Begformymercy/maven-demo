/**
 * 
 */
package com.revature;

/**
 * @author bshei
 *
 */
public class TexasMule {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ingredient1 = "Horse";
		String ingredient2 = "Donkey";
		TexasMule firstDrinkMule = new TexasMule();
		String finishedFirstDrinkString = firstDrinkMule.add(ingredient1, ingredient2);
		
		System.out.println(finishedFirstDrinkString);

	} 

	public String add(String a, String b) {
		return a+b;
	}
}
