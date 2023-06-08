package javaOOP04.shield;



public class BubbleShield implements Shield {

    @Override
    public int getProtection() {
        return 12;
    }

    @Override
    public String toString() {
        return String.format("BubbleShield: %d", getProtection());
    }

}
