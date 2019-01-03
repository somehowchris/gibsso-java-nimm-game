import java.util.*;
//nimm.java
public class nimm{
	public static void main(String[] args){
		
		//Variable deffintions
		Scanner sc = new Scanner(System.in); //Open the input of System.in for variable sc
		boolean isAplaying = true;//A boolean to check which player is playing
		int sticks = 0;//The variable to hold the current amount of sicks
		int maxsicksperround = 0;//The variable to hold the defind max of sicks to put away very round
		
		//Setting the variable
		System.out.print("Anzahl Hoelzchen auf dem Stapel zu Beginn> ");//Some console output
		sticks = sc.nextInt(); //Sets the max sicks to the users input
		System.out.print("Anzahl Maximale Hoelzchen in einem Zug> ");//Some console output
		maxsicksperround = sc.nextInt();//Sets the max sicks per round to the users input
		
		//Alorithem for the game
		while(sticks > 0){
			//checks if Player A is playing
			if(isAplaying){ 
				System.out.print("Zug Spieler A> "); //Some console output
				int input = sc.nextInt(); //Creates variable input and sets it to the users input
				isAplaying= !isAplaying; //Inverses the variable isAplaying
				if(input > maxsicksperround || input > sticks){ //Checks if the input is valid
					System.out.println("FEHLER: A ungueltiger Zug"); //Some error output
				}else{
					sticks-=input; //Subtracts the input from the total count of sticks
					System.out.println("STAPEL: "+sticks+" Hoelzchen vorhanden"); //Some console output
				}
			}else{
				System.out.print("Zug Spieler B> "); //Some console output
				int input = sc.nextInt(); //Creates variable input and sets it to the users input
				isAplaying= !isAplaying; //Inverses the variable isAplaying
				if(input > maxsicksperround || input > sticks){ //Checks if the input is valid
					System.out.println("FEHLER: B ungueltiger Zug"); //Some error output
				}else{
					sticks-=input; //Subtracts the input from the total count of sticks
					System.out.println("STAPEL: "+sticks+" Hoelzchen vorhanden");//Some console output
				}
			}
		}
		//Checks if A is playing
		if(isAplaying){
			System.out.println("BRAVO! Spieler B hat gewonnen");//Console output congrats to B
		}else{
			System.out.println("BRAVO! Spieler A hat gewonnen"); //Console output congrats to A
		}
	}
}