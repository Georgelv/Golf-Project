Name: Zhaozhou Lyu
NetID: zlyu2
Assignment number: Project02
Lab: TR6:15PM

1. Golf Project Description

This project is a game of playing simulating golf. At first, as the player, you can choose the course you want to play. There are two courses for you to choose. Then for each course, there are different pars for each holes. Players will be asked to input club and power to shoot the ball until they reach the green. As long as the ball is at the green, the players will be asked to input the power for putting until they put the ball into the hole. Besides, the player may encounter the haphazard, like sand and water trap. At the end of each hole and round, the score will pop up and user can choose to continue or to quit based on their score. 

2. Class explanation

Game: This class contains all the loops and variables that enable the program to execute.
golf_test: This class is the main method of the program and it can call the method in another class.
Clubs: This class contains all the information of different clubs.
Counting: This class can convert the number into word.
Distance: This class can calculate the distance the ball flies.
GeneseeCourse: This class contains the information of Genessee Course, like the par and the yards.
OldCourse: This class contains the information of Old Course, like the par and the yards.
Putt: This class contains the basic information when the user putts the ball on the green.

3. Extra credit

First, for different scores each user has, I name the score each user has based on the golf jargon. For example, if the user get the score below 1 par, I named it "You made BIRDY". For each score, user will get different jargons.

Second, I set the water and sand trap in the game. For the water trap, the player will be set to the last place he or she played and the distance between the golf and the hole will not change. For the sand trap, the user will be forced to choose club 10 or the system will continuously ask them for it and never stops. 