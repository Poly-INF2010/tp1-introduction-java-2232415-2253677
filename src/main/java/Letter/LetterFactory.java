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
        BaseShape letterA = new BaseShape();

        // Create the top horizontal bar of the letter A (Rectangle)
        Rectangle topBar = new Rectangle(maxWidth, stripeThickness);
        topBar.translate(topBar.getCoords(),new Point2d(0.0, halfMaxHeight + halfStripeThickness));
        letterA.add(topBar);

        // Create the left diagonal bar of the letter A (Ellipse)
        Rectangle leftDiagonalBar = new Rectangle(maxWidth, stripeThickness);
        leftDiagonalBar.rotate(leftDiagonalBar.getCoords(),-45.0); // Rotate the rectangle by 45 degrees
//        diagonalBar.translate(diagonalBar.getCoords(),new Point2d(stripeThickness / 2.0, -maxHeight + stripeThickness / 2.0));
        letterA.add(leftDiagonalBar);

        // Create the right diagonal bar of the letter A (Ellipse)
        Rectangle rightDiagonalBar = new Rectangle(maxWidth, stripeThickness);
        rightDiagonalBar.rotate(rightDiagonalBar.getCoords(),45.0); // Rotate the rectangle by 45 degrees
//        diagonalBar.translate(diagonalBar.getCoords(),new Point2d(stripeThickness / 2.0, -maxHeight + stripeThickness / 2.0));
        letterA.add(rightDiagonalBar);

        return letterA;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {

        BaseShape letterB = new BaseShape();

        // Create the first circle for the letter B
        Circle circle1 = new Circle(maxWidth);
        letterB.add(circle1);

        // Create the second circle for the letter B
        Circle circle2 = new Circle(maxWidth);
        letterB.add(circle2);

        // Create the rectangle connecting the circles for the letter B
        Rectangle rectangle = new Rectangle(maxWidth / 2, maxHeight);
        rectangle.translate(rectangle.getCoords(),new Point2d(-halfMaxWidth - halfStripeThickness, 0.0));
        letterB.add(rectangle);
//        Rectangle leftBar = new Rectangle(stripeThickness, maxHeight);
//        leftBar.translate(leftBar.getCoords(),new Point2d(-halfMaxWidth - halfStripeThickness, 0.0));
//        letterH.add(leftBar);
        return letterB;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {

        BaseShape letterC = new BaseShape();

        // Create an ellipse for the letter C
        Ellipse ellipse = new Ellipse(maxWidth, maxHeight);
        letterC.add(ellipse);

        return letterC;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape letterE = new BaseShape();

        // Create the top horizontal rectangle of the letter E
        Rectangle topRectangle = new Rectangle(maxWidth, stripeThickness);
        letterE.add(topRectangle);

        // Create the middle vertical rectangle of the letter E
        Rectangle middleRectangle = new Rectangle(stripeThickness, maxHeight - 2 * stripeThickness);
        middleRectangle.translate(middleRectangle.getCoords(),new Point2d(-halfMaxWidth - halfStripeThickness, 0.0));
        letterE.add(middleRectangle);

        // Create the bottom horizontal rectangle of the letter E
        Rectangle bottomRectangle = new Rectangle(maxWidth, stripeThickness);
        bottomRectangle.translate(bottomRectangle.getCoords(),new Point2d(0.0, -halfMaxHeight + stripeThickness));
        letterE.add(bottomRectangle);

        return letterE;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {

        BaseShape letterH = new BaseShape();

        // Create the left vertical bar of the letter H (Rectangle)
        Rectangle leftBar = new Rectangle(stripeThickness, maxHeight);
        leftBar.translate(leftBar.getCoords(),new Point2d(-halfMaxWidth - halfStripeThickness, 0.0));
        letterH.add(leftBar);

        // Create the right vertical bar of the letter H (Rectangle)
        Rectangle rightBar = new Rectangle(stripeThickness, maxHeight);
        rightBar.translate(rightBar.getCoords(),new Point2d(halfMaxWidth + halfStripeThickness, 0.0));
        letterH.add(rightBar);

        // Create the horizontal bar of the letter H (Rectangle)
        Rectangle horizontalBar = new Rectangle(maxWidth, stripeThickness);
        letterH.add(horizontalBar);

        return letterH;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {

        BaseShape letterN = new BaseShape();

        // Create the left vertical bar of the letter N (Rectangle)
        Rectangle leftBar = new Rectangle(stripeThickness, maxHeight);
        leftBar.translate(leftBar.getCoords(), new Point2d(-halfMaxWidth - halfStripeThickness, 0.0));
        letterN.add(leftBar);

        // Create the right vertical bar of the letter N (Rectangle)
        Rectangle rightBar = new Rectangle(stripeThickness, maxHeight);
        rightBar.translate(rightBar.getCoords(),new Point2d(halfMaxWidth + halfStripeThickness, 0.0));
        letterN.add(rightBar);

        // Create the diagonal bar of the letter N (Ellipse)
        Rectangle diagonalBar = new Rectangle(maxWidth, stripeThickness);
        diagonalBar.rotate(diagonalBar.getCoords(),45.0); // Rotate the rectangle by 45 degrees
//        diagonalBar.translate(diagonalBar.getCoords(),new Point2d(stripeThickness / 2.0, -maxHeight + stripeThickness / 2.0));
        letterN.add(diagonalBar);

        return letterN;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        BaseShape letterO = new BaseShape();

        // Create an ellipse for the letter O
        Ellipse ellipse = new Ellipse(maxWidth, maxHeight);
        letterO.add(ellipse);

        return letterO;
    }
}
