# markkbabis
CSC207 Group Project

## PROBLEM DOMAIN
For our project, we have decided to create a trivia game.

## HOW THE GAME WORKS
In this online game, the players compete in gaining the most points by answering questions correctly.
Before each game, the players select a category (such as sports, books, video games, etc.) for their questions.
During the round, the player who answers the question correctly first gains the points.
The faster the players answer correctly, the more points they gain.

## OUR PROSPECTIVE APPLICATION

HOME SCREEN
This will be the initial screen that the player sees when entering the game.
They can access settings, instructions to the game, and the play button 
to start the game (which will lead to the lobby).

* before reaching the lobby, the player will select if they want to play solo or multiplayer.

LOBBY
This screen will look different depending on if the player is playing solo or multiplayer.
If they are playing solo, the player can select difficulties, number of questions, game mode (potentially), and avatar.
If they are playing multiplayer, the settings are the same but the player will have to wait for the other players to join.
On both pages, there will be a start button (which will lead to the play screen).

PLAY SCREEN
The question and four answer options will appear on the screen for the players to click.
Each of the players' avatars will appear on podiums that move up as they gain points.
There will be a visual that represents the time remaining to answer the question.

## API LINK
https://opentdb.com/api_config.php

## TESTING OUT OUR API (SCREENSHOT)
https://utoronto-my.sharepoint.com/:f:/g/personal/katia_brechko_mail_utoronto_ca/El6yNyTA1pVHlGTr7NhyKiIBvCrXGjQnZ8x73gqaiAcfLQ

## SAMPLE OUTPUT
After running our code (include specific example of run), this is the Java output.

## TECHNICAL PROBLEMS
At the moment, our output for the API is in String form. We still need to figure out how to convert it to json form.
We had difficulty inserting the screenshot into the README.md file so we just inserted a link to a onedrive file.