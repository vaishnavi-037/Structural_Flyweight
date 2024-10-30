package exampleOne.flyweight;

import exampleOne.Sprites;

public class HumanoidRobot implements IRobot {

    private String type;
    private Sprites body;

    public HumanoidRobot(String type, Sprites body) {
        this.type = type;
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public Sprites getBody() {
        return body;
    }

    @Override
    public void display(int x, int y) {
        // use the humanoid sprites object
        // and X and Y to render the image
        System.out.println("Displaying the HumanoidRobot");
    }
}
