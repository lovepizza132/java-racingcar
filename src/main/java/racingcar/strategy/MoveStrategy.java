package racingcar.strategy;

@FunctionalInterface
public interface MoveStrategy {
    boolean decideMoveOrHold();
}
