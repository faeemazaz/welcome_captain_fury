package com.avengers.captainfury;

import java.util.Scanner;

public class WelcomCaptainFury{

	public static void main(String args[]) throws CustomException {
		
		CaptainFuryImpl captainFuryImpl = new CaptainFuryImpl();

		System.out.println("1. Check the missions\r\n" + "2. Assign mission to Avengers\r\n"
				+ "3. Check mission’s details\r\n" + "4. Check Avenger’s details\r\n" + "5. Update Mission’s status\r\n"
				+ "6. List Avengers\r\n" + "7. Assign avenger to mission.\n\n");
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("\nEnter your option: ");
			int option = sc.nextInt();
			sc.nextLine();
	
			switch (option) {
			case 1:
				captainFuryImpl.checkTheMissions();
				break;
			case 2:
				captainFuryImpl.assignMissionToAvengers();
				break;
			case 3:
				captainFuryImpl.checkMissionDetails();
				break;
			case 4:
				captainFuryImpl.checkAvengerDetails();
				break;
			case 5:
				captainFuryImpl.updateMissionStatus();
				break;
			case 6:
				captainFuryImpl.listAvengers();
				break;
			case 7:
				captainFuryImpl.assignAvengerToMission();
				break;
			default:
				System.out.print("Invalid Input !!");
				System.exit(0);
			}
		
		}
	}
}
