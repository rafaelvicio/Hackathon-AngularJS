var App = angular.module('controllers', []);

App.controller('AgenteCtrl', function($scope, AgenteService, $route){
	$scope.agentes = [];
	$scope.notFound = false;
	AgenteService.list().then(function(data){
		$scope.agentes = data.data;
		if(data.data.length == 0){
			$scope.notFound = true;
		}
	},function(data){
		console.log("data", data);
	});

});	