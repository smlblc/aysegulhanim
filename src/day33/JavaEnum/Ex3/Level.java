package day33.JavaEnum.Ex3;

public enum Level {
    HIGH(1), // 1
    MEDIUM(2), // 2
    LOW(3); // 3

    public int levelNumber;
    // enum constructorlar otomatik olarak privatelardir
    Level(int i) {
        levelNumber = i;
    }
}

enum StudentGrade {
    FAIL("F"),
    PASS("P");

    public String gradeLetter;

    // all enum constructors are private by default
    StudentGrade(String p) { //ben bu enuma bir string koyacagim ve bu benim gradeletterim olsun demek
        //icine if de konulabilir
        //if(p.equalsIgnoreCase("F")) {
           // System.out.println("Fail is used");
       // }

        gradeLetter = p; // instance variable ile girdigimiz degeri   burada bagladik aslinda.
    }

    public void prettyPrint() {
        System.out.println("Enum: " + this); //FAIL
        System.out.println("Value: " + this.gradeLetter);//F
    }
}
