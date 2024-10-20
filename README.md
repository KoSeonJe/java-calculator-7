# **기능 요구 사항**

입력한 문자열에서 숫자를 추출하여 더하는 계산기를 구현한다.

- 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환한다.
    - 예: "" => 0, "1,2" => 3, "1,2,3" => 6, "1,2:3" => 6
- 앞의 기본 구분자(쉼표, 콜론) 외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 "//"와 "\n" 사이에 위치하는 문자를 커스텀 구분자로 사용한다.
    - 예를 들어 "//;\n1;2;3"과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
- 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`을 발생시킨 후 애플리케이션은 종료되어야 한다.

## **입출력 요구 사항**

### **입력**

- 구분자와 양수로 구성된 문자열

### **출력**

- 덧셈 결과

```
결과 : 6
```

### **실행 결과 예시**

```
덧셈할 문자열을 입력해 주세요.
1,2:3
결과 : 6
```


# 구현할 기능 목록
## 기능
- [x]  사용자에게 입력 받는다
- [x]  커스텀 구분자를 확인하고 추가 등록한다.
- [x]  사용자가 입력한 값 중 구분자를 사용하여 숫자를 분리한다.
- [x]  입력한 값이 빈 값이라면 0을 반환한다.
- [x]  구분자를 사용하지 않고 숫자만 입력하였다면 입력한 숫자 그대로 반환한다.
- [x]  구분자를 통해 분리된 숫자를 모두 더한다.
- [x]  결과를 출력한다.

## 예외
- [x] 사용자가 잘못된 값을 입력하는 경우 IllegalArgumentException 발생시킨 후 애플리케이션은 종료
    - [x] 입력값 중 음수를 입력한 경우
    - [x]  구분자 사이 값이 숫자가 아닌 경우
        - [x]  커스텀 구분자, 디폴트 구분자 외에 문자가 있는 경우

# 패키지 구조

```mathematica
java
└── calculator
    ├── Application.java
    ├── common
    │   ├── CalculatorAppConfig.java
    │   ├── CalculatorConstant.java
    │   ├── ConsoleMessage.java
    │   └── DelimiterConstant.java
    ├── controller
    │   ├── CalculatorApplication.java
    │   └── StringCalculatorApplication.java
    ├── model
    │   ├── domain
    │   │   ├── CustomNumber.java
    │   │   └── DefaultDelimiter.java
    │   ├── implement
    │   │   ├── DelimiterChecker.java
    │   │   ├── DelimiterExtractor.java
    │   │   ├── DelimiterManager.java
    │   │   ├── DelimiterStore.java
    │   │   └── StringParser.java
    │   ├── service
    │   │   ├── Calculator.java
    │   │   └── StringSumCalculator.java
    ├── view
    │   ├── ApplicationConsoleView.java
    │   ├── ApplicationView.java
    │   └── handler
    │       ├── ConsoleInputHandler.java
    │       ├── ConsoleOutputHandler.java
    │       ├── InputHandler.java
    │       └── OutputHandler.java
```
