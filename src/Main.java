/**
 * Created by Алина on 12.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Rocket[] rockets = new Rocket[4];
        rockets[0] = new CasseteRocket();
        rockets[0].name = "Кассетная ракета";
        rockets[0].countryThatUseAndCreate = "USA";
        rockets[0].power = 2000;
        rockets[1] = new Tomagavk();
        rockets[1].name = "Тамогавк";
        rockets[1].countryThatUseAndCreate = "USA" ;
        rockets[1].power = 5000;
        rockets[2] = new TopoliM();
        rockets[2].name = "ТопольМ";
        rockets[2].countryThatUseAndCreate = "Российска Федерация" ;
        rockets[2].power = 20000000 ;
        rockets[3] = new SpaceRocket();
        rockets[3].name = "Байкал";
        rockets[3].countryThatUseAndCreate = "Российская Федерация";
        rockets[3].power = 1000000;

        for (Rocket rocket : rockets) {
            System.out.println("Название ракеты : " + rocket.name + "\n" + "Страна использующая данные ракеты: " + rocket.countryThatUseAndCreate + "\n"
           + "Мощность ракеты в тротиловом эквиваленте:  " + rocket.power + " кг");
            rocket.launch();
            rocket.explosion();
        }
    }
}
