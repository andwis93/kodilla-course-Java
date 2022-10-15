package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case DRIVING -> new DrivingTask("Driving","Gotham", "Bat-mobile");
            case PAINTING -> new PaintingTask("Painting","gray","Bat-cave");
            case SHOPPING -> new ShoppingTask("Shopping", "tires for Bat-mobile", 4.0);
            default -> null;
        };
    }

}
