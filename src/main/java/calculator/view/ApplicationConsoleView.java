package calculator.view;

import calculator.common.ConsoleMessage;
import calculator.view.input.InputView;
import calculator.view.output.OutputView;

public class ApplicationConsoleView implements ApplicationView{

    private final InputView inputView;
    private final OutputView outputView;

    public ApplicationConsoleView(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    @Override
    public String requestValue() {
        outputView.requestInputValue();
        return inputView.inputValue();
    }

    @Override
    public void printResult(int result) {
        outputView.printMessage(ConsoleMessage.RESULT_PREFIX + result);
    }

    @Override
    public void printError(String message) {
        outputView.printMessage(ConsoleMessage.ERROR_PREFIX + message);
    }
}
