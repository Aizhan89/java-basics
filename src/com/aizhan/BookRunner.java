package com.aizhan;

public class BookRunner {
    public static void main(String[] args) {
        Book artOfComputerProgramming = new Book();
        Book effectiveJava = new Book();
        Book cleanCode = new Book();

        artOfComputerProgramming.read();



        artOfComputerProgramming.setNumberOfCopies(200);
        effectiveJava.setNumberOfCopies(150);
        cleanCode.setNumberOfCopies(180);

        artOfComputerProgramming.increaseNumberOfCopies(100);
        effectiveJava.increaseNumberOfCopies(100);
        cleanCode.increaseNumberOfCopies(100);

        System.out.println(artOfComputerProgramming.getNumberOfCopies());
        System.out.println(effectiveJava.getNumberOfCopies());
        System.out.println(cleanCode.getNumberOfCopies());
    }
}
