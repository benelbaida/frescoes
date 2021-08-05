'use strict';
angular.module('demo')
    .factory('Hello', ['$resource', function($resource) {

    return {
        sample: $resource('/demo/hello/sampleJson', {}, {
            update: {
                method: 'PUT'
            },
            delete: {
                method: 'DELETE'
            },
            query: {method: 'GET', isArray: false}
        })
    };
}]);