package day32.NonAccesModifier.FinalModifiers;

public class Person {

    public String name;
    public final int fingerprintCode; //istedigin class da initial edebilirsin ama 1 kere.

    public Person(String name, int fingerprint) {
        this.name = name;
        this.fingerprintCode = fingerprint;
    }}