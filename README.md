A Java school project.
Contains a Spring Boot MVC web application and a Rest API.

1 execution of the project

This is an online application in which you can not only plan a trip but also saves your favorite trips to your local storage.
The trips that have been saved can be loaded in by simply clicking on the trip on the index page.
After you have either selected your favorite trip or entered your destination and start point you will be redirected to the information page.
Here you will be presented with several trips from which you can choose to reach your destination.
After selecting a trip you will be shown the information about this trip.
The application is meant to stimulate people to choose for more eco friendly ways of travel.
Therefore the trip information will also include a notification which will show you if there are more eco friendly ways of travel to your current destination.
For now there are only two ways of travel available in the application from which you can choose to plan your trip (Train and bus).
There are plans to add more options to the project like being able to travel by bike and by foot but for now these options are not yet available in the application.

2 project structure

The project contains two folders one for the web application and one for the rest api.

The api contains the following packages with documents:

java

Controller

•	Apicontroller

Model

•	Accommodaties
•	Faciliteiten
•	Station
•	Station details
•	Trajectjson

Apiapplication

Gsonreader

Resources

Images

•	Amersfoort centrum -Amersfoort amerena
•	Amersfoort Curacaolaan-Amersfoort Begraafplaats Rusthof
•	Amersfoort Eemplein-Amersfoort Vathorst
•	Amersfoort-Den Haag
•	Amersfoort-Enschede
•	Amersfoort-Groningen
•	Amersfoort-Leusden
•	Amersfoort-Utrecht
•	Hoogland esdoorlaan-Amersfoort bovist
•	Utrecht-Amsterdam

Json

•	Stations
•	Trajecten


3 how to use
1.	Run the apiaplication
2.	Run the webaplication
3.	Open the browser and go to localhost8080/index
4.	Here you can choose between selecting a favorite trip or filling the input fields with the location that you will be leaving from and your destination and clicking the plan trip button.
5.	(optional) after filling the input fields with the location that you will be leaving from and your destination you can also add the planned trip to your favorites.
6.	After this you will be redirected to the info page.
7.	Here you will select one of the available trips.
8.	After you have selected one of the available trips you will be show the information about the trip that you have selected.

4 required software

Intellij or an equivalent programming software.

5 required dependencies

The required dependencies are shown in the pom.xmk files








