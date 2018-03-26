# Techdegree-project-1

To complete this project, implement the User Stories below. If you get stuck, don’t forget that you can ask questions in the community. You aren’t alone!

Here are your user stories to get to the requested Minimum Viable Product:

As an administrator of the game, I should be able to specify what type of item will be stored in the jar, as well as the total how many could reasonably fit in jar, so that the game stays in the bounds of reality.
Create a jar class that accepts an item name and a maximum number of items that can fit in the jar. Your program should have an administrator who is prompted to identify what type of item should fill the jar, and the maximum number of items the jar can hold, and should include the phrase "What type of item".

The type of item should be repeated in the second prompt. For example, if the administrator specifies “gumballs” as the type of item, the next prompt should ask “What is the maximum amount of gumballs?”

As a player of the game, for each new game I should be presented with a new jar filled with a random number of items, so that I can play multiple games and still find the game challenging.
Write a fill method for your Jar class that uses the Random class to fill the jar with a random number of items. That number should be between 1 and the maximum number of items set by the administrator. Hint: Read the code in the project instructions for help!
As a player of the game, I should be shown the maximum possible number of items in the jar.
When the player begins the game, your program should display the maximum number of items the jar can hold. The prompt should also repeat the type of item in the jar. For example, if the jar is filled with with a maximum number of 1,500 jelly beans, the prompt should read “How many jellybeans are in the jar? Pick a number between 1 and 1500.”
As a player of the game, I should be prompted to guess the number of the items until I get the correct answer.
Use a while loop to prompt the user for a new guess until the correct answer is guessed
As a winner of the game, I should know how many attempts it took me to get to the right answer, so that I am encouraged to beat my score.
Your winning message should be in this format: "You got it in X attempt(s)".
When returning the number of guesses, be careful of off by 1 errors!
