import SolarSystem.FeatureSun;
import SolarSystem.SolarSystemBasics;
import SolarSystem.SolarSystemBasics;

public class Main {
    public static void main(String[] args) {
        SolarSystemBasics solarsys=new SolarSystemBasics();
        solarsys.Sun="1";
        solarsys.Moon="2";
        solarsys.Planets="2";
        solarsys.Stars="10";
//****************FeatureSun*******************************
        FeatureSun Sun=new FeatureSun();
        Sun.name="panther";
        Sun.color="black";
        Sun.temp="-1223124kelvin";
    }
}
