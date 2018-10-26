package com.hankzimmer;

public class Main {

    public static void main(String[] args) {
        System.out.println("Largest prime factor of 21: " + getLargestPrimeFactor(21));
        System.out.println("Largest prime factor of 217: " + getLargestPrimeFactor(217));
        System.out.println("Largest prime factor of 0: " + getLargestPrimeFactor(0));
        System.out.println("Largest prime factor of 45: " + getLargestPrimeFactor(45));
        System.out.println("Largest prime factor of -1: " + getLargestPrimeFactor(-1));
    }

    public static int getLargestPrimeFactor(int number) {
        //return -1 if the number does not have primes or is negative
        if (number < 2) {
            return -1;
        }
        int largestPrime = -1;
        //Check all numbers up to the number
        for (int i = 2; i <= number; i++) {
            //Find only numbers that divide evenly into the given number
            if (number % i == 0) {
                //For those that divide evenly, check if they are prime
                boolean isPrime = true;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        //If the factor is found not to be prime, break out of the inner loop
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    largestPrime = i;
                }
            }
        }
        return largestPrime;
    }
}