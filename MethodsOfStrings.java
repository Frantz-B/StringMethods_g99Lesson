class MethodsOfStrings{
	// 6/23/2015 Reminded from the Java Oracle doc that it is recommended to use 'type[] arrayname' vs 'type []arrayname' or 'type arraynmae[]'
	//  REMEMBER: not using an IDE, you java -cp . java.classfile to execute.

	public static void main(String[] args){
			//Most of the time, if you are using a single character value, you will use the primitive char type.
			char[] race = {'S', 'a', 'i' , 'y' , 'a' , '-' , 'j','i','n'};
			// Wanted to try an new way of declaring a string.
			String raceString = new String(race);
			String ability1 = "KaioKen.";
			System.out.println(ability1.concat(raceString));
			System.out.println("\n\n\n The length of my raceString is "+raceString.length());

			System.out.println("\n The Character at position 4 is: "+raceString.charAt(4));//expecting 'a' counting from 0
			System.out.println("The Index of Character 'i' is: "+raceString.indexOf('i'));//expecting '2' counting from 0
			//I was right which meant that .length() method starts from 1
			System.out.println("\n\n Compare my Race with something improper 'saiyan' : "+raceString.compareTo("saiyan"));
			System.out.println(" Compare my Race with something improper 'red' : "+raceString.compareTo("saiyan"));//Not sure how lexicographically works
			System.out.println(" Compare my Race regardless of case sensitivity 'saiya-jin' : "+raceString.compareToIgnoreCase("saiya-jin"));
			System.out.println("\n\n Using contains method to see if my raceString has 'jin' in it : "+raceString.contains("jin"));
			System.out.println(" Using contains method to see if my raceString has 'ay' in it : "+raceString.contains("ay"));
	}
}