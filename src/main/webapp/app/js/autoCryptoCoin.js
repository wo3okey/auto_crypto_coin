var app = angular.module('myApp', []);

app.controller('myCtrl', function ($scope, $http) {
    $http.get("/xrp/balance")
        .then(function (response) {
            $scope.content = response.data;
        }, function (response) {
            console.log(response);
            $scope.content = "Something went wrong";
        });

    $http.get("/xrp/profit")
        .then(function (response) {
            $scope.content2 = response.data;
        });
});