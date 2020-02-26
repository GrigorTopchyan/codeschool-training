package edu.training.codeschool.enums;

public class Pizza {

    private PizzaStatus status;

    public PizzaStatus getStatus() {
        return status;
    }

    public boolean isDeliverable() {
        return this.status.isReady();
    }

    public void printTimeToDeliver() {
        System.out.println("Time to delivery is " +
                this.getStatus().getTimeToDelivery());
    }
}