<!DOCTYPE html>
<html lang="en">
<head>
    <title>用户界面</title>
</head>
<body>
<table border="1" align="center" width="50%">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Age</th>
    </tr>
    <#list list as user>
         <tr>
             <th>${user.userid}</th>
             <th>${user.username}</th>
             <th>${user.userage}</th>
         </tr>
    </#list>

</table>
</body>
</html>