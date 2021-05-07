package com.aizhan;

public class Book {

    private int numberOfCopies;

   public void setNumberOfCopies(int numberOfCopies){
       if(numberOfCopies > 0 )
        this.numberOfCopies = numberOfCopies;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void increaseNumberOfCopies(int howMuch){
        this.numberOfCopies = this.numberOfCopies + howMuch;
    }

    public void decreaseNumberOfCopies(int howMuch){
       setNumberOfCopies(this.numberOfCopies - howMuch);
    }

    void read(){
        System.out.println("Read a book");
    }
}
