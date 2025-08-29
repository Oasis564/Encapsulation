class Polygon {
    // private variables (encapsulation)
    private int numSides;
    private double sideLength;

   
    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        if(numSides > 2) { 
            this.numSides = numSides;
        } else {
            System.out.println("A polygon must have at least 3 sides!");
        }
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        if(sideLength > 0) {
            this.sideLength = sideLength;
        } else {
            System.out.println("Side length must be positive!");
        }
    }

    
    public double calculateArea() {
        double area = (numSides * sideLength * sideLength) / 
                      (4 * Math.tan(Math.PI / numSides));
        return area;
    }
}