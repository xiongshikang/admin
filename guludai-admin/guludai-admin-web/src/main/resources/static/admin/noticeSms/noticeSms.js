var license = {
    baseUrl: "/admin/web/appUser",
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
        field: 'account',
        title: '用户账户'
    }, {
        field: 'mobile',
        title: '手机号'
    }, {
        field: 'status',
        title: '账户状态'
    }, {
        field: 'category',
        title: '账户类型'
    }, {
        field: 'name',
        title: '姓名'
    }, {
        field: 'wechat',
        title: '微信号'
    }, {
        field: 'smsStatus',
        title: '短信通知状态'
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
    },{
        field: 'operate',
        title: '操作',
        formatter: operateFormatter //自定义方法，添加操作按钮
    }];
};
license.queryParams = function (params) {
	if (!params)
        return {
            mobile: $("#mobile").val()
        };
    var temp = { //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
        limit: params.limit, //页面大小
        offset: params.offset, //页码
        mobile: $("#mobile").val()
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
        // clickToSelect: true, //是否启用点击选中行
        uniqueId: license.unique, //每一行的唯一标识，一般为主键列
        showToggle: true, //是否显示详细视图和列表视图的切换按钮
        cardView: false, //是否显示详细视图
        detailView: false, //是否显示父子表
        columns: license.columns()
    });
};

function operateFormatter(value, row, index) {//赋予的参数
    return [
        '<a class="layui-btn layui-btn-danger" href="#" onclick="batchSend('+row.mobile+')">短信通知</a>'
    ].join('');
}

function batchSend(value) {
    var layerTips = parent.layer === undefined ? layui.layer : parent.layer ; //获取父窗口的layer对象
    var obj = value+"";
    console.log(JSON.stringify({"data":obj}));
    doAjax(license.baseUrl+"/batchSendSms", function(data) {
        if (data.code==200) {
            layerTips.msg('发送成功');
            layerTips.close(index);
            location.reload();
        }else{
            layerTips.msg(data.message);
        }
    }, JSON.stringify({"data":obj}), "POST");
    location.reload();
}


license.select = function (layerTips) {
    var rows = license.table.bootstrapTable('getSelections');
    if (rows.length == 0) {
        layerTips.msg("请选中一行");
        return false;
    }else{
        return true;
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


    $('#btn_edit').on('click', function () {
        if (license.select(layerTips)) {
            var rows = license.table.bootstrapTable('getSelections');
            var mobiles = "";
            for (var i = 0 ; i <rows.length ; i ++){
                mobiles = mobiles + "," + rows[i].mobile
            }
            batchSend(mobiles);
         }
    });

});



function mm(a){
	   return /(\x0f[^\x0f]+)\x0f[\s\S]*\1/.test("\x0f"+a.join("\x0f\x0f") +"\x0f");
}