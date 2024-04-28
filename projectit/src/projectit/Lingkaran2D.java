package projectit;
 
import java.awt.Point;
 
/**
 *
 * @author dosen
 */
public class Lingkaran2D {
 
    private int r;
    private Point titikPusat;
 
    public Lingkaran2D(int r) {
        this.r = r;
        this.titikPusat = new Point(0, 0);
    }
 
    public Lingkaran2D() {
        this.r = 5;
        this.titikPusat = new Point(0, 0);
    }
 
    public Lingkaran2D(int r, Point titikPusat) {
        this.r = r;
        this.titikPusat = titikPusat;
    }
 
    public int getR() {
        return r;
    }
 
    public void setR(int r) {
        this.r = r;
    }
 
    public Point getTitikPusat() {
        return titikPusat;
    }
 
    public void setTitikPusat(Point titikPusat) {
        this.titikPusat = titikPusat;
    }
 
    public double getLuas() {
        return Math.PI * r * r;
    }
 
    public double getKeliling() {
        return Math.PI * 2 * r;
    }
 
    @Override
    public String toString() {
        return "Lingkaran2D{" + "r=" + r + ", titikPusat=" + titikPusat + '}';
    }
    
    public static boolean isBeririsan(Lingkaran2D link1, Lingkaran2D link2) {
        int a = link1.titikPusat.x - link2.titikPusat.x;
        double a2 = Math.pow(a,2);

        int b = link1.titikPusat.y - link2.titikPusat.y;
        double b2 = Math.pow(b,2);

        double jarak = Math.sqrt(a2 + b2);
        if (jarak <= (link1.r + link2.r)){
            return true;
        } else {
            return false;
        }
    }

    public boolean isBeririsan(Lingkaran2D link2) {
        int a = this.titikPusat.x - link2.titikPusat.x;
        double a2 = Math.pow(a,2);

        int b = this.titikPusat.y - link2.titikPusat.y;
        double b2 = Math.pow(b,2);

        double jarak = Math.sqrt(a2 + b2);
        if (jarak <= (this.r + link2.r)){
            return true;
        } else {
            return false;
        }
    }
}