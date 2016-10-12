/**
 * Created by Алина on 12.10.2016.
 */
public class SpaceRocket extends Rocket {

    @Override
    public void launch() {
        System.out.println("Взлет космического корабля");
    }

    @Override
    void explosion() {
        System.out.println("Взрыв космичего корабля!Критические повреждения!Весь экипаж погиб\n");
    }
}
