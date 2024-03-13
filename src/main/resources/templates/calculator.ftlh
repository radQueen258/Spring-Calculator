<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form th:action="@{/calculator/add}" method="post">
    <label>Number 1:</label>
    <input type="number" step="any" name="number1" required="required"/>
    <br/>
    <label>Number 2:</label>
    <input type="number" step="any" name="number2" required="required"/>
    <br/>
    <button type="submit">Add</button>
</form>
<form th:action="@{/calculator/subtract}" method="post">
    <label>Number 1:</label>
    <input type="number" step="any" name="number1" required="required"/>
    <br/>
    <label>Number 2:</label>
    <input type="number" step="any" name="number2" required="required"/>
    <br/>
    <button type="submit">Subtract</button>
</form>
<form th:action="@{/calculator/multiply}" method="post">
    <label>Number 1:</label>
    <input type="number" step="any" name="number1" required="required"/>
    <br/>
    <label>Number 2:</label>
    <input type="number" step="any" name="number2" required="required"/>
    <br/>
    <button type="submit">Multiply</button>
</form>
<form th:action="@{/calculator/divide}" method="post">
    <label>Number 1:</label>
    <input type="number" step="any" name="number1" required="required"/>
    <br/>
    <label>Number 2:</label>
    <input type="number" step="any" name="number2" required="required"/>
    <br/>
    <button type="submit">Divide</button>
</form>
<form th:action="@{/calculator/power}" method="post">
    <label>Base:</label>
    <input type="number" step="any" name="base" required="required"/>
    <br/>
    <label>Exponent:</label>
    <input type="number" step="any" name="exponent" required="required"/>
    <br/>
    <button type="submit">Power</button>
</form>
<form th:action="@{/calculator/square-root}" method="post">
    <label>Number:</label>
    <input type="number" step="any" name="number" required="required"/>
    <br/>
    <button type="submit">Square Root</button>
</form>
</body>
</html>