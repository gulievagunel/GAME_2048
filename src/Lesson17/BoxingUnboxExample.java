package Lesson17;
class BoxingUnboxingExample {
    public static void main(String[] args) {
        int primitiveInt = 12;
        Integer boxedInt = primitiveInt;
        int unboxedInt = boxedInt;
        System.out.println("Original int value: " + primitiveInt);
        System.out.println("Boxed Integer value: " + boxedInt);
        System.out.println("Unboxed int value: " + unboxedInt);
    }
}