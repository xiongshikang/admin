var license = {
    baseUrl: "/admin/web/pluginLicense",
    erpUrl: "/admin/web/baseErpFactoryList",
    erpVersionUrl: "/admin/web/baseErpVersionList",
    companyUrl: "/admin/web/companyAll",
    shopUrl: "/admin/web/shopList",
    entity: "pluginLicense",
    tableId: "userTable",
    toolbarId: "toolbar",
    unique: "id",
    order: "asc",
    currentItem: {}
};
license.columns = function () {
    return [{
        checkbox: true
    }, {
        field: 'licenseCode',
        title: '插件注册码'
    }, {
        field: 'licenseStatus',
        title: '是否可用'
    }, {
        field: 'expireTime',
        title: '失效期'
    }, {
        field: 'usedCount',
        title: '使用次数'
    }, {
        field: 'shopName',
        title: '门店名称'
    }, {
        field: 'companyName',
        title: '企业名称'
    }, {
        field: 'erpFactoryName',
        title: 'ERP厂商名称'
    }, {
        field: 'erpVersionName',
        title: 'ERP版本名称'
    }, {
        field: 'createTime',
        title: '创建时间'
    }, {
        field: 'updateTime',
        title: '修改时间'
    }, {
        field: 'version',
        title: '版本号'
    }, {
        field: 'licenseUpload',
        title: '是否禁止上报数据',
        formatter: licenseUploadFormatter
    }];
};

function licenseUploadFormatter(value, row, index) {//赋予的参数
    if(value=='Y'){
    	return '<span style="color:green;">允许上报数据</span>';
    }else{
    	return '<span style="color:red;">禁止上报数据</span>';
    }
}

license.queryParams = function (params) {
	if (!params)
        return {
		licenseCode: $("#licenseCode").val()
        };
    var temp = { //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
        limit: params.limit, //页面大小
        offset: params.offset, //页码
        licenseCode: $("#licenseCode").val()
    };
    var data= {
    		data:temp
	}
    return data;
};



license.init = function () {

    license.table = $('#' + license.tableId).bootstrapTable({
        url: license.baseUrl, //请求后台的URL（*）
        method: 'post', //请求方式（*）
        toolbar: '#' + license.toolbarId, //工具按钮用哪个容器
        striped: true, //是否显示行间隔色
        cache: false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: true, //是否显示分页（*）
        sortable: false, //是否启用排序
        sortOrder: license.order, //排序方式
        queryParams: license.queryParams,//传递参数（*）
        sidePagination: "server", //分页方式：client客户端分页，server服务端分页（*）
        pageNumber: 1, //初始化加载第一页，默认第一页
        pageSize: 10, //每页的记录行数（*）
        pageList: [10, 25, 50, 100], //可供选择的每页的行数（*）
        search: false, //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
        strictSearch: false,
        showColumns: false, //是否显示所有的列
        showRefresh: true, //是否显示刷新按钮
        minimumCountColumns: 10, //最少允许的列数
        clickToSelect: true, //是否启用点击选中行
        uniqueId: license.unique, //每一行的唯一标识，一般为主键列
        showToggle: true, //是否显示详细视图和列表视图的切换按钮
        cardView: false, //是否显示详细视图
        detailView: false, //是否显示父子表
        columns: license.columns()
    });
};
license.select = function (layerTips) {
    var rows = license.table.bootstrapTable('getSelections');
    if (rows.length == 1) {
        license.currentItem = rows[0];
        return true;
    } else {
        layerTips.msg("请选中一行");
        return false;
    }
};

