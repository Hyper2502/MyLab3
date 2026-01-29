class RobotAssistant
{
    public static void main (String [] args)
    {
        // create an object of the assistant
        RobotAssistant robot = new RobotAssistant();
        // calling method with no parameter
        robot.display1();
        // calling method with the single parameter
        robot.display2("serving food");
    }
    // method with no parameter
    public void display1()
    {
        System.out.println("Method without parameter: Waiting…!");
    }
    // method with a single parameter
    public void display2(String a)
    {
        System.out.println("Method with a single parameter: The robot is " + a);
    }
}

/*

The output is:

Method without parameter: Waiting…!
Method with a single parameter: The robot is serving food

What are the advantages of using methods?
R: You are able to re-use part of the code for different purpose, in this case. Using method with a parameter to say
what's the robot doing.


 */