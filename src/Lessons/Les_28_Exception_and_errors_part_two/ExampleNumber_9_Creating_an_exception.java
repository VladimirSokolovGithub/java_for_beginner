package Lessons.Les_28_Exception_and_errors_part_two;

public class ExampleNumber_9_Creating_an_exception {

    void marathon(int airTemperature, int runningPace) throws TwistYourLegException {
        if (runningPace > 12) {
            throw new TwistYourLegException("Темп бега был слишком высоким: " + runningPace);
        }
        if (airTemperature > 32) {
            throw new CrampedMuscleException();
        }
        System.out.println("Вы пробежали марафон");
    }

    public static void main(String[] args) {
        ExampleNumber_9_Creating_an_exception ex1 = new ExampleNumber_9_Creating_an_exception();
        try {
            ex1.marathon(20, 8);
        } catch (TwistYourLegException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("В любом случае Вы получите грамоту!!!");
        }

    }
}
//01-04-29


class TwistYourLegException extends Exception {
    TwistYourLegException(String message) {
        super(message);
    }

    TwistYourLegException() {
    }
}

class CrampedMuscleException extends RuntimeException {
    CrampedMuscleException(String message) {
        super(message);
    }

    CrampedMuscleException() {
    }
}