package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {

        zofka.setLocation(200.0, 100.0);
        nakresliBarevnyMnohouhelnik(25, Color.red);

        zofka.setLocation(130.0, 240.0);
        zofka.turnRight(30);
        nakresliBarevnyRovnostrannyTrojuhelni(145, Color.yellow);

        zofka.setLocation(490, 100);
        zofka.turnLeft(30);
        nakresliBarevnyMnohouhelnik(20, Color.black);

        zofka.setLocation(550, 280);
        nakresliBarevnyMnohouhelnik(40, Color.black);

        zofka.setLocation(600, 560);
        nakresliBarevnyMnohouhelnik(55, Color.black);

        zofka.setLocation(640, 280);
        nakresliBarevnyMnohouhelnik(15, Color.black);

        zofka.setLocation(325, 280);
        nakresliBarevnyMnohouhelnik(15, Color.black);

        zofka.setLocation(1300, 500);
        nakresliBarevnyMnohouhelnik(30, Color.black);

        zofka.setLocation(1128, 500);
        nakresliObdelnik(280, 170);

        zofka.turnLeft(90);
        nakresliObdelnik(300, 150);

        for (int i = 0; i < 2; i++) {
            zofka.move(100);
            nakresliBarevnyMnohouhelnik(14, Color.black);
        }

        zofka.move(100);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnLeft(180);
        zofka.penDown();
        nakresliRovnoramennyPravouhlyTrojuhelnik(Color.black, 150);


    }

    public void nakresliBarevnyRovnostrannyTrojuhelni(double velikostStrany, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        zofka.move(velikostStrany);
        zofka.turnLeft(120);
        zofka.move(velikostStrany);
        zofka.turnLeft(120);
        zofka.move(velikostStrany);
        zofka.turnLeft(120);
    }

    public void nakresliRovnoramennyPravouhlyTrojuhelnik(Color barvaCary, double delkaStrany) {
        zofka.setPenColor(barvaCary);
        zofka.move(delkaStrany);
        zofka.turnLeft(90);
        zofka.move(delkaStrany);
        zofka.turnLeft(135);
        var velikostPrepony = Math.sqrt(2 * Math.pow(delkaStrany, 2));
        zofka.move(velikostPrepony);
        zofka.turnLeft(135);


    }

    public void nakresliBarevnyMnohouhelnik(double delkaStrany, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        for (int i = 0; i < 18; i++) {
            zofka.move(delkaStrany);
            zofka.turnLeft(20);
        }
    }

    public void nakresliObdelnik(double delkaStranyA, double delkaStranyB) {
        for (int i = 0; i < 2; i++) {
            zofka.move(delkaStranyA);
            zofka.turnRight(90);
            zofka.move(delkaStranyB);
            zofka.turnRight(90);


        }
    }


    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
