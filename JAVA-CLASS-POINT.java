public class point{
     
     int ordone;
     int absise;

    public point( int ordone ,int absise) {
        this.ordone = ordone;
        this.absise = absise;
        
    }

    public float  norme ( ) {
          system.out.println( Math.sqrt ((this.ordone x this.ordone) +  (this.absise x  this.absise)));   
    }
    public  float  distance (int A,int B ) {
         return Math.sqrt ((this.ordone -A)  *  * 2  +  (this.absise -B)  *  * 2);
    }

public class main () {
   public static void main (string [] args) {
        point newpoint = new point () ;
        newpoint.absise = 10;
        newpoint.ordone = 20;
        newpoint.norme();

system.out.println(newpoint.absise);
system.out.println(newpoint.ordone);
newpoint.norme();

