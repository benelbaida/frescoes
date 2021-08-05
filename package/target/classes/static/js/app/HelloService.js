'use strict';
angular.module('demo')
    .factory('HelloService', ['$http', function($http) {

        var service = {};
        service.getHello = function() {
            var url = '/demo/hello';
            return $http({
                url: url,
                method: 'GET',
                transformResponse: [function (data) {
                    // Do whatever you want!
                    return data;
                }]
            });
        };

    return service;
}]);