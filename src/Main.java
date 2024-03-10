//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            dragon dragon = new dragon();
            humen humen = new humen();
            main( humen , dragon );
        }
    private static void main(humen humen, dragon dragon) {
        while (true) {
            if (!dragon.isdragonAlive && humen.ishumenAlive) {
                System.out.println("dragon is dead. humen win!");
                break;
            } else if (dragon.isdragonAlive && !humen.ishumenAlive) {
                System.out.println("humen is dead. dragon win!");
                break;
            } else if (!dragon.isdragonAlive && !humen.ishumenAlive) {
                System.out.println("All is dead...");
                break;
            }
            if (dragon.health < 0) {
                dragon.isdragonAlive = false;
            } else {
                dragon.health -= humen.kickPower;
            }
            if (humen.health < 0) {
                humen.ishumenAlive = false;
            } else {
               humen.health -= dragon.kickPower;
            }
        }
    }
}


