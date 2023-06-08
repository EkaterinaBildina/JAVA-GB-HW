package javaOOP04.shield;


public class HyleanShield implements Shield {


    @Override
    public int getProtection() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format("HyleanShield: %d", getProtection());
    }


}
