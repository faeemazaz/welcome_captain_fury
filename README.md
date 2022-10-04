### **Problem Statement**

Captain Fury has requested to make an application for the S.H.I.E.L.D to track the missions assigned to each avenger. Currently, there are 6 avengers in the team, **Iron Man, Captain America, Hulk, Thor, Black Widow and Hawkeye**. With time more superheroes can be added to the team. We need to create an application that can track the mission status assigned to each avenger and can also assign a new mission to the avengers. So you are requested to create the interface for Captain Fury as of now.

As of now, Captain Fury can assign a maximum of two missions to any avenger at any point in time, Captain can also update the mission status.

Avengers can check the mission details assigned to other avengers but cannot assign a new task, but for now, we will create an app for captain fury only. But we need to keep in mind that at some point avengers will also be able to access the app with fewer privileges.

#### Below is the expected behavior of the application:
* Captain Fury can check the status of all the avengers (if they are available to take any
mission or already on a mission)
* Captain Fury can also check the status of all the missions.
* Captain Fury can update the status of the mission. (Once mission is completed then avengers should be available to pick the next mission).
* Captain Fury can check the details of any mission.
* Captain Fury can assign any mission to avengers. Max two missions can be assigned to any avenger as of now.
* Captain Fury can assign an individual avenger to any mission (But at any point max two avengers should be assigned to any mission).
* Once the mission is assigned to any avenger, a notification will be sent to that avenger.

### Sample Input/Output for the console application:
=======------S.H.I.E.L.D ------=========

Welcome to Captain Fury. (Note: Below interface is for Captain Fury)
1. Check the missions
2. Assign mission to Avengers
3. Check mission’s details
4. Check Avenger’s details
5. Update Mission’s status
6. List Avengers
7. Assign avenger to mission.

**Enter the option: 1**<br>
No Mission has been assigned to an Avenger.

**Enter the option: 2**<br>
**Enter Avengers:** Thor, Hawkeye<br>
**Enter Mission Name:** Find the Space Infinity Stone<br>
**Enter Mission Details:** Loki has stolen the Space Infinity Stone which needs to be captured
ASAP.

Mission has been assigned to Thor.<br>
Mission has been assigned to Hawkeye.

**Enter the option: 2**<br>
**Enter Avengers:** Black Widow, Hawkeye<br>
**Enter Mission Name:** Get the Hulk back<br>
**Enter Mission Details:** Hulk has gone underground again, find him and bring him back.

Mission has been assigned to Black Widow.<br>
Mission has been assigned to Hawkeye.

**Enter the option: 2**<br>
**Enter Avengers:** Hawkeye<br>
Sorry, Hawkeye has already been working on two missions.

**Enter the option: 1**<br>
Mission Name                  | Status   | Avengers <br>
Find the Space Infinity Stone | Assigned | Thor, Hawkeye <br>
Get the Hulk back.            | Assigned | Black Widow, Hawkeye

**Enter the option: 3**<br>
**Enter Mission Name:** Get the Hulk back<br>
**Mission Details:** Hulk has gone underground again, please find him and bring him back.<br>
**Mission Status:** Assigned<br>
**Avengers:** Black Widow, Hawkeye

**Enter the option: 4**<br>
**Enter Avenger Name:** Iron Man<br>
**Person Name:** Tony Stark<br>
**Abilities:** Highly Intelligent Suit of Armor<br>
**Mission Assigned:** 0<br>
**Mission Completed:** 0

**Enter the option: 5**<br>
**Enter Mission Name:** Get the Hulk back<br>
**Enter new status:** Completed<br>

Email and Sms are sent to Black Widow.<br>
Email and Sms are sent to Hawkeye

**Enter the option: 1**<br>
Mission Name                  | Status    | Avengers<br>
Find the Space Infinity Stone | Assigned  | Thor, Hawkeye<br>
Get the Hulk back             | Completed | Black Widow, Hawkeye

**Enter the option: 6**<br>
Avenger Name    | Status     | Assigned Mission<br>
Captain America | Available  |<br>
Iron Man        | Available  |<br>
Hulk            | Available  |<br>
Thor            | On Mision  | Find the Space Infinity Stone<br>
Hawkeye         | On Mission | Find the Space Infinity Stone<br>
Black Widow     | Available  |

**Enter the option: 7**<br>
**Enter Avenger Name:** Iron man<br>
**Mission Name:** Find the Space Infinity Stone<br>
**Thor and Hawkeye are already working on this mission.**
