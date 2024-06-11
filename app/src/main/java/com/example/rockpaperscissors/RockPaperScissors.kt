package com.example.rockpaperscissors

import kotlinx.coroutines.processNextEventInCurrentThread
import java.util.Locale

fun main() {
    var computerChoice = ""
    var playerChoice = ""

    println("Rock, Paper or Scissors? Enter your choice: ")
    playerChoice = readln()

    while (playerChoice != "Rock" && playerChoice != "Paper" && playerChoice != "Scissors") {
        println("Please enter a valid option: Rock, Paper or Scissors? Enter your choice: ")
        playerChoice = readln()
    }

    val randomNumber = (1..3).random()

    computerChoice = when (randomNumber) {
        1 -> {
            "Rock"
        }
        2 -> {
            "Paper"
        }
        else -> {
            "Scissors"
        }
    }
    println("Computer's choice: $computerChoice")

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }

    if (winner == "Tie") {
        println("It's a tie!")
    }
    else {
        println("The winner is: ${winner.uppercase(Locale.ROOT)}!")
    }
}