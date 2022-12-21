# Testvagrant_Sports_Assessment

## PROBLEM TO SOLVE
1. Create a small data structure that holds details - Name of the team, points they have
earned and result of last 5 matches as per above image
-->Here I have used ArrayList for storing details.

2. Programmatically retrieve the teams that have 2 consecutive losses.
--> For retrieving the teams with two consecutive losses, I'm calling the method consecutive with arguments (2,'L',teams)

3. Generalize the same solution, so that we could get teams that have n consecutive
losses/wins.
--> For the We are taking user input with the help of Scanner which takes number of consecutives and Loss/Win
--> these values are sent as arguments to consecutive method which returns the filtered result

4. Once the above is done, Calculate the average points of these filtered teams
--> From 3 step we get filtered results
--> For these resulted teams, average points are printed
