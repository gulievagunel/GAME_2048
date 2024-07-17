package QuizGame;

class Question {
    private String questionText;
    private String[] options;
    private String correctAnswer;
    private int point;
    public Question(String questionText, String[] options, String correctAnswer, int point) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
        this.point = point;
    }
    public String getquestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public String getcorrectAnswer() {
        return correctAnswer;
    }

    public int getPoint() {
        return point;
    }
}