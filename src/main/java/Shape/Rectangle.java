package Shape;

import Point.Point2d;

import java.util.Collection;

public class Rectangle extends BaseShape {
    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        double halfWidth = width/2.0;
        double halfHeight = height/2.0;

        double spacing = 0.5;

        Point2d topLeft = new Point2d(-halfWidth, halfHeight);
        Point2d topRight = new Point2d(halfWidth, halfHeight);
        Point2d bottomLeft = new Point2d(-halfWidth, -halfHeight);
        Point2d bottomRight = new Point2d(halfWidth, -halfHeight);

        double numPointsX = width/spacing;
        double numPointsY = height/spacing;

        for (int i = 0; i < numPointsX; i++){
            for (int j = 0; j<numPointsY; j++){
                double x = -halfWidth + i * spacing;
                double y = halfHeight - j * spacing;
                this.add(new Point2d(x, y));
            }
        }

    }

    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }


    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {

        double minX = Double.POSITIVE_INFINITY;
        double maxX = Double.NEGATIVE_INFINITY;
        double minY = Double.POSITIVE_INFINITY;
        double maxY = Double.NEGATIVE_INFINITY;

        for (Point2d point : coords) {
            double x = point.X();
            double y = point.Y();

            minX = Math.min(minX, x);
            maxX = Math.max(maxX, x);
            minY = Math.min(minY, y);
            maxY = Math.max(maxY, y);
        }

        double width = maxX - minX;
        double height = maxY - minY;

        double centerX = minX + width / 2.0;
        double centerY = minY + height / 2.0;

        for (Point2d point : coords) {
            double adjustedX = point.X() - centerX;
            double adjustedY = point.Y() - centerY;
            this.add(new Point2d(adjustedX, adjustedY));
        }
    }

    /** TODO
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
        return new Rectangle(cloneCoords());
    }
}
