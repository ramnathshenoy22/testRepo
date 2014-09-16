<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <title> Usage Analytics </title>
   <html lang="en" ng-app="Eggly" ng-controller="myctrl">
      <head>
         <meta charset="utf-8">
         <meta http-equiv="X-UA-Compatible" content="IE=edge">
         <meta name="viewport" content="width=device-width, initial-scale=1">
         <title>Bootstrap 101 Template</title>
         <!-- Bootstrap -->
         <link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" />
         <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
         <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
         <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
         <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
         <!--[if lt IE 9]>
         <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
         <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
         <![endif]-->
      </head>
      <body >
         <br><br>
         <div class="jumbotron"  >
            <h1 >
               Usage Analytics
            </h1>
            <p >Get Usage Data, Usage information, Predict Usage and Lots More...</p>
         </div>
         <ul class="nav nav-tabs" role="tablist">
            <li class="active"><a href="#home" role="tab" data-toggle="tab">Home</a></li>
            <li><a href="#profile" role="tab" data-toggle="tab">Quantity/Usage Vs Time Bar Graph</a></li>
            <li><a href="#messages" role="tab" data-toggle="tab">Threshhold Alert</a></li>
            <li><a href="#settings" role="tab" data-toggle="tab">Other Trends</a></li>
         </ul>
         <!-- Tab panes -->
         <div class="tab-content">
            <div class="tab-pane active" id="home"> Welcome to the Home Page!</div>
            <div class="tab-pane" id="profile">
               <div class="panel panel-primary">
                  <div class="panel-heading">
                     <h3 style="color: #FFFFFF; font-size: 13pt" class="panel-title">Product Usage Pie Chart</h3>
                  </div>
               </div>
               <form target="" action="" method="POST" >
                  <label> Contract Id: <input type="text" name="contractid2" id="contractid2"/></label>
                  <label> Select Month<input type="text" name="sdate2" id="sdate2" placeholder="Valid Values 1-12"/></label>
                  <input type="submit" value="SUBMIT" />
                  <br>
                  <!--<iframe src="http://www.w3schools.com"/> -->
               </form>
            </div>
            <div class="tab-pane" id="messages">
               <div class="panel panel-primary">
                  <div class="panel-heading">
                     <h3 style="color: #FFFFFF; font-size: 13pt" class="panel-title">Quantity/Usage Vs Time Bar Graph</h3>
                  </div>
               </div>
               <form target="" action="" method="POST" >
                  <label> Product Name: <input type="text" name="contractid3" id="contractid3"/></label>
                  <label> Start Date :<input type="text" name="sdate"3 id="sdate3" placeholder="dd/mm/yy"/></label>
                  <input type="submit" value="SUBMIT" />
                  <br> 
                  <!--<iframe src="http://www.w3schools.com" align="top"/> --> 
               </form>
            </div>
            <div class="tab-pane" id="settings">
               <div class="panel panel-primary">
                  <div class="panel-heading">
                     <h3 style="color: #FFFFFF; font-size: 13pt" class="panel-title"></h3>
                  </div>
               </div>
               <form target="_blank" action=" " method="POST" >
                  <label> Product Name: <input type="text" name="contractid4" id="contractid4"/></label>
                  <label> Start Date :<input type="text" name="sdate4" id="sdate4" placeholder="dd/mm/yy"/></label>
                  <label> End Date :<input type="text" name="edate4" id="edate4" placeholder="dd/mm/yy"/></label>
                  <input type="submit" value="SUBMIT" />
                  <br> 
                  <!--<iframe src="http://www.w3schools.com" align="top"/>  -->
               </form>
            </div>
         </div>
         <iframe src=" " align="bottom"/>
         <script></script>
         <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.15/angular.min.js"></script>
      </body>
   </html>