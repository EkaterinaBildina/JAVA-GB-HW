package javaOOP04.shield;

public class ShellShield implements Shield {

    @Override
    public int getProtection() {
        return 6;
    }
    @Override
    public String toString() {
        return String.format("ShellShield: %d", getProtection());
    }
}
