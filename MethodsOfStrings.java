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

			System.out.println("\n The Character at position 4 is: "+raceString.charAt(4));//expecting A counting from 0
			System.out.println("The Index of Character 'i' is: "+raceString.indexOf('i'));//expecting 2 counting from 0
	}
}