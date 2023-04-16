package racingcar;

import racingcar.domain.Racing;
import racingcar.domain.RacingCars;
import racingcar.strategy.MoveStrategy;
import racingcar.strategy.NormalMoveStrategy;
import racingcar.view.InputView;
import racingcar.view.ResultView;

public class RacingCarApplication {
  public static void main(String[] args) {
    InputView inputView = new InputView();

    int numberOfCars = inputView.askCarCount();
    int numberOfTrials = inputView.askTrialCount();

    RacingCars racingCars = new RacingCars(numberOfCars);

    Racing racing = new Racing(racingCars);
    ResultView resultView = new ResultView();

    MoveStrategy normalMoveStrategy = new NormalMoveStrategy();

    resultView.printRacingStart();
    for (int i = 0; i < numberOfTrials; i++) {
      racing.startRacingRound(normalMoveStrategy);
      resultView.printRacingRound(racing.statusOfRacing());
    }
  }
}