var app = angular.module("FrescoesManagement", []);
 
// Controller Part
app.controller("FrescoesController", function($scope, $http) {
 
    // Now load the data from server
    _refreshFrescoesData();

 
 
    // HTTP DELETE- delete frescoe by Id
    // Call: http://localhost:8080/demo/frescoe/{id}
    $scope.deleteFrescoe = function(frescoe) {
        $http({
            method: 'DELETE',
            url: '/demo/frescoes' + frescoe.id
        }).then(_success, _error);
    };
 
 
    // Private Method  
    // HTTP GET- get all frescoes collection
    // Call: http://localhost:8080/demo/frescoes
    function _refreshFrescoesData() {
        $http({
            method: 'GET',
            url: '/demo/frescoes'
        }).then(
            function(res) { // success
                $scope.frescoes = res.data;
            },
            function(res) { // error
                console.log("Error: " + res.status + " : " + res.data);
            }
        );
    }
 
    function _success(res) {
        _refreshFrescoesData();
        _clearFormData();
    }
 
    function _error(res) {
        var data = res.data;
        var status = res.status;
        var header = res.header;
        var config = res.config;
        alert("Error: " + status + ":" + data);
    }

});