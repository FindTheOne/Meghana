 var myApp = angular.module("userModule", []);
    myApp.controller("userController", function($scope, $http, $window) {
    	$scope.username = "meghana";
    	var method = "GET";
    	var url = "http://server-env.us-west-1.elasticbeanstalk.com/rest/hello/user/meghana";
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