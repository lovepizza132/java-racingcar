package racingcar.view;

import racingcar.domain.RacingCar;

import java.util.List;

public class ResultView {

  public ResultView() {

  }

  public void printRacingStart() {
    System.out.println("\n실행 결과");
  }

  public void printRacingRound(List<RacingCar> racingCars) {

    for (RacingCar racingCar : racingCars) {
      String carMoveDistance = "-".repeat(racingCar.position());   // 자동차별 position 값 만큼 이동거리 표기

      System.out.println(carMoveDistance);
    }

    System.out.println();
  }
}