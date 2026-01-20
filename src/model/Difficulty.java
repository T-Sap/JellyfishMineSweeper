package model;

public enum Difficulty {

    // rows, cols, mines, questions, surprises, initialLives, powerCost, surprisePoints
    EASY   (9,  9, 10, 6, 2, 10, 5,  8),
    MEDIUM (13, 13, 26, 7, 3,  8, 8, 12),
    HARD   (16, 16, 44, 11,4,  6, 12,16);

    private final int rows;
    private final int cols;
    private final int mines;
    private final int questionCount;
    private final int surpriseCount;
    private final int initialLives;
    private final int powerCost;       // מחיר הפעלת שאלה/הפתעה
    private final int surprisePoints;  // כמה נקודות הפתעה טובה/רעה נותנת (+/-)
    private final int turnCount;
    Difficulty(int rows, int cols, int mines,
               int questionCount, int surpriseCount,
               int initialLives, int powerCost,
               int surprisePoints) {
        this.rows = rows;
        this.cols = cols;
        this.mines = mines;
        this.questionCount = questionCount;
        this.surpriseCount = surpriseCount;
        this.initialLives = initialLives;
        this.powerCost = powerCost;
        this.surprisePoints = surprisePoints;
        this.turnCount = 5; //for now i just decided this is cool. i guess.
    }

    public int getRows()          { return rows; }
    public int getCols()          { return cols; }
    public int getMines()         { return mines; }
    public int getQuestionCount() { return questionCount; }
    public int getSurpriseCount() { return surpriseCount; }
    public int getInitialLives()  { return initialLives; }
    public int getPowerCost()     { return powerCost; }
    public int getSurprisePoints(){ return surprisePoints; }
    public int getTurnCount(){ return turnCount; }

}
