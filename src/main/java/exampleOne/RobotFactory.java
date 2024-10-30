package exampleOne;

import exampleOne.flyweight.HumanoidRobot;
import exampleOne.flyweight.IRobot;
import exampleOne.flyweight.RoboticDog;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    private static Map<String, IRobot> robotObjectCache = new HashMap<>();

    public static IRobot createRobot(String robotType){
        if(robotObjectCache.containsKey(robotType)) return robotObjectCache.get(robotType);
        else {
            if (robotType.equals("HUMANOID")){
                Sprites humanoidSprites = new Sprites();
                IRobot humanoidRobot = new HumanoidRobot(robotType, humanoidSprites);
                robotObjectCache.put(robotType, humanoidRobot);
                return humanoidRobot;
            } else if(robotType.equals("ROBOTICDOG")){
                Sprites roboticDogSprites = new Sprites();
                IRobot roboticDog = new RoboticDog(robotType, roboticDogSprites);
                robotObjectCache.put(robotType, roboticDog);
                return roboticDog;
            }
        }
        return null;
    }
}
