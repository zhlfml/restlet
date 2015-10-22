<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap Template</title>

    <link href="http://cdn.bootcss.com/bootstrap/3.3.2/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
<form class="form-horizontal" action="<%= request.getContextPath()%>/rest/upload" enctype="multipart/form-data" method="post">
    <div class="form-group">
        <label for="username" class="col-sm-2 control-label">Username</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" id="username" name="username" placeholder="Enter Username" required>
        </div>
    </div>
    <div class="form-group">
        <label for="photo" class="col-sm-2 control-label">Photo</label>
        <div class="col-sm-8">
            <input id="photo" class="form-control" type="file" name="photo" accept="image/*" capture="camera">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-2">
            <button type="submit" class="btn btn-primary">Submit</button>
        </div>
    </div>
</form>
<div class="row">
    <div class="col-sm-offset-2 col-sm-2">
        <a class="btn" href="<%= request.getContextPath()%>/rest/download?jpg">Download JPG</a>
        <a class="btn" href="<%= request.getContextPath()%>/rest/download?pdf">Download PDF</a>
    </div>
</div>
<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</body>
</html>
