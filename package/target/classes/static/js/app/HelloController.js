'use strict';
angular.module('demo')
    .controller('HelloController', ['$scope', 'HelloService','Hello',
    function($scope,HelloService,Hello) {
        $scope.hello = {
            message:'_',
            sampleJson:{}
        };
        $scope.testHello = function() {

            HelloService.getHello().then(function (success) {
                console.debug("success"+success.data);
                $scope.hello.message=success.data;
            },function (failed) {
                console.error("failed"+failed.data);
                $scope.hello.message="error "+failed.data;
            })
        };

        $scope.getSample = function(){
            Hello.sample.query(function(response){
                $scope.hello.sampleJson=response;
            },function(failed){
                $scope.hello.sampleJson=failed;
            })
        }
    }
]);