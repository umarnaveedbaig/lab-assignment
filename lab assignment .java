////////////class Rectangle {
////////////    public int length, width;
////////////    public Rectangle() {
////////////        length = 5;
////////////        width = 2;
////////////    }
////////////    public Rectangle(int l, int w) {
////////////        length = l;
////////////        width = w;
////////////    }
////////////    public int Calculatearea() {
////////////        return (length * width);
////////////    }
////////////    public static void main(String args[]) {
////////////        Rectangle rect = new Rectangle();
////////////        System.out.println(rect.Calculatearea());
////////////        Rectangle rect1 = new Rectangle(10, 20);
////////////        System.out.println(rect1.Calculatearea());
////////////    }
////////////}
//////////
//////////class Point {
//////////    private int x;
//////////    private int y;
//////////    public Point() {
//////////        x = 1;
//////////        y = 2;
//////////    }
//////////    public Point(int a, int b) {
//////////        x = a;
//////////        y = b;
//////////    }
//////////    public void setX(int a) {
//////////        x = a;
//////////        System.out.println("x coordinate = " + x + " y coordinate = "
//////////                + y);
//////////    }
//////////    public void setY(int b) {
//////////        y = b;
//////////        System.out.println("x coordinate = " + x + " y coordinate = "
//////////                + y);
//////////    }
//////////    public void display() {
//////////        System.out.println("x coordinate = " + x + " y coordinate = "
//////////                + y);
//////////    }
//////////    public void movePoint(int a, int b) {
//////////        x = x + a;
//////////        y = y + b;
//////////        System.out.println("x coordinate after moving = " + x + " y coordinate after moving = " + y);
//////////    }
//////////
//////////    public static void main(String args[]) {
//////////        Point p1 = new Point();
//////////        p1.setX(p1.x);
//////////        p1.movePoint(2, 3);
//////////        Point p2 = new Point();
//////////        p2.setY(p2.);
//////////        p2.movePoint(2, 3);
//////////    }
//////////}
////////
////////
////////
////////
////////
////////class Circle {
////////    double radius;
////////
////////    Circle() {
////////        radius = 0;
////////    }
////////
////////    Circle(double r) {
////////        radius = r;
////////    }
////////
////////    double calculateCircumference() {
////////        return 2 * 3.14 * radius;
////////    }
////////
////////    void display() {
////////        System.out.println("Radius: " + radius);
////////        System.out.println("Circumference: " + calculateCircumference());
////////    }
////////
////////    public static void main(String[] args) {
////////        Circle c1 = new Circle();
////////        Circle c2 = new Circle(5);
////////        c1.display();
////////        c2.display();
////////    }
////////}
//////
////
////class distance{
////    int feet;
////    int inches;
////    distance(){
////        feet=0;
////        inches=0;
////    }
////    distance(int f ,int i){
////        feet=f;
////        inches=i;}
////    void display(){
////        System.out.println("feet="+feet);
////        System.out.println("inches="+inches);
////    }
////    public static void main(String[] args){
////        distance d1= new distance();
////        distance d2= new distance(3,4);
////        d1.display();
////        d2.display();
////
////    }
////}
//
//
////class Marks {
////    int mark1;
////    int mark2;
////    int mark3;
////
////    Marks() {
////        mark1 = 0;
////        mark2 = 0;
////        mark3 = 0;
////    }
////
////    Marks(int a, int b, int c) {
////        mark1 = a;
////        mark2 = b;
////        mark3 = c;
////    }
////
////    int calculateSum() {
////        return mark1 + mark2 + mark3;
////    }
////
////    public static void main(String[] args) {
////        Marks m1 = new Marks();
////        Marks m2 = new Marks(80, 95, 90);
////
////        System.out.println("Total marks: " + m2.calculateSum());
////    }
////}
//
//class time{
//    int hours;
//    int minutes;
//    int seconds;
//
//    time(){
//        hours=0;
//        minutes=0;
//        seconds=0;
//    }
//    time(int a , int b, int c ){
//       if(a>=0 && a<24 && b>=0  && b<60 && c>=0 && c<= 60){
//           hours=a;
//           minutes=b;
//           seconds=c;
//       }else{
//           hours=0;
//           minutes=0;
//           seconds=0;
//           System.out.println("invalid time ");
//       }}
//       void display () {
//            System.out.println("hrs= "+hours+"\nminutes= "+minutes+"\nseconds= "+seconds);
//        }
//           public static void main(String[] args) {
//        time t1 = new time();
//        time t2 = new time(22,45,52);
//        t2.display();
//           }
//    }
//