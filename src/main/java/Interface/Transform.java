package Interface;

import Point.Point2d;
import Point.PointOperator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Transform implements Rotate, Translate{
    /** TODO
     * Rotate all points of collections given in parameters
     * with the angle given
     * @param coords collections of Point2d
     * @param angle
     * @return rotated collection
     * */
    public Collection<Point2d> rotate(Collection<Point2d> coords, Double angle) {
        List<Point2d> rotatedCollection = new ArrayList<>();
        for (Point2d point : coords){
            Point2d rotatedPoint = point.rotate(angle);
            rotatedCollection.add(rotatedPoint);
        }
        return rotatedCollection;
    }

    /** TODO
     * Translate all points of a collection by a given vector
     * @param coords Collection of Point2d
     * @param translateVector Vector of translation
     * @return translated coords
     * */
    public Collection<Point2d> translate(Collection<Point2d> coords, Point2d translateVector) {
        List<Point2d> translatedCollection = new ArrayList<>();
        for (Point2d point : coords){
            Point2d translatedPoint = point.translate(translateVector);
            translatedCollection.add(translatedPoint);
        }
        return translatedCollection;
    }
}
