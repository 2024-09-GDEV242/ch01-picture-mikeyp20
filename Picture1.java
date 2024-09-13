

/**
 * 
  The image that is shown is three men walking past pyrmaids 
 * 
 * @author  Michael Patterson
 * @version 2024.09.10
 */
public class Picture1
{
    private Square path;
    private Triangle pyrmaid;
    private Triangle pyrmaid1;
    private Triangle pyrmaid2;
    private Circle sun;
    private Person man;
    private Person man1;
    private Person man2;
    private boolean drawn;
    private int height;
    private int width;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;


    /**
     * Constructor for objects of class Picture
     */
    public Picture1()
    {
        path =  new  Square();
        pyrmaid =  new  Triangle();
        pyrmaid1 =  new  Triangle();
        pyrmaid2 =  new  Triangle();
        sun =  new  Circle();
        man = new Person();
        man1 = new Person();
        man2 = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if ( ! drawn) {
            path.changeColor("green");
            path.moveVertical(100);
            path.moveHorizontal(-320);
            path.changeSize(550);
            path.makeVisible();
            pyrmaid.changeSize(50, 160);
            pyrmaid.moveHorizontal(-100);
            pyrmaid.moveVertical(-50);
            pyrmaid.makeVisible();
            pyrmaid.changeColor("brown");
            pyrmaid1.changeSize(50, 160);
            pyrmaid1.moveHorizontal(190);
            pyrmaid1.moveVertical(-30);
            pyrmaid1.makeVisible();
            pyrmaid1.changeColor("brown");
            pyrmaid2.changeSize(50, 160);
            pyrmaid2.moveHorizontal(65);
            pyrmaid2.moveVertical(-50);
            pyrmaid2.makeVisible();
            pyrmaid2.changeColor("brown");
            sun.changeColor("yellow");
            sun.moveHorizontal(110);
            sun.moveVertical(-85);
            sun.changeSize(80);
            sun.makeVisible();
            man.changeSize(40,40);
            man.moveHorizontal(-100);
            man.moveVertical(0);
            man.makeVisible();
            man1.changeSize(40,40);
            man1.moveHorizontal(-50);
            man1.moveVertical(0);
            man1.makeVisible();
            man2.changeSize(40,40);
            man2.moveHorizontal(-5);
            man2.moveVertical(0);
            man2.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        path.changeColor("white");
        pyrmaid.changeColor("black");
        pyrmaid1.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        path.changeColor("green");
        pyrmaid.changeColor("brown");
        pyrmaid1.changeColor("brown");
        sun.changeColor("yellow");
    }    
}
