package Lesson_17;

public enum BookCatagory {
    FICTION("Fiction"),
    HISTORY("History"),
    FANTASY("Fantasy"),
    PSYCHOLOGY("Psychology");
    private final String description;

    BookCatagory(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}