layui.use(['form', 'layedit', 'laydate'], function () {
    license.init();
    var editIndex;
    var layerTips = parent.layer === undefined ? layui.layer : parent.layer, //获取父窗口的layer对象
        layer = layui.layer, //获取当前窗口的layer对象
        form = layui.form(),
        layedit = layui.layedit,
        laydate = layui.laydate;
    var addBoxIndex = -1;
    //初始化页面上面的按钮事件
    $('#btn_query').on('click', function () {
        license.table.bootstrapTable('refresh', license.queryParams());
    });

    $('#btn_add').on('click', function () {
        if (addBoxIndex !== -1)
            return;
        //本表单通过ajax加载 --以模板的形式，当然你也可以直接写在页面上读取
        $.get(license.entity + '/edit', null, function (form) {
            addBoxIndex = layer.open({
                type: 1,
                title: '添加注册码',
                content: form,
                btn: ['保存', '取消'],
                shade: false,
                offset: ['0', '0'],
                area: ['100%', '100%'],
                maxmin: true,
                yes: function (index) {
                    layedit.sync(editIndex);
                    //触发表单的提交事件
                    $('form.layui-form').find('button[lay-filter=edit]').click();
                },
                full: function (elem) {
                    var win = window.top === window.self ? window : parent.window;
                    $(win).on('resize', function () {
                        var $this = $(this);
                        elem.width($this.width()).height($this.height()).css({
                            top: 0,
                            left: 0
                        });
                        elem.children('div.layui-layer-content').height($this.height() - 95);
                    });
                },
                success: function (layero, index) {
                    var form = layui.form();
                    editIndex = layedit.build('description_editor');
                    /**
                     * 初始化erp下拉选择
                     */
                    initErpInfo(form);
                    
                    /**
                     * 初始化company下拉选项
                     */
                    initCompanyInfo(form);
                    form.on('submit(edit)', function (data) {
                    	  var ls = [];
                    	  var dbNames = $('[name="dbName"]');
                    	  var dbUsernames = $('[name="dbUsername"]');
                    	  var dbPasswords = $('[name="dbPassword"]');
                    	  var dbPosts = $('[name="dbPost"]');
                    	  var dbTypes = $('[name="dbType"]');
                    	  $('[name="dbIp"]').each(function(index){
                    		  var model ={
                          			dbIp:'',
                          			dbName:'',
                          			dbUsername:'',
                          			dbPost:'',
                          			dbPassword:'',
                          			dbType:''
                          	};
                    		  model.dbIp = $(this).val();
                    		  model.dbName = $(dbNames[index]).val();
                    		  model.dbUsername = $(dbUsernames[index]).val();
                    		  model.dbPost = $(dbPosts[index]).val();
                    		  model.dbPassword = $(dbPasswords[index]).val();
                    		  model.dbType = $(dbTypes[index]).val();
                    		  ls.push(model);
                    	  });
                    	   var param = {
                    			   erpFactoryCode: $('[name="erpFactoryCode"]').val(),
                    			   erpVersionCode: $('[name="erpVersionCode"]').val(),
                    			   companyCode:$('[name="companyCode"]').val(),
                    			   shopCode:$('[name="shopCode"]').val(),
                    			   expireTime:$('[name="expireTime"]').val(),
                    			   databaseModel:ls
                    	   };
                    	  
                    	  doAjax(license.baseUrl+"/add", function(data) {
              				if (data.code==200) {	
              					layerTips.msg('保存成功');
                                layerTips.close(index);
                                location.reload();
              				}else{
              					 layerTips.msg(data.message);
              				} 
              			}, JSON.stringify({"data":param}), "post");
                        return false;  
                    });
                },
                end: function () {
                    addBoxIndex = -1;
                }
            });
        });
    });
    
    $('#btn_edit').on('click', function () {
        if (license.select(layerTips)) {
            var licenseCode = license.currentItem.licenseCode;
            doAjax(license.baseUrl + '/select', function(data) {
 				if (data.code==200) {	
 					var result = data.data;
 					$.get(license.entity+'/edit2', null, function (form) {
 	                    layer.open({
 	                        type: 1,
 	                        title: '编辑注册信息',
 	                        content: form,
 	                        btn: ['保存', '取消'],
 	                        shade: false,
                            offset: ['0', '0'],
                            area: ['100%', '100%'],
 	                        maxmin: true,
 	                        yes: function (index) {
 	                            //触发表单的提交事件
 	                            layedit.sync(editIndex);
 	                            $('form.layui-form').find('button[lay-filter=edit]').click();
 	                        },
 	                        full: function (elem) {
 	                            var win = window.top === window.self ? window : parent.window;
 	                            $(win).on('resize', function () {
 	                                var $this = $(this);
 	                                elem.width($this.width()).height($this.height()).css({
 	                                    top: 0,
 	                                    left: 0
 	                                });
 	                                elem.children('div.layui-layer-content').height($this.height() - 95);
 	                            });
 	                        },
 	                        success: function (layero, index) {
 	                            var form = layui.form();
 	                            setFromValues(layero, result);
 	                            form.render();
 	                            layero.find(":input[name='licenseCode']").attr("disabled", "disabled");
 	                            form.on('submit(edit)', function (data) {
 	                            	 doAjax(license.baseUrl+"/edit", function(data) {
 	                       				if (data.code==200) {	
 	                       					layerTips.msg('修改成功');
 	                                         layerTips.close(index);
 	                                         location.reload();
 	                       				}else{
 	                       					 layerTips.msg(data.message);
 	                       				} 
 	                       			}, {"data":JSON.stringify(data.field)}, "GET");
 	                               });
 	                                //这里可以写ajax方法提交表单
 	                                return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
 	                            }
 	                        });
 	                    });
 				  }	  
	 			}, {"data":licenseCode}, "GET");
         }
    });


    $('#btn_del').on('click', function () {
        if (license.select(layerTips)) {
            var licenseCode = license.currentItem.licenseCode;
            layer.confirm('确定删除数据吗？', null, function (index) {
            	doAjax(license.baseUrl+"/delete", function(data) {
       				if (data.code==200) {	
       				     layerTips.msg("册除成功！");
       				     location.reload();
       				}else{
       					 layerTips.msg(data.message);
       					 location.reload();
       				} 
       			}, {"data":licenseCode}, "GET");
                layer.close(index);
            });
        }
    });
});


