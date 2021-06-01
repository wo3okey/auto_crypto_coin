var app = angular.module('myApp', []);

app.controller('myCtrl', function ($scope, $http) {
    $http.get("/balance2/xrp")
        .then(function (response) {
            $scope.content = response.data;
        }, function (response) {
            $scope.content = "Something went wrong";
        });
});