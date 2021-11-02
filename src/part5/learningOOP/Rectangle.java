package part5.learningOOP;

//class
public class Rectangle {

 // instance variables
 private int width;
 private int height;

 // constructor
 public Rectangle(int width, int height) {
     this.width = width;
     this.height = height;
 }

 // methods
 public void widen() {
     this.width = this.width + 1;
 }

 public void narrow() {
     if (this.width > 0) {
         this.width = this.width - 1;
     }
 }

 public int surfaceArea() {
     return this.width * this.height;
 }

 public String toString() {
     return "(" + this.width + ", " + this.height + ")";
 }
}
