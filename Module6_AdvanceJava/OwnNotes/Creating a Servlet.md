1. Creating a Servlet Project
2. Open Eclipse IDE.

Create a new Dynamic Web Project:

Go to File > New > Dynamic Web Project.
Provide a name for your project (e.g., AddServletExample).
Select a target runtime (like Apache Tomcat).
Click Finish.
3. Create an HTML File (e.g., index.html):

Right-click on the WebContent folder > New > HTML File.

Use the following content for index.html:
```html
<!DOCTYPE html>
<html>
<head>
    <title>Add Numbers</title>
</head>
<body>
    <h1>Add Two Numbers</h1>
    <form action="add" method="get">
        <label for="num1">Enter first number:</label>
        <input type="number" id="num1" name="num1" required>
        <br>
        <label for="num2">Enter second number:</label>
        <input type="number" id="num2" name="num2" required>
        <br><br>
        <button type="submit">Add</button>
    </form>
</body>
</html>


```