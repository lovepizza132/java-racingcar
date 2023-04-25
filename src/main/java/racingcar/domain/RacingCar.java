package racingcar.domain;

import racingcar.strategy.MoveStrategy;

public class RacingCar {
    private static final int MOVEMENT_DISTANCE = 1;     // 자동차 이동 시 1만큼 전진
    private static final int CAR_NAME_LIMIT = 5;
    private int position = 0;                           // 차가 이동한 위치
    private String carName;

    public RacingCar(String carName) {
        this(carName, 0);
    }

    public RacingCar(String carName, int position) {
        checkCarName(carName);
        this.carName = carName;
        this.position = position;
    }

    public void checkCarName(String carName) {
        if(carName.length() > CAR_NAME_LIMIT) {
            throw new IllegalArgumentException("자동차 이름이 5글자를 초과합니다.");
        };
    }

    public void tryToMove(MoveStrategy moveStrategy) {
        if (moveStrategy.decideMoveOrHold()) {
            this.position += MOVEMENT_DISTANCE;
        }
    }

    public int position() {
        return this.position;
    }

    public String name() {
        return this.carName;
    }
}
