package com.avengers.captainfury;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class CaptainFuryImpl implements CaptainFury {

	List<Mission> missions = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	// Insert avengers
	List<Avengers> avengers = List.of(new Avengers("Iron Man", "Tony Stark", "Highly Intelligent Suit of Armor"),
			new Avengers("Captain America", "Chris Evans", "Patriotic Power"),
			new Avengers("Hulk", "Mark Ruffalo", " Incredible superhuman strength, durability, and healing factor"),
			new Avengers("Thor", "Chris Hemsworth",
					"superhuman strength, speed, agility, durability and immunity to most diseases"),
			new Avengers("Black Widow", "Scarlett Johansson",
					"Master in the covert arts of espionage, infiltration & subterfuge"),
			new Avengers("Hawkeye", "Jeremy Renner",
					"Master archer and marksman Expert tactician, acrobat, martial artist, and hand-to-hand combatant Uses a variety of trick arrows"));

	@Override
	public void assignMissionToAvengers() throws CustomException {
		Set<String> allAvengers = new HashSet<>();
		List<Avengers> avengers = new ArrayList<>();
		String duplicateAvenger = "";

		// Enter the avangers
		System.out.print("Enter Avengers: ");
		String avengersName = sc.nextLine();

		// Find duplicate avenger who are working on two mission
		if(missions.size() == 0)
		{
			String[] splitAvengers = avengersName.split(",");

			for (int i = 0; i < splitAvengers.length; i++) {
				allAvengers.add(splitAvengers[i]);
			}
		}
		else
		{
			for (Mission mission : missions) {
				for (Avengers avenger : mission.getAvengers()) {
					// Store non duplicate avengers in HashSet
					if (!allAvengers.contains(avenger.getAvengerName())) {
						allAvengers.add(avenger.getAvengerName());
					} else {
						// Find duplicate avenger
						duplicateAvenger = avenger.getAvengerName();
					}
				}
			}
		}

		// Check more than avengers working on same mission
		if (avengersName.contains(",")) {
			// Split the avenger
			String[] splitAvengers = avengersName.split(",");

			for (int i = 0; i < splitAvengers.length; i++) {
				try {
					// Check avenger get more than 2 mission
					if (splitAvengers[i].trim().equals(duplicateAvenger)) {
						throw new CustomException();
					}
					Avengers avenger = new Avengers();
					avenger.setAvengerName(splitAvengers[i].trim());
					avengers.add(avenger);
				} catch (CustomException e) {
					System.out.println("Sorry, " + duplicateAvenger + " has already been working on two missions !!");
				}
			}
			
			if(duplicateAvenger == "")
			{
				// Enter the mission name
				System.out.print("Enter Mission Name: ");
				String missionName = sc.nextLine();
	
				// Enter the mission details
				System.out.print("Enter Mission Details: ");
				String missionDetails = sc.nextLine();
	
				// Assign mission to avengers
				Mission mission = new Mission(missionName.trim(), missionDetails.trim(), "Assigned", avengers);
				missions.add(mission);
				
				// Notify avenger about mission
				for(Avengers avenger: mission.getAvengers())
				{
					avenger.notifyAvenger("Mission has been assigned to " + avenger.getAvengerName());
				}
	
				// Get notification message
				avengers.stream().map(a -> a.getNotification()).forEach(System.out::println);
			}
		} else {
			try
			{
				// Check avenger get more than 2 mission
				if (avengersName.trim().equals(duplicateAvenger)) {
					throw new CustomException();
				}
				else
				{
					Avengers avenger = new Avengers();
					avenger.setAvengerName(avengersName.trim());
					avengers.add(avenger);
					
					// Enter the mission name
					System.out.print("Enter Mission Name: ");
					String missionName = sc.nextLine();

					// Enter the mission details
					System.out.print("Enter Mission Details: ");
					String missionDetails = sc.nextLine();

					// Assign mission to avengers
					Mission mission = new Mission(missionName.trim(), missionDetails.trim(), "Assigned", avengers);
					missions.add(mission);

					// Notify avenger about mission
					for(Avengers avengerList: mission.getAvengers())
					{
						avengerList.notifyAvenger("Mission has been assigned to " + avengerList.getAvengerName());
					}
		
					// Get notification message
					avengers.stream().map(a -> a.getNotification()).forEach(System.out::println);
				}
			}
			catch (CustomException e) {
				System.out.println("\nSorry, " + duplicateAvenger + " has already been working on two missions !!");
			}
		}

	}

	@Override
	public void checkTheMissions() {
		if (missions.size() > 0) {
			System.out.printf("%-30s|%-30s|%-30s", "Mission Name", "Status", "Avengers");
			System.out.printf("\n");
			for (Mission mission : missions) {
				System.out.printf("%-30s|%-30s|%-30s", mission.getMissionName(), mission.getStatus(),
						mission.getAvengers().stream().map(a -> a.getAvengerName()).collect(Collectors.joining(",")));
				System.out.printf("\n");
			}
		} else {
			System.out.println("\nNo Mission has been assigned to an Avenger !!");
		}
	}

	@Override
	public void checkMissionDetails() {
		System.out.print("Enter Mission Name: ");
		String missionName = sc.nextLine();

		if (missions.size() > 0) {
			for (Mission mission : missions) {
				if (mission.getMissionName().trim().equals(missionName)) {
					System.out.println("Mission Details: " + mission.getMissionDetails());
					System.out.println("Mission Status: " + mission.getStatus());
					System.out.println("Avengers: " + mission.getAvengers().stream().map(a -> a.getAvengerName())
							.collect(Collectors.joining(",")));
					break;
				}
			}
		} else {
			System.out.println("\nNo Mission has been assigned to an Avenger !!");
		}
	}

	@Override
	public void checkAvengerDetails() {
		int assignedMission = 0;
		int completedMission = 0;
		System.out.print("Enter Avenger Name: ");
		String avengerName = sc.nextLine();

		Avengers fetchAvenger = avengers.stream().filter(a -> a.getAvengerName().equals(avengerName)).findAny().get();

		System.out.println("Person Name: " + fetchAvenger.getPersonName());
		System.out.println("Abilities: " + fetchAvenger.getAbilities());

		// Get assigned mission and completed mission
		for (Mission mission : missions) {
			for (Avengers avenger : mission.getAvengers()) {
				if (avenger.getAvengerName().equals(avengerName)) {
					if (mission.getStatus().equals("Assigned")) {
						assignedMission++;
					} else if (mission.getStatus().equals("Completed")) {
						completedMission++;
					}
				}
			}
		}
		System.out.println("Mission Assigned: " + assignedMission);
		System.out.println("Mission Completed: " + completedMission);

	}

	@Override
	public void updateMissionStatus() {
		System.out.print("Enter Mission Name: ");
		String missionName = sc.nextLine();

		System.out.print("Enter new status: ");
		String newStatus = sc.nextLine();

		// i = -1 because index ArrayList is start from 0, if i = 0 and find element in
		// last position then it will give IndexOutOfBoundException
		int i = -1;
		for (Mission mission : missions) {
			i++;
			// Update mission from mission name
			if (mission.getMissionName().equals(missionName)) {
				missions.set(i, new Mission(mission.getMissionName(), mission.getMissionDetails(), newStatus,
						mission.getAvengers()));
				// Notify avenger
				for(Avengers mis: mission.getAvengers())
				{
					mis.notifyAvenger("Email and Sms are sent to " + mis.getAvengerName());
				}
				
				// Get notification in console
				mission.getAvengers().stream().map(a -> a.getNotification()).forEach(System.out::println);
			}
		}

	}

	@Override
	public void listAvengers() {
		List<AvengerListModel> avengerListModel = new ArrayList<>();
		List<String> avngrList = new ArrayList<>();
	
		System.out.printf("%-30s|%-30s|%-30s", "Avenger Name", "Status", "Assigned Mission");
		System.out.printf("\n");
		
		// Iterate mission
		for(Mission mission: missions)
		{
			// Iterate avengers from mission
			for(Avengers avenger: mission.getAvengers())
			{	
				if(mission.getStatus().equals("Assigned"))
				{
					// Add all avengers who currently working on mission
					avngrList.add(avenger.getAvengerName());
					avengerListModel.add(new AvengerListModel(avenger.getAvengerName(), "On Mission", mission.getMissionName()));
				}
			}
		}
		
		//Iterate avenger
		for(Avengers avenger: avengers)
		{
			// Avenger who are not working on mission is available for new mission
			if(!avngrList.contains(avenger.getAvengerName()))
			{
				avengerListModel.add(new AvengerListModel(avenger.getAvengerName(), "Available", ""));
			}
		}
		
		for(AvengerListModel av: avengerListModel)
		{
			System.out.printf("%-30s|%-30s|%-30s", av.getAvengerName(), av.getStatus(), av.getAssignedMission());
			System.out.printf("\n");
		}
	}

	@Override
	public void assignAvengerToMission() {
		System.out.print("Enter Avenger Name: ");
		String avengerName = sc.nextLine();
		
		System.out.print("Enter Mission Name: ");
		String missionName = sc.nextLine();
		
		for(Mission mission: missions)
		{
			try
			{
				if(mission.getMissionName().equals(missionName))
				{
					throw new CustomException();
				}
				else
				{	
					System.out.println("There is no avenger who are currently working on this mission, Please press 2 for assign mission to avengers !!");
					break;
				}
			}
			catch (CustomException e) {
				System.out.println(mission.getAvengers().stream().map(a -> a.getAvengerName()).collect(Collectors.joining(" and ")) + " are already working on this mission !!");
				break;
			}
		}
		
	}
}
