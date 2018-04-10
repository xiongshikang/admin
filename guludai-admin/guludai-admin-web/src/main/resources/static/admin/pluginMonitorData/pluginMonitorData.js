var pluginMonitorData = {
    baseUrl: "/admin/web/pluginMonitorData",
    entity: "pluginMonitorData",
    tableId: "userTable",
    toolbarId: "toolbar",
    unique: "id",
    order: "asc",
    currentItem: {}
};
pluginMonitorData.columns = function () {
    return [{
        checkbox: true
    }, {
        field: 'monitorTable',
        title: '监控数据表名'
    }, {
        field: 'monitorTime',
        title: '监控统计日期'
    }, {
        field: 'pluginCount',
        title: '插件上传数据总量'
    }, {
        field: 'platformCount',
        title: '数据平台接受数据总量'
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
pluginMonitorData.queryParams = function (params) {
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

pluginMonitorData.init = function () {

    pluginMonitorData.table = $('#' + pluginMonitorData.tableId).bootstrapTable({
        url: pluginMonitorData.baseUrl, //请求后台的URL（*）
        method: 'post', //请求方式（*）
        toolbar: '#' + pluginMonitorData.toolbarId, //工具按钮用哪个容器
        striped: true, //是否显示行间隔色
        cache: false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: true, //是否显示分页（*）
        sortable: false, //是否启用排序
        sortOrder: pluginMonitorData.order, //排序方式
        queryParams: pluginMonitorData.queryParams,//传递参数（*）
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
        uniqueId: pluginMonitorData.unique, //每一行的唯一标识，一般为主键列
        showToggle: true, //是否显示详细视图和列表视图的切换按钮
        cardView: false, //是否显示详细视图
        detailView: false, //是否显示父子表
        columns: pluginMonitorData.columns()
    });
};
pluginMonitorData.select = function (layerTips) {
    var rows = pluginMonitorData.table.bootstrapTable('getSelections');
    if (rows.length == 1) {
        pluginMonitorData.currentItem = rows[0];
        return true;
    } else {
        layerTips.msg("请选中一行");
        return false;
    }
};

layui.use(['form', 'layedit', 'laydate'], function () {
    pluginMonitorData.init();
    var editIndex;
    var layerTips = parent.layer === undefined ? layui.layer : parent.layer, //获取父窗口的layer对象
        layer = layui.layer, //获取当前窗口的layer对象
        form = layui.form(),
        layedit = layui.layedit,
        laydate = layui.laydate;
    var addBoxIndex = -1;
    //初始化页面上面的按钮事件
    $('#btn_query').on('click', function () {
        pluginMonitorData.table.bootstrapTable('refresh', pluginMonitorData.queryParams());
    });

});

