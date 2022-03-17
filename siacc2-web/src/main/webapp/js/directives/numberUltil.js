var app = angular.module('starter.directives', []);
 
app.directive('percentageField', [ '$filter', function( $filter ) {
    return {
        restrict: 'A',
        require: 'ngModel',
        scope: {
            // currencyIncludeDecimals: '&',
            
        },
        link: function(scope, element, attr, ngModel) {
            

            attr[ 'percentageMimValue' ] = attr[ 'percentageMimValue' ] || 0;
            attr[ 'percentageMaxValue' ] = attr[ 'percentageMaxValue' ] || 100;
            attr[ 'percentageMaxDecimals' ] = attr[ 'percentageMaxDecimals' ] || 2;
            
            $( element ).css( {'text-align': 'right'} );
            
            // function called when parsing the inputted url
            // this validation may not be rfc compliant, but is more
            // designed to catch common url input issues.
            function into(input) {
                
                var valid;
                
                if( input == '' ) 
                {
                    ngModel.$setValidity( 'valid', true );
                    return '';
                }
                
                // if the user enters something that's not even remotely a number, reject it
                if( ! input.match( /^\d+(\.\d+){0,1}%{0,1}$/gi ) )
                {                    
                    ngModel.$setValidity( 'valid', false );
                    return '';
                }
                
                // strip everything but numbers from the input
                input = input.replace( /[^0-9\.]/gi, '' );
                
                input = parseFloat( input );
                
                var power = Math.pow( 10, attr[ 'percentageMaxDecimals' ] );
                
                input = Math.round( input * power ) / power;
                
                if( input > attr[ 'percentageMaxValue' ] ) input = attr[ 'percentageMaxValue' ];

                if( input < attr[ 'percentageMimValue' ] ) input = attr[ 'percentageMimValue' ];
                
                // valid!
                ngModel.$setValidity( 'valid', true );
                
                return input;
            }
            
            ngModel.$parsers.push(into);
            
            function out( input )
            {
                if( ngModel.$valid && input !== undefined && input > '' )
                {
                    return input ;
                }
                
                return '';
            }
            
            ngModel.$formatters.push( out );
            
            $( element ).bind( 'click', function(){
                //$( element ).val( ngModel.$modelValue );
                $( element ).select();
            });
            
            $( element ).bind( 'blur', function(){
                $( element ).val( out( ngModel.$modelValue ) );
            });
        }
    };
}]);

app.directive("limitTo", ['$timeout', function($timeout) {
    
    // Declaration of custom directive
    return {
        restrict: "A",
        link: function(scope, elem, attrs) {
            var limit = parseInt(attrs.limitTo);
            elem.on("keypress", function(e) {
                $timeout(function() {
                    if (parseInt(e.target.value) > limit) {
                          
                        // Handle change here if greater
                        //scope.text = "Outside limit (greater)";
                        scope.val = 100;
                        scope.$apply();
                        e.preventDefault();
                    } else if (parseInt(e.target.value) < 0) {
                       // scope.text = "Outside limit (smaller)";
                        scope.val = 0
                        scope.$apply();
                        e.preventDefault();
                    } else {
                       // scope.text = "Inside Limit";
                        scope.$apply();
                        e.preventDefault();
                    }
                });
            });
        }
    }
}]);
