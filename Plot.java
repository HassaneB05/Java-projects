/*
 * Class: CMSC203 21586
 * Instructor: Farnaz Eivazi
 * Description: This class creates plots and determines if these plots overlap or encompass.
 * Due: 11/03/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Hassane Bagayoko
*/


public class Plot {
    private int x;
    private int y;
    private int width;
    private int depth;

    public Plot() {
       x = 0;
       y = 0;
       width = 1;
       depth = 1;
    }

    public Plot(int x, int y, int width, int depth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }

    public Plot(Plot otherPlot) {
    	 x = otherPlot.x;        
    	 y = otherPlot.y;         
    	 width = otherPlot.width; 
    	 depth = otherPlot.depth;
    }
    
    public boolean overlaps(Plot plot) {
        boolean leftEdgeC = false; //C means condition
        boolean rightEdgeC = false;
        boolean topEdgeC = false;
        boolean bottomEdgeC = false;

        if (x < plot.x + plot.width) {
            leftEdgeC = true;
        }

        if (x + width > plot.x) {
           rightEdgeC = true;
        }

        if (y < plot.y + plot.depth) {
            topEdgeC = true;
        }

        if (y + depth > plot.y) {
            bottomEdgeC = true;
        }

        boolean isOverlapping = leftEdgeC && rightEdgeC && topEdgeC && bottomEdgeC;

        return isOverlapping;
    }
    
    public boolean encompasses(Plot plot) {
        boolean leftEdgeC = false;
        boolean rightEdgeC = false;
        boolean topEdgeC = false;
        boolean bottomEdgeC = false;

        if (x <= plot.x) {
            leftEdgeC = true;
        }
        
        if ((x + width) >= (plot.x + plot.width)) {
            rightEdgeC = true;
        }

        if (y <= plot.y) {
            topEdgeC = true;
        }

        if ((y + depth) >= (plot.y + plot.depth)) {
            bottomEdgeC = true;
        }

        boolean isEncompassing = leftEdgeC && rightEdgeC && topEdgeC && bottomEdgeC;

        return isEncompassing;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
    
    @Override
    public String toString() {
        return x + "," + y + "," + width + "," + depth;
    }
}