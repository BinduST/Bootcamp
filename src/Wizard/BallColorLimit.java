package Wizard;

public enum BallColorLimit {
    RED(0) {
        void updateLimit(int greenBallCount) {
            this.limit = greenBallCount * 2 - 1;
        }
    },
    GREEN(3);

    protected int limit;

    BallColorLimit(int limit) {
        this.limit = limit;
    }

    boolean isLimitExceeded(int ballCount) {
        return limit <= ballCount;
    }
}