function initErpInfo(form){
	 doAjax(license.erpUrl, function(data) {
			if (data.code==200) {	
				var erpList = data.data;
				 var html = "";
				 $.each(erpList,function(index,val){
					 html += "<option value='"+val.erpFactoryCode+"'>"+val.erpFactoryName+"</option>";
				 });
				 $('[name=erpFactoryCode]').append(html);
				 form.render(); 
			} 
		}, null, "GET");
     
     
     form.on('select(erpFactoryCode)', function(data){
           var erpFactoryCode = data.value;
			  doAjax(license.erpVersionUrl, function(data) {
 				if (data.code==200) {	
 					var erpVersionList = data.data;
 					 var html = "";
 					 $.each(erpVersionList,function(index,val){
 						 html += "<option value='"+val.erpVersionCode+"'>"+val.erpVersionName+"</option>";
 					 });
 					$('[name=erpVersionCode]').empty();
 					 $('[name=erpVersionCode]').append(html);
 					 form.render(); 
 				} 
 			}, {"data":erpFactoryCode}, "GET");
		});
     
}

function initCompanyInfo(form){
	 doAjax(license.companyUrl, function(data) {
			if (data.code==200) {	
				var companyList = data.data;
				 var html = "";
				 $.each(companyList,function(index,val){
					 html += "<option value='"+val.companyCode+"'>"+val.companyName+"</option>";
				 });
				 $('[name=companyCode]').append(html);
				 form.render(); 
			} 
		}, null, "GET");
    
    
    form.on('select(companyCode)', function(data){
          var companyCode = data.value;
			  doAjax(license.shopUrl, function(data) {
				if (data.code==200) {	
					var shopList = data.data;
					 var html = "";
					 $.each(shopList,function(index,val){
						 html += "<option value='"+val.shopCode+"'>"+val.shopName+"</option>";
					 });
					 $('[name=shopCode]').empty();
					 $('[name=shopCode]').append(html);
					 form.render(); 
				} 
			}, {"data":companyCode}, "GET");
		});
 
}

function mm(a){
	   return /(\x0f[^\x0f]+)\x0f[\s\S]*\1/.test("\x0f"+a.join("\x0f\x0f") +"\x0f");
	}