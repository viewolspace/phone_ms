var requireModules =[
	'base-url'
];

window.top.registeModule(window,requireModules);
layui.define('base-url', function(exports) {
	var $ = layui.jquery;
	var baseApi = layui['base-url'];

	var url = {
		namespace: '../regUser/',
		"userList": {
			type: 'POST',
			url: "userList.do"
		}
	};

	var result = $.extend({}, baseApi, url);

	exports('reg-user-api', result);
});