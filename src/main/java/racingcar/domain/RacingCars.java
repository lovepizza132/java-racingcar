package racingcar.domain;

import racingcar.strategy.MoveStrategy;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {
  private final List<RacingCar> racingCars;

  public RacingCars(int numberOfCars) {
    this.racingCars = new ArrayList<>();

    for (int i = 0; i < numberOfCars; i++) {
      this.racingCars.add(new RacingCar());
    }
  }

  public void runRacingRound(MoveStrategy normalMoveStrategy) {
    for (RacingCar racingCar : this.racingCars) {
      racingCar.tryToMove(normalMoveStrategy);
    }
  }

  // 자동차들 객체 가져오기
  public List<RacingCar> statusOfRacingCars() {
    return this.racingCars;
  }

}
