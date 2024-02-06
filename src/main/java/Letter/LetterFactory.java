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
    final static Double adjustPlacement5 = 5.0;
    final static Double adjustPlacement3 = 3.0;
    final static Double adjustPlacement20 = 20.0;
    final static Double getAdjustPlacement10 = 10.0;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        Rectangle middleBar = new Rectangle(stripeThickness, halfStripeThickness);
        middleBar.translate(middleBar.getCoords(),new Point2d(halfStripeThickness, 0.0));

        Rectangle leftDiagonalBar = new Rectangle(halfStripeThickness, maxHeight);
        leftDiagonalBar.rotate(leftDiagonalBar.getCoords(),Math.toRadians(350));
        leftDiagonalBar.translate(leftDiagonalBar.getCoords(), new Point2d(stripeThickness * 1.5, 0.0));
        middleBar.add(leftDiagonalBar);

        Rectangle rightDiagonalBar = new Rectangle(halfStripeThickness, maxHeight);
        rightDiagonalBar.rotate(rightDiagonalBar.getCoords(),Math.toRadians(10));
        middleBar.add(rightDiagonalBar);

        return middleBar;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        Circle circle1 = new Circle(halfMaxHeight);
        circle1.translate(circle1.getCoords(), new Point2d(0.0, -halfMaxHeight + stripeThickness));

        Circle insideCircle1 = new Circle(halfMaxHeight);
        insideCircle1.translate(insideCircle1.getCoords(), new Point2d(0.0, -halfMaxHeight + stripeThickness-halfStripeThickness + adjustPlacement5));
        circle1.add(insideCircle1);

        Circle circle2 = new Circle(halfMaxHeight);
        circle2.translate(circle2.getCoords(), new Point2d(0.0, -halfMaxHeight - stripeThickness * adjustPlacement3 ));
        circle1.add(circle2);

        Circle insideCircle2 = new Circle(halfMaxHeight);
        insideCircle2.translate(insideCircle2.getCoords(), new Point2d(0.0, -halfMaxHeight - stripeThickness * adjustPlacement3 - halfStripeThickness + adjustPlacement5));
        circle1.add(insideCircle2);

        Rectangle rectangle = new Rectangle(stripeThickness + adjustPlacement5, maxHeight);
        rectangle.translate(rectangle.getCoords(),new Point2d(-halfMaxWidth -halfStripeThickness, -halfMaxHeight - adjustPlacement20));
        circle1.add(rectangle);

        return circle1;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        Rectangle rectangle = new Rectangle(maxWidth, 0.75 * maxHeight);
        rectangle.translate(rectangle.getCoords(), new Point2d(0.65 * maxWidth, 0.0));

        return new Ellipse(maxWidth , maxHeight)
                .remove(rectangle);
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        Rectangle topRectangle = new Rectangle(maxWidth + getAdjustPlacement10, halfStripeThickness + adjustPlacement5);
        topRectangle.translate(topRectangle.getCoords(),new Point2d(0.0, -halfMaxHeight + stripeThickness));

        Rectangle bottomRectangle = new Rectangle(maxWidth + getAdjustPlacement10,halfStripeThickness + adjustPlacement5);
        bottomRectangle.translate(bottomRectangle.getCoords(), new Point2d(0.0, halfMaxHeight));

        Rectangle sideRectangle = new Rectangle(halfStripeThickness + adjustPlacement5, maxHeight - adjustPlacement20);
        sideRectangle.translate(sideRectangle.getCoords(),new Point2d(-halfMaxWidth, 0.0));

        return new Rectangle(maxWidth + 10, halfStripeThickness + adjustPlacement5)
                .add(topRectangle)
                .add(bottomRectangle)
                .add(sideRectangle);
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

        return new Rectangle(maxWidth, stripeThickness)
                .add(leftBar)
                .add(rightBar);
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        Rectangle rightBar = new Rectangle(halfStripeThickness, maxHeight);
        rightBar.translate(rightBar.getCoords(),new Point2d( maxWidth - adjustPlacement5, 0.0));

        Rectangle middleBar = new Rectangle(halfStripeThickness, maxHeight);
        middleBar.rotate(middleBar.getCoords(),Math.toRadians(340));
        middleBar.translate(middleBar.getCoords(),new Point2d(halfMaxWidth, 0.0));

        return new Rectangle(halfStripeThickness, maxHeight)
                .add(rightBar)
                .add(middleBar);
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        Ellipse insideEllipse = new Ellipse(maxWidth-halfStripeThickness,maxHeight-halfStripeThickness);
        return new Ellipse(maxWidth, maxHeight)
                .add(insideEllipse);
    }
}
