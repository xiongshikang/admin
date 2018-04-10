var pluginRunningLog = {
    baseUrl: "/admin/web/pluginRunningLog",
    entity: "pluginRunningLog",
    tableId: "userTable",
    toolbarId: "toolbar",
    unique: "id",
    order: "asc",
    currentItem: {}
};
pluginRunningLog.columns = function () {
    return [{
        checkbox: true
    }, {
        field: 'id',
        title: '自增id'
    }, {
        field: 'errorTime',
        title: '错误时间'
    }, {
        field: 'errorDetail',
        title: '日志详情'
    }, {
        field: 'resolveStatus',
        title: '解决状态'
    }, {
        field: 'resolveRemark',
        title: '解决备注'
    }, {
        field: 'shopName',
        title: '门店名称'
    }, {
        field: 'companyName',
        title: '企业名称'
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
        field: 'dataStatus',
        title: '逻辑状态'
    }, {
        field: 'diskStatus',
        title: '物理状态'
    }];
};
pluginRunningLog.queryParams = function (params) {
	if (!params)
        return {
		shopCode: $("#shopCode").val()
        };
    var temp = { //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
        limit: params.limit, //页面大小
        offset: params.offset, //页码
        shopCode: $("#shopCode").val()
    };
    var data= {
    		data:temp
	}
    return data;
};

pluginRunningLog.init = function () {

    pluginRunningLog.table = $('#' + pluginRunningLog.tableId).bootstrapTable({
        url: pluginRunningLog.baseUrl, //请求后台的URL（*）
        method: 'post', //请求方式（*）
        toolbar: '#' + pluginRunningLog.toolbarId, //工具按钮用哪个容器
        striped: true, //是否显示行间隔色
        cache: false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: true, //是否显示分页（*）
        sortable: false, //是否启用排序
        sortOrder: pluginRunningLog.order, //排序方式
        queryParams: pluginRunningLog.queryParams,//传递参数（*）
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
        uniqueId: pluginRunningLog.unique, //每一行的唯一标识，一般为主键列
        showToggle: true, //是否显示详细视图和列表视图的切换按钮
        cardView: false, //是否显示详细视图
        detailView: false, //是否显示父子表
        columns: pluginRunningLog.columns()
    });
};
pluginRunningLog.select = function (layerTips) {
    var rows = pluginRunningLog.table.bootstrapTable('getSelections');
    if (rows.length == 1) {
        pluginRunningLog.currentItem = rows[0];
        return true;
    } else {
        layerTips.msg("请选中一行");
        return false;
    }
};

layui.use(['form', 'layedit', 'laydate'], function () {
    pluginRunningLog.init();
    var editIndex;
    var layerTips = parent.layer === undefined ? layui.layer : parent.layer, //获取父窗口的layer对象
        layer = layui.layer, //获取当前窗口的layer对象
        form = layui.form(),
        layedit = layui.layedit,
        laydate = layui.laydate;
    var addBoxIndex = -1;
    //初始化页面上面的按钮事件
    $('#btn_query').on('click', function () {
        pluginRunningLog.table.bootstrapTable('refresh', pluginRunningLog.queryParams());
    });

    $('#btn_edit').on('click', function () {
        if (pluginRunningLog.select(layerTips)) {
            var id = pluginRunningLog.currentItem.id;
            doAjax(pluginRunningLog.baseUrl + '/select', function(data) {
 				if (data.code==200) {	
 					var result = data.data;
 					$.get(pluginRunningLog.entity+'/edit', null, function (form) {
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
 	                            layero.find(":input[name='shopCode']").attr("disabled", "disabled");
 	                            layero.find(":input[name='companyCode']").attr("disabled", "disabled");
 	                            layero.find('#description_editor').val(result.resolveRemark);
 	                            editIndex = layedit.build('description_editor');
 	                            form.render();
 	                            form.on('submit(edit)', function (data) {
 	                            	 doAjax(pluginRunningLog.baseUrl+"/edit", function(data) {
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
	 			}, {"data":id}, "GET");
         }
    });

});

