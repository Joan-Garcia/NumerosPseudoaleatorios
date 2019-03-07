package model;

public class variables {

    private int a;
    private int b;
    private int c;
    private int g;
    private int xo;
    
    public int getA() {return a;}
    public int getB() {return b;}
    public int getC() {return c;}
    public int getG() {return g;}
    public int getXo(){return xo;}
    
    public boolean setA(int a) {
        if (a > 0) {
            this.a = a;
            return true;
        } else {
            return false;
        }
    }
    public boolean setB(int b) {
        if (b > 0) {
            this.b = b;
            return true;
        } else {
            return false;
        }
    }
    public boolean setC(int c) {
        if (c > 0) {
            this.c = c;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean setG(int g) {
        if (g > 0) {
            this.g = g;
            return true;
        } else {
            return false;
        }
    }
    public boolean setXo(int xo) {
        if (xo > 0) {
            this.xo = xo;
            return true;
        } else {
            return false;
        }
    }
}
