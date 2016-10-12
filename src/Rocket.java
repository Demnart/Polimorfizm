/**
 * Created by Алина on 12.10.2016.
 */
public abstract class Rocket {
    String name;
    String countryThatUseAndCreate;
    int power;

  public void launch(){
        System.out.println("Ракета запущена");
    }

    abstract void explosion();
}
