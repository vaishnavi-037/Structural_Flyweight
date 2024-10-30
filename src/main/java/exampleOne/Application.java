package exampleOne;

import exampleOne.flyweight.IRobot;

public class Application {
    public static void main(String[] args) {
        IRobot humanoidRobotOne = RobotFactory.createRobot("HUMANOID");
        humanoidRobotOne.display(1, 2);
        IRobot humanoidRobotTwo = RobotFactory.createRobot("HUMANOID");
        humanoidRobotTwo.display(2, 4);

        IRobot roboDogOne = RobotFactory.createRobot("ROBOTICDOG");
        roboDogOne.display(5, 6);
        IRobot roboDogTwo = RobotFactory.createRobot("ROBOTICDOG");
        roboDogTwo.display(17, 7);
    }
}
