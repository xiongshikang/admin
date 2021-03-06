var runningState = {
    baseUrl: "/admin/web/pluginRunningState",
    entity: "pluginRunningState",
    tableId: "userTable",
    toolbarId: "toolbar",
    unique: "id",
    order: "asc",
    currentItem: {}
};
runningState.columns = function () {
    return [{
        checkbox: true
    }, {
        field: 'stateCode',
        title: '编号',
        visible: false
    }, {
        field: 'shopCode',
        title: '门店编号'
    }, {
        field: 'shopName',
        title: '门店名称'
    }, {
        field: 'reportTime',
        title: '上报时间'
    }, {
        field: 'reportIp',
        title: '上报IP地址'
    }, {
        field: 'reportImac',
        title: '上报机器mac'
    }, {
        field: 'reportIdisk',
        title: '上报硬盘信息'
    }, {
        field: 'reportIcpu',
        title: '上报cpu型号'
    }, {
        field: 'dbType',
        title: '数据库类型'
    }, {
        field: 'dbIp',
        title: '数据库ip'
    }, {
        field: 'dbPost',
        title: '数据库端口号'
    }, {
        field: 'dbName',
        title: '数据库名'
    }, {
        field: 'dbUsername',
        title: '数据库用户名'
    }, {
        field: 'dbPassword',
        title: '数据库密码（加密存储）'
    }, {
        field: 'createTime',
        title: '创建时间'
    }, {
        field: 'updateTime',
        title: '修改时间'
    }];
};
runningState.queryParams = function (params) {
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

runningState.init = function () {

    runningState.table = $('#' + runningState.tableId).bootstrapTable({
        url: runningState.baseUrl, //请求后台的URL（*）
        method: 'post', //请求方式（*）
        toolbar: '#' + runningState.toolbarId, //工具按钮用哪个容器
        striped: true, //是否显示行间隔色
        cache: false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: true, //是否显示分页（*）
        sortable: false, //是否启用排序
        sortOrder: runningState.order, //排序方式
        queryParams: runningState.queryParams,//传递参数（*）
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
        uniqueId: runningState.unique, //每一行的唯一标识，一般为主键列
        showToggle: true, //是否显示详细视图和列表视图的切换按钮
        cardView: false, //是否显示详细视图
        detailView: false, //是否显示父子表
        columns: runningState.columns()
    });
};
runningState.select = function (layerTips) {
    var rows = runningState.table.bootstrapTable('getSelections');
    if (rows.length == 1) {
        runningState.currentItem = rows[0];
        return true;
    } else {
        layerTips.msg("请选中一行");
        return false;
    }
};

layui.use(['form', 'layedit', 'laydate'], function () {
    runningState.init();
    var editIndex;
    var layerTips = parent.layer === undefined ? layui.layer : parent.layer, //获取父窗口的layer对象
        layer = layui.layer, //获取当前窗口的layer对象
        form = layui.form(),
        layedit = layui.layedit,
        laydate = layui.laydate;
    var addBoxIndex = -1;
    //初始化页面上面的按钮事件
    $('#btn_query').on('click', function () {
        runningState.table.bootstrapTable('refresh', runningState.queryParams());
    });

    $('#btn_edit').on('click', function () {
        if (runningState.select(layerTips)) {
            var stateCode = runningState.currentItem.stateCode;
            doAjax(runningState.baseUrl + '/select', function(data) {
 				if (data.code==200) {	
 					 var result = data.data;
 					$.get(runningState.entity+'/edit', null, function (form) {
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
 	                            form.render();
 	                            form.on('submit(edit)', function (data) {
 	                            	 doAjax(runningState.baseUrl+"/edit", function(data) {
 	                       				if (data.code==200) {	
 	                       					 layerTips.msg('修改成功');
 	                                         layerTips.close(index);
 	                                         location.reload();
 	                       				}else{
 	                       					 layerTips.msg(data.message);
 	                       				} 
 	                       			}, JSON.stringify({"data":data.field}), "post");
 	                               });
 	                                //这里可以写ajax方法提交表单
 	                                return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
 	                            }
 	                        });
 	                    });
 				  }	  
	 			}, {"data":stateCode}, "GET");
         }
    });

});

