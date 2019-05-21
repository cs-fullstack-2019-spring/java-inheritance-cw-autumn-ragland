# java-inheritance-cw

#### Exercise 1: 
Create the class Person with the following attributes:
- name

The following three classes should inherent Person:
- Friend
- Teacher
- Doctor

Friend should return the string "What's up", Teacher should return "Hello Mr/Mrs", and Doctor should return "Good morning/Afternoon Dr".

Create an ArrayList of People with new Friends, Teaches, and Doctors. Say hi to all of them.

<hr>

#### Exercise 2:
<strong>Note: All floors are the same size in this exercise.</strong>

Create the class Building with the following attributes
- name
- squareFeetPerFloor

The follwing three classes should inherent Building: Resturant, Resident, Commercial with the following attributes
- howManyFloors
- hasParkingLot
- hasInspection
- taxRate
- toString

Each Restaurant has 1 floor, parkingLot, inspections, and 10% tax.
Each Resident has 2 floors, no ParkingLog, no inspection, and 7% tax rate.
Each Commerical has 4 floors, parkingLot, inspections, and 15% tax rate. 

Create an ArrayList variable of type Buildings for a real estate agent. The ArrayList should at least one of each types of inhereted Building class. Print the following answers for the agent:
- How many buildings does the realestate agent own?
- Print information on each building
- Print the total square feet of each building.

<hr>

#### Exercise 3: 
Create the class Appliance with the following attribute
- name

Think of three new classes inheriting Appliance and give them the following methods/functions:
- turnOn. Print something
- insertItem should retain an array and do something different to the array
- removeItem should print something and effect the array.
- seeItems should print the array.

It's up to you how the methods will work, but it should follow the example below.

##### Example:
class Router
- turnOn: prints "WiFi is now on"
- insertItem: google.com is sent to insertItem. It now has the array ["http://www.google.com"].
- seeItems: prints ["http://www.google.com"].
- removeItem: "http://www.google.com" is sent to removeItem. It now has the array [].
<hr>
2 points.