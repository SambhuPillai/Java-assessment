import java.util.Scanner;

public class Logic2 {
	protected static void game1() {	
		int noOfMoves=0;
		System.out.println("Rules: You must enter the directions exactly as shown otherwise you will not move and the monsters might see you!.");
		System.out.println("You are in a swamp. it is large, infinite, dreary and filled with evil creatures. You have a magic compass to guide you to the treasure. The compass is pointing North, where you see a path leading into darkness. To the East, you hear a growl. West and South looks empty. You have no weapons and no food supplies, so pick your directions wisely. Enter North, South, East or West");
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		switch(a) {
		case "North":System.out.println("You have arrived at a set of rusty gates. The compass points North where you see a glow in the distance past the gates. The path behind you is now flooded by the swamp water. You can hear a louder roar from a grizzly monster but you don't know where it is coming from. Enter North, South, East or West");
		noOfMoves++;
		String b=scanner.nextLine();
			switch(b) {
			case "North":System.out.println("You have opened the gates and walk towards the glow. You see dozens of ships wrecked everywhere. The path starts to soften. The compass still points North. Do you want to continue on this path? Enter North, South, East or West");
			noOfMoves++;
			String c=scanner.nextLine();
					switch(c) {
					case "North": System.out.println("You walked into quicksand. Game over");
					noOfMoves++;
					break;
					case "South": System.out.println("You see a giant bear and you don't have any weapons. Game over.");
					noOfMoves++;
					break;
					case "East": System.out.println("You have moved off the soft path. Enter North, South, East or West");
					noOfMoves++;
					String d=scanner.nextLine();
						switch(d) {
						case "North": System.out.println("You found the tresure. You win!");
						noOfMoves++;
						System.out.println("You won in "+noOfMoves+" moves");
						break;
						case "South": System.out.println("You see a giant bear and you don't have any weapons. Game over.");
						noOfMoves++;
						break;
						case "East": System.out.println("There is nothing here. You are lost and now you have starved to death. Game over.");
						noOfMoves++;
						break;
						case "West":System.out.println("You walked back onto the soft path and into the quicksand. Game over.");
						noOfMoves++;
						break;
						default:System.out.println("You stood still too long! A giant bear saw you and you don't have any weapons. Game over.");
						break;
						}
						break;
					case "West":System.out.println("You have moved off the soft path and found a small dagger! The compass points North but a talking tree advises you to go East. Enter North, South, East or West");
					noOfMoves++;
					String e=scanner.nextLine();
						switch(e) {
						case "North": System.out.println("You're back on track towards the glow. A zombie approaches from the wreckage wearing a captains outfit! Do you want to continue on this path? Enter North, South, East or West");
						noOfMoves++;
						String f=scanner.nextLine();
							switch(f) {
							case "North": System.out.println("You take out the dagger and stab the zombie in the head. The zombie has fallen to the ground. You try to take the dagger out of the zombies head, buit it is wedged in. You hear the sound footsteps and faint groans.");
							noOfMoves++;
							String g=scanner.nextLine();
								switch(g) {
								case "North":System.out.println("You have found a box hidden in the wreckage. You open the box and you found the treasure. You win!");
								noOfMoves++;
								System.out.println("You won in "+noOfMoves+" moves");
								break;
								case "South":System.out.println("You see a giant bear and you don't have any weapons. Game over.");
								noOfMoves++;
								break;
								case "East":System.out.println("You see more zombies coming out of the wreckage. Game over.");
								noOfMoves++;
								break;
								case "West":System.out.println("You see more zombies coming out of the wreckage. Game over.");
								noOfMoves++;
								break;
								default:System.out.println("You stood still too long! The zombies heard the scream of the dead zombie. They notice you whilst they feast on the dead zombie. Game over.");
								break;	
								}
							break;
							case "South": System.out.println("You are running away back onto the softened path and into quicksand. Game over.");
							noOfMoves++;
							break;
							case "East": System.out.println("You are running away from the zombie but the zombie is too fast and catches you. The zombie has bitten you and know you are a zombie! Game over.");
							noOfMoves++;
							break;
							case "West":System.out.println("You are running away from the zombie but the zombie is too fast and catches you. The zombie has bitten you and know you are a zombie! Game over.");
							noOfMoves++;
							break;
							default:System.out.println("You stood still too long! The zombie catches you and feasts upon your raw flesh. Game over.");
							break;
							}
						break;
						case "South": System.out.println("You see a giant bear and you don't have any weapons. Game over.");
						noOfMoves++;
						break;
						case "East": System.out.println("You walked back onto the soft path and into the quicksand. Remember: all creatures in this game are evil! Game over.");
						noOfMoves++;
						break;
						case "West":System.out.println("There is nothing here. You are lost and now you have starved to death. Game over.");
						noOfMoves++;
						break;
						default:System.out.println("You stood still too long! A giant bear saw you and you don't have any weapons. Game over.");
						break;
						}
							break;
						default:System.out.println("You stood still too long! A giant Eagle snatches you and feeds you to their young. Game over.");
						break;
						}
					
				break;
				case "South":noOfMoves++;
					System.out.println("You have drowned in the swamp water. Game over.");
				break;
				case "East":noOfMoves++;
					System.out.println("You see a giant bear and you don't have any weapons. Game over.");
				break;
				case "West":noOfMoves++;
					System.out.println("There is nothing here. You are lost and now you have starved to death. Game over.");
				break;
				default:System.out.println("You stood still too long! The giant bear saw you and you don't have any weapons. Game over.");
				break;
				}
			break;
			case "South":System.out.println("There is nothing here. You are lost and now you have starved to death. Game over.");
			noOfMoves++;
			break;
			case "East":System.out.println("You see a giant bear and you don't have any weapons. Game over.");
			noOfMoves++;
			break;
			case "West":System.out.println("There is nothing here. You are lost and now you have starved to death. Game over.");
			noOfMoves++;
			break;
			default:System.out.println("You didn't make a move and stood still too long! A giant Spider stuns you and you you don't have any weapons. You're webbed up! Game over.");
			break;
		
		}
		
	}

	
}
