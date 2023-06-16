package co.develhope.introduction;
public class TestProgrammers {
    public static void main(String[] args){
        Programmers programmers1 = new Programmers();
            programmers1.name = "Silvesta Bonucci";
            programmers1.age = 35;

            programmers1.drinkCoffe();
            programmers1.printDetails();

        Programmers programmers2 = new Programmers();
            programmers2.name = "Fidelis Maiba";
            programmers2.age = 23;

            programmers2.printDetails();
            programmers2.hasGlasses();

    }
}

class Programmers{
    String name;
    int age;
    boolean wearsGlasses;

    public void drinkCoffe(){
        System.out.println("Espresso is the secret!");
    }

    public void printDetails(){
        System.out.println(this.name + " is a "+this.age+ " years programmer");
    }
    public void hasGlasses(){
        System.out.println("Is " + this.name+ " wearing glasses? ");
    }

}
