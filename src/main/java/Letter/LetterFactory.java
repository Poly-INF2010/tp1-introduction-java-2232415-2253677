package Letter;

import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {

        Rectangle topBar = new Rectangle(maxWidth, stripeThickness);
        topBar.translate(topBar.getCoords(),new Point2d(0.0, halfMaxHeight + halfStripeThickness));

        Rectangle leftDiagonalBar = new Rectangle(maxWidth, stripeThickness);
        leftDiagonalBar.rotate(leftDiagonalBar.getCoords(),-45.0);
        topBar.add(leftDiagonalBar);

        Rectangle rightDiagonalBar = new Rectangle(maxWidth, stripeThickness);
        rightDiagonalBar.rotate(rightDiagonalBar.getCoords(),45.0);
        topBar.add(rightDiagonalBar);

        return topBar;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {

        Circle circle1 = new Circle(maxWidth);

        Circle circle2 = new Circle(maxWidth);
        circle2.translate(circle2.getCoords(), new Point2d(0.0, -halfMaxHeight + stripeThickness));
        circle1.add(circle2);

        Rectangle rectangle = new Rectangle(halfMaxWidth, maxHeight);
        rectangle.translate(rectangle.getCoords(),new Point2d(-halfMaxWidth - halfStripeThickness, -halfMaxHeight+stripeThickness));
        circle1.add(rectangle);

        return circle1;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {

       return new Ellipse(maxWidth, maxHeight);

    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {

        Rectangle topRectangle = new Rectangle(maxWidth, halfStripeThickness);

        Rectangle middleRectangle = new Rectangle(maxWidth, halfStripeThickness);
        middleRectangle.translate(middleRectangle.getCoords(),new Point2d(0.0, -halfMaxHeight + stripeThickness));
        topRectangle.add(middleRectangle);

        Rectangle bottomRectangle = new Rectangle(maxWidth,halfStripeThickness);
        bottomRectangle.translate(bottomRectangle.getCoords(), new Point2d(0.0, halfMaxHeight));
        topRectangle.add(bottomRectangle);

        Rectangle sideRectangle = new Rectangle(halfStripeThickness, maxHeight);
        sideRectangle.translate(sideRectangle.getCoords(),new Point2d(-halfMaxWidth - halfStripeThickness, 0.0));
        topRectangle.add(sideRectangle);

        return topRectangle;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {

        Rectangle leftBar = new Rectangle(stripeThickness, maxHeight);
        leftBar.translate(leftBar.getCoords(),new Point2d(-halfMaxWidth - halfStripeThickness, 0.0));

        Rectangle rightBar = new Rectangle(stripeThickness, maxHeight);
        rightBar.translate(rightBar.getCoords(),new Point2d(halfMaxWidth + halfStripeThickness, 0.0));
        leftBar.add(rightBar);

        Rectangle horizontalBar = new Rectangle(maxWidth, stripeThickness);
        leftBar.add(horizontalBar);

        return leftBar;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {

        Rectangle leftSide = new Rectangle(stripeThickness, maxHeight);
        leftSide.translate(leftSide.getCoords(), new Point2d(-halfMaxWidth - halfStripeThickness, 0.0));

        Rectangle rightSide = new Rectangle(stripeThickness, maxHeight);
        rightSide.translate(rightSide.getCoords(),new Point2d(halfMaxWidth + halfStripeThickness, 0.0));
        leftSide.add(rightSide);

        Rectangle diagonal = new Rectangle(maxWidth, stripeThickness);
        diagonal.rotate(diagonal.getCoords(),45.0);
//        diagonal.translate(diagonal.getCoords(),new Point2d(stripeThickness / 2.0, -maxHeight + stripeThickness / 2.0));
        leftSide.add(diagonal);

        return leftSide;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {

        Ellipse ellipse = new Ellipse(maxWidth, maxHeight);
        Ellipse insideEllipse = new Ellipse(maxWidth-halfStripeThickness,maxHeight-halfStripeThickness);
        return ellipse.add(insideEllipse);
    }
}
