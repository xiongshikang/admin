var licenseavalon;
require([ "ready!" ], function() {
	licenseavalon = avalon.define({
		$id : "licenseavalon",
		dbInfo: ['aa'],
		addFn:function(){
			
			layui.use(['form'], function () {
				 form = layui.form();//获取当前窗口的layer对象
				 licenseavalon.dbInfo.push('bb');
				 form.render();
			});
		},
		removeFn:function(index){
			 licenseavalon.dbInfo.removeAt(index);
		}
	});
	avalon.scan(); // 扫描
});
 


