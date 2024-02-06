package Point;

public class Point2d extends AbstractPoint {
    private final Integer X = 0;
    private final Integer Y = 1;

    /** TODO
     * 2D Point Constructor from coordinates
     * @param x X coordinate
     * @param y Y coordinate
     */
    public Point2d(Double x, Double y) {
        super(new double[] {x, y});
    }

    /** TODO
     * 2D Point Constructor from vector
     * @param vector Vector containing X and Y coordinates
     */
    public Point2d(Double[] vector) { this(vector[0], vector[1]); }

    /**
     * @return X coordinate
     */
    public double X() { return vector[X];}

    /**
     * @return Y coordinate
     */
    public double Y() { return vector[Y];}

    /** TODO
     * Translate the point by the given vector
     * @param translateVector The vector by which to translate
     * @return Translated point
     */
    @Override
    public Point2d translate(Double[] translateVector) {
        Point2d translatedPoint = new Point2d(this.vector);
        PointOperator.translate(translatedPoint.vector,translateVector);
        return translatedPoint;
        //Utiliser new ou (this) est correct?(best facon de faire)??
        //CODE utilisation de (this) passe test:
//        PointOperator.translate(this.vector,translateVector);
//        return this;
    }

    /** TODO
     * Translate the point by the given 2D Point
     * @param translateVector The 2D Point by which to translate
     * @return Translated point
     */
    public Point2d translate(Point2d translateVector) {
        Double[] translatedPoint2D = {translateVector.X(), translateVector.Y()};
        PointOperator.translate(this.vector, translatedPoint2D);
        return this;
    }

    /** TODO
     * Rotate the point by the given rotation Matrix
     * @param rotationMatrix Matrix by which to rotate
     * @return Rotated point
     */
    @Override
    public Point2d rotate(Double[][] rotationMatrix) {
        Point2d rotatedPoint = new Point2d(this.vector);
        PointOperator.rotate(rotatedPoint.vector,rotationMatrix);
        return rotatedPoint;
        //Utiliser new ou (this) est correct?(best facon de faire)??
        //CODE utilisation de (this) passe test:
//        PointOperator.rotate(this.vector,rotationMatrix);
//        return this;
    }

    /** TODO
     * Rotate the point by the given angle
     * @param angle Angle in radians
     * @return Rotated point
     */
    public Point2d rotate(Double angle) {
        Double[][] rotation = {
                {Math.cos(angle), -Math.sin(angle)},
                {Math.sin(angle), Math.cos(angle)}
        };
        PointOperator.rotate(this.vector, rotation);
        return this;
    }

    /** TODO
     * Divide the X and Y coordinates of a 2D point by a scalar
     * @param divider Scalar used to divide
     * @return Divided point
     */
    @Override
    public Point2d divide(Double divider) {
        PointOperator.divide(this.vector, divider);
        return this;
    }

    /** TODO
     * Multiply the X and Y coordinates of a 2D point by a scalar
     * @param multiplier Scalar used to multiply
     * @return Multiplied point
     */
    @Override
    public Point2d multiply(Double multiplier) {
        PointOperator.multiply(this.vector, multiplier);
        return this;
    }

    /** TODO
     * Add a scalar to the X and Y coordinates of a 2D point
     * @param adder Scalar to add
     * @return Added point
     */
    @Override
    public Point2d add(Double adder) {
        PointOperator.add(this.vector, adder);
        return this;
    }

    /** TODO
     * @return Deep copy of the 2D point
     */
    @Override
    public Point2d clone() {
        return  new Point2d(this.vector.clone());
    }
}
