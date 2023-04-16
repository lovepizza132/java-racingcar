package racingcar.domain;

import racingcar.strategy.MoveStrategy;

import java.util.List;

public class Racing {
  private final RacingCars cars;

  public Racing(RacingCars racingCars) {
    this.cars = racingCars;
  }

  public void startRacingRound(MoveStrategy normalMoveStrategy) {
    this.cars.runRacingRound(normalMoveStrategy);
  }

  public List<RacingCar> statusOfRacing() {
    return this.cars.statusOfRacingCars();
  }
}