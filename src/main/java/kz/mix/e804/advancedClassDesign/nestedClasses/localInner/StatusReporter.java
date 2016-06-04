//CHECKSTYLE:OFF
package kz.mix.e804.advancedClassDesign.nestedClasses.localInner;

public class StatusReporter {
    // important to note that the argument "color" is declared final
    // otherwise, the local inner class DescriptiveColor will not be able to use it!!
    static Shape.Color getDescriptiveColor(final Shape.Color color) {
        // local class DescriptiveColor that extends Shape.Color class
        class  DescriptiveColor extends Shape.Color {
            public String toString() {
                return "You selected a color with RGB values " + color;
            }
        }
        return new DescriptiveColor();
    }

    public static void main(String[] args) {
        Shape.Color descriptiveColor = StatusReporter.getDescriptiveColor(new Shape.Color(0, 0, 0));
        System.out.println(descriptiveColor);
    }
}
