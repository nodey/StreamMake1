package TaskForPoint4.Task17;

public class Task17 {
    public static void main(String[] args) {
        Calculations calculations = (x,y,z,u,v)-> System.out.println(x * x * x   +   y * y * y   +   z * z * z   +   u * u * u   +   v * v * v);
        calculations.calculate(1, 2, 1, 1, 1);

    }
}
