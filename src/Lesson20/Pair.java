package Lesson20;

public class Pair <T , U> {
private T first;
private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "red");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        pair.setFirst(2);
        pair.setSecond("black");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
