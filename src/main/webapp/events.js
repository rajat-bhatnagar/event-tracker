function Events($scope, $http){
	$http.get('http://localhost:8080/event-tracker/events.json').
	success(function(data){
		$scope.events = data;
	});
}