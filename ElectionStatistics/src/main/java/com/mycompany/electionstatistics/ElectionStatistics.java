/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electionstatistics;

/**
 *
 * @author 111ma
 */
import java.util.Scanner;

public class ElectionStatistics {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Accept input for party names and votes
        System.out.println("Enter the name of the first party:");
        String party1 = scanner.nextLine();
        System.out.println("Enter the number of votes for " + party1 + ":");
        int votes1 = scanner.nextInt();

        System.out.println("Enter the name of the second party:");
        String party2 = scanner.next();
        System.out.println("Enter the number of votes for " + party2 + ":");
        int votes2 = scanner.nextInt();

        System.out.println("Enter the name of the third party:");
        String party3 = scanner.next();
        System.out.println("Enter the number of votes for " + party3 + ":");
        int votes3 = scanner.nextInt();

        // Calculate total votes
        int totalVotes = votes1 + votes2 + votes3;

        // Calculate percentage of votes for each party
        double percentage1 = (votes1 / (double) totalVotes) * 100;
        double percentage2 = (votes2 / (double) totalVotes) * 100;
        double percentage3 = (votes3 / (double) totalVotes) * 100;

        // Display the results
        System.out.println("\nElection Statistics:");
        System.out.println("Total Votes: " + totalVotes);
        System.out.println(party1 + ": " + percentage1 + "%");
        System.out.println(party2 + ": " + percentage2 + "%");
        System.out.println(party3 + ": " + percentage3 + "%");

        scanner.close();
    }
}

