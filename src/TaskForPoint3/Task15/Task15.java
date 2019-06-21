package TaskForPoint3.Task15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Task15 {
    public static void main(String[] args) {
        ArrayList<Points> PointsArray = new ArrayList<Points>(Arrays.asList(
                new Points(0,0),
                new Points(2.4f, 2.6f),
                new Points(2.45f, 2.61f)
        ));
        Task15.SerachPoint(PointsArray, new Points(2.50f,3f))
                .forEach(point -> System.out.print(" ("+point.getX()+", "+point.getY()+")"));
    }

    public static Stream<Points> SerachPoint(ArrayList<Points> pointsArray, Points X){
        return PointCalculation(pointsArray,X)
                .skip(pointsArray.size()-1)
                .limit(1);
    }

    private static Stream<Points> PointCalculation(ArrayList<Points> pointsArray, Points X){
        return pointsArray.stream()
                .sorted((point1,point2)->{
                    float distance1 =  (Math.abs(X.getX() - point1.getX()) + Math.abs(X.getY() - point1.getY()));
                    float distance2 =  (Math.abs(X.getX() - point2.getX()) + Math.abs(X.getY() - point2.getY()));
                    int result = distance1 == distance2 ? 0 : distance1 < distance2 ? -1 : 1;
                    return result;
                });

    }
}
