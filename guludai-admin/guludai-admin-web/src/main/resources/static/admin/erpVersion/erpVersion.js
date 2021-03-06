var erpVersion = {
    baseUrl: "/admin/web/erpVersion",
    erpUrl: "/admin/web/baseErpFactoryList",
    entity: "erpVersion",
    tableId: "userTable",
    toolbarId: "toolbar",
    unique: "id",
    order: "asc",
    currentItem: {}
};
erpVersion.columns = function () {
    return [{
        checkbox: true
    }, {
        field: 'erpFactoryCode',
        title: 'erp厂商编号'
    }, {
        field: 'erpVersionCode',
        title: 'erp版本编号'
    }, {
        field: 'erpVersionName',
        title: 'ERP版本号名称'
    }, {
        field: 'erpVersion',
        title: 'ERP版本号'
    }, {
        field: 'erpDatabase',
        title: 'ERP数据存放库名'
    }, {
        field: 'createTime',
        title: '创建时间'
    }, {
        field: 'updateTime',
        title: '修改时间'
    }, {
        field: 'version',
        title: '版本号'
    }];
};
erpVersion.queryParams = function (params) {
	if (!params)
        return {
		erpVersionName: $("#erpVersionName").val()
        };
    var temp = { //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
        limit: params.limit, //页面大小
        offset: params.offset, //页码
        erpVersionName: $("#erpVersionName").val()
    };
    var data= {
    		data:temp
	}
    return data;
};

erpVersion.init = function () {
    erpVersion.table = $('#' + erpVersion.tableId).bootstrapTable({
        url: erpVersion.baseUrl, //请求后台的URL（*）
        method: 'post', //请求方式（*）
        toolbar: '#' + erpVersion.toolbarId, //工具按钮用哪个容器
        striped: true, //是否显示行间隔色
        cache: false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: true, //是否显示分页（*）
        sortable: false, //是否启用排序
        sortOrder: erpVersion.order, //排序方式
        queryParams: erpVersion.queryParams,//传递参数（*）
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
        uniqueId: erpVersion.unique, //每一行的唯一标识，一般为主键列
        showToggle: true, //是否显示详细视图和列表视图的切换按钮
        cardView: false, //是否显示详细视图
        detailView: false, //是否显示父子表
        columns: erpVersion.columns()
    });
};
erpVersion.select = function (layerTips) {
    var rows = erpVersion.table.bootstrapTable('getSelections');
    if (rows.length == 1) {
        erpVersion.currentItem = rows[0];
        return true;
    } else {
        layerTips.msg("请选中一行");
        return false;
    }
};

layui.use(['form', 'layedit', 'laydate'], function () {
    erpVersion.init();
    var layerTips = parent.layer === undefined ? layui.layer : parent.layer, //获取父窗口的layer对象
        layer = layui.layer, //获取当前窗口的layer对象
        form = layui.form(),
        layedit = layui.layedit,
        laydate = layui.laydate;
    var addBoxIndex = -1;
    //初始化页面上面的按钮事件
    $('#btn_query').on('click', function () {
        erpVersion.table.bootstrapTable('refresh', erpVersion.queryParams());
    });

    $('#btn_add').on('click', function () {
        if (addBoxIndex !== -1)
            return;
        //本表单通过ajax加载 --以模板的形式，当然你也可以直接写在页面上读取
        $.get(erpVersion.entity + '/edit', null, function (form) {
            addBoxIndex = layer.open({
                type: 1,
                title: '添加厂商版本',
                content: form,
                btn: ['保存', '取消'],
                shade: false,
                offset: ['0', '0'],
                area: ['100%', '100%'],
                maxmin: true,
                yes: function (index) {
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
                    /**
                     * 初始化erp厂商信息
                     */
                    initErpInfo(form,layero);
                    form.on('submit(edit)', function (data) {
                    	  doAjax(erpVersion.baseUrl+"/add", function(data) {
              				if (data.code==200) {	
              					layerTips.msg('保存成功');
                                layerTips.close(index);
                                location.reload();
              				}else{
              					 layerTips.msg(data.message);
              				} 
              			}, JSON.stringify({"data":data.field}), "POST");
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
        if (erpVersion.select(layerTips)) {
            var erpVersionCode = erpVersion.currentItem.erpVersionCode;
            doAjax(erpVersion.baseUrl + '/select', function(data) {
 				if (data.code==200) {	
 					var result = data.data;
 					$.get(erpVersion.entity+'/edit', null, function (form) {
 	                    layer.open({
 	                        type: 1,
 	                        title: '编辑厂商版本信息',
 	                        content: form,
 	                        btn: ['保存', '取消'],
 	                        shade: false,
                            offset: ['0', '0'],
                            area: ['100%', '100%'],
 	                        maxmin: true,
 	                        yes: function (index) {
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
 	                            setFromValues(layero, result);
 	                           /**
 	                            * 初始化erp厂商信息
 	                            */
 	                            initErpInfo(form,layero,result.erpFactoryCode);
 	                            form.on('submit(edit)', function (data) {
 	                            	 doAjax(erpVersion.baseUrl+"/edit", function(data) {
 	                       				if (data.code==200) {	
 	                       					layerTips.msg('修改成功');
 	                                         layerTips.close(index);
 	                                         location.reload();
 	                       				}else{
 	                       					 layerTips.msg(data.message);
 	                       				} 
 	                       			}, JSON.stringify({"data":data.field}), "POST");
 	                               });
 	                                //这里可以写ajax方法提交表单
 	                                return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
 	                            }
 	                        });
 	                    });
 				  }	  
	 			}, JSON.stringify({"data":erpVersionCode}), "POST");
         }
    });


    $('#btn_del').on('click', function () {
        if (erpVersion.select(layerTips)) {
        	var erpVersionCode = erpVersion.currentItem.erpVersionCode;
            layer.confirm('确定删除数据吗？', null, function (index) {
            	doAjax(erpVersion.baseUrl+"/delete", function(data) {
       				if (data.code==200) {	
       				     layerTips.msg("册除成功！");
       				     location.reload();
       				}else{
       					 layerTips.msg(data.message);
       					 location.reload();
       				} 
       			}, JSON.stringify({"data":erpVersionCode}), "POST");
                layer.close(index);
            });
        }
    });
});

function initErpInfo(form,layero,erpFactoryCode){
	 doAjax(erpVersion.erpUrl, function(data) {
			if (data.code==200) {	
				var erpList = data.data;
				 var html = "";
				 $.each(erpList,function(index,val){
					 html += "<option value='"+val.erpFactoryCode+"'>"+val.erpFactoryName+"</option>";
				 });
				 $('[name=erpFactoryCode]').append(html);
				 if(erpFactoryCode){
					 layero.find(":input[name='erpFactoryCode']").val(erpFactoryCode);
				 }
				 form.render(); 
			} 
		}, null, "GET");
}
