AUI().use(
    'aui-base',
    function (A){
        Liferay.namespace('your-portlet-name');

        Liferay.yourportletname = {

            init: function(config){
                var instance = this;
                instance._namespace = config.namespace;
            },

            get: function(){
                var instance = this;
                var option = A.one('#' + instance._namespace + 'options');
                alert(option.attr('value'));
            },

        };
    }
);