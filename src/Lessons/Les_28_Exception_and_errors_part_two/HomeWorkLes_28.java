package Lessons.Les_28_Exception_and_errors_part_two;

public class HomeWorkLes_28 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat("meat");
        try {
            tiger.drink("water");
            try {
                tiger.drink("beer");
            } catch (NotWaterException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("This is inner finally block");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

class NotMeatException extends RuntimeException {
    public NotMeatException(String str) {
        super(str);
    }
}

class NotWaterException extends Exception {
    public NotWaterException(String str) {
        super(str);
    }
}

class Tiger {
    public void eat(String str) {
        if (!str.equals("meat")) {
            throw new NotMeatException("Tiger not eat " + str);
        } else {
            System.out.println("Tiger eat " + str);
        }
    }

    public void drink(String str) throws NotWaterException {
        if (!str.equals("water")) {
            throw new NotWaterException("Tiger doesn't drink " + str);
        } else {
            System.out.println("Tiger drink " + str);
        }
    }
}
