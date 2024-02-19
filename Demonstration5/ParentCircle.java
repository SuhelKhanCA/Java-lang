class ParentCircle{
    static double x, y, r;
    ParentCircle(double r){
        this.r = r;
    }
    // Following is the nested class
    public static class Point{
        double x,y; // point coordinate
        void display(){
            System.out.println("(x, y): " + "(" + this.x + ", " + this.y + ")");
        }
        Point(double x , double y){
            this.x = x;
            this.y = y;
        }
    }
    public boolean isInside(Point p){
        double dx = p.x - x;
        double dy = p.y - y;
        double distance = Math.sqrt((dx*dx) + (dy*dy)); 

        if(distance < r) return true;
        else return false;
        public static void main(String[] args){
            ParentCircle a = new ParentCircle(2.0);
            Point pa =  new Point(1.2, 3.2);
            pa.display();
            System.out.println("Is the point is inside the circle :" + a.isInside(pa));

            ParentCircle b = new ParentCircle(2.0);
            Point pa2 =  new Point(1.1, 2.2);
            pa.display();
            System.out.println("Is the point is inside the circle :" + b.isInside(pa2));
        }
    }
}