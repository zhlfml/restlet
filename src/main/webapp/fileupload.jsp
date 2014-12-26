<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>File Upload</title>
    <link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css"/>
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
</head>

<body>

<div data-role="page" id="one">
    <div data-role="header">
        <h1>Take Photo</h1>
    </div>

    <div role="main" class="ui-content">
        <form>
            <input type="file" accept="image/*">
        </form>
    </div>

    <div data-role="footer" data-theme="a">
        <h4>Page Footer</h4>
    </div>
</div>

</body>
</html>
