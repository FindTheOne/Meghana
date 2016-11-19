 var myApp = angular.module("myModule", []);
    myApp.controller("myController", function($scope, $http, $window) {
    	$scope.username = "";
    	$scope.password = "";
    	$scope.message;
    	$scope.user1 = "pavan";
    	$scope.user2 = "saumeel"
    	var method = "GET";
    	var url = "http://server-env.us-west-1.elasticbeanstalk.com/rest/hello/getInbox/pavan/saumeel";
		$http({  
            method : method,  
            url : url
        }).then(function success(response){
        	console.log(response.data);
        	$scope.message = response.data;
            	
        }, function error(response){
        	console.log('error');	
        }); 
		
    });