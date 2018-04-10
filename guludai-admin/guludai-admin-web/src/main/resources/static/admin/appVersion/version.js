var version = {
    baseUrl: "/admin/web/appVersion",
    entity: "appVersion",
    tableId: "userTable",
    toolbarId: "toolbar",
    unique: "id",
    order: "asc",
    currentItem: {}
};
version.columns = function () {
    return [{
        checkbox: true
    },{
        field: 'versionCode',
        title: 'APP版本编号'
    }, {
        field: 'versionNumber',
        title: 'APP版本号'
    },{
        field: 'versionOrder',
        title: 'APP升级排序号'
    },{
        field: 'versionStatus',
        title: 'APP版本启用状态'
    },{
        field: 'versionUpgrade',
        title: 'APP是否强制升级'
    },{
        field: 'versionDescription',
        title: '升级说明描述公告'
    },{
        field: 'downloadUrl',
        title: '升级包下载URL'
    },{
        field: 'downloadPlatform',
        title: '支持手机平台'
    }, {
        field: 'createTime',
        title: '创建时间'
    }, {
        field: 'updateTime',
        title: '更新时间'
    }];
};
version.queryParams = function (params) {
    if (!params)
        return {
            pluginName: $("#pluginName").val()
        };
    var temp = { //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
        limit: params.limit, //页面大小
        offset: params.offset, //页码
        pluginName: $("#pluginName").val()
    };
    var data= {
        data:temp
    }
    return data;
};

version.init = function () {

    version.table = $('#' + version.tableId).bootstrapTable({
        url: version.baseUrl, //请求后台的URL（*）
        method: 'post', //请求方式（*）
        toolbar: '#' + version.toolbarId, //工具按钮用哪个容器
        striped: true, //是否显示行间隔色
        cache: false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: true, //是否显示分页（*）
        sortable: false, //是否启用排序
        sortOrder: version.order, //排序方式
        queryParams: version.queryParams,//传递参数（*）
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
        uniqueId: version.unique, //每一行的唯一标识，一般为主键列
        showToggle: true, //是否显示详细视图和列表视图的切换按钮
        cardView: false, //是否显示详细视图
        detailView: false, //是否显示父子表
        columns: version.columns()
    });
};
version.select = function (layerTips) {
    var rows = version.table.bootstrapTable('getSelections');
    if (rows.length == 1) {
        version.currentItem = rows[0];
        return true;
    } else {
        layerTips.msg("请选中一行");
        return false;
    }
};

layui.use(['form', 'layedit', 'laydate' , 'upload'], function () {
    version.init();
    var editIndex;
    var layerTips = parent.layer === undefined ? layui.layer : parent.layer, //获取父窗口的layer对象
        layer = layui.layer, //获取当前窗口的layer对象
        form = layui.form(),
        upload = layui.upload,
        layedit = layui.layedit,
        laydate = layui.laydate;
    var addBoxIndex = -1;


    // upload.render({
    //     elem: '#id'
    //     ,url: version.entity + '/upload' //必填项
    //     ,method: ''  //可选项。HTTP类型，默认post
    //     ,data: {} //可选项。额外的参数，如：{id: 123, abc: 'xxx'}
    // });


    //初始化页面上面的按钮事件
    $('#btn_query').on('click', function () {
        version.table.bootstrapTable('refresh', version.queryParams());
    });

    $('#btn_add').on('click', function () {
        if (addBoxIndex !== -1)
            return;
        //本表单通过ajax加载 --以模板的形式，当然你也可以直接写在页面上读取
        $.get(version.entity + '/edit', null, function (form) {
            addBoxIndex = layer.open({
                type: 1,
                title: '上传APP',
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
                    form.render();
                    form.on('submit(edit)', function (data) {
                        var formData = new FormData();
                        formData.append('downloadFile', $('#downloadFile')[0].files[0]);
                        $.each(data.field, function (name, value) {
                            formData.append(name,value);
                        });
                        $.ajax({
                            url: version.baseUrl+"/add",
                            type: 'POST',
                            cache: false,
                            data: formData,
                            processData: false,
                            contentType: false
                        }).done(function(data) {
                            var data = JSON.parse(data);
                            if (data.code==200) {
                                layerTips.msg('修改成功');
                                layerTips.close(index);
                                location.reload();
                            }
                        }).fail(function(data) {
                            layerTips.msg(data.message);
                        });
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
        if (version.select(layerTips)) {
            var versionCode = version.currentItem.versionCode;
            doAjax(version.baseUrl + '/select', function(data) {
                if (data.code==200) {
                    var result = data.data;
                    $.get(version.entity+'/edit2', null, function (form) {
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
                                $('form.layui-form').find('button[lay-filter=edit2]').click();
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
                                layero.find(":input[name='versionCode']").attr("disabled", "disabled");
                                form.render();
                                form.on('submit(edit2)', function (data) {
                                    // doAjax(version.baseUrl+"/edit", function(data) {
                                    //     if (data.code==200) {
                                    //         layerTips.msg('修改成功');
                                    //         layerTips.close(index);
                                    //         location.reload();
                                    //     }else{
                                    //         layerTips.msg(data.message);
                                    //     }
                                    // }, JSON.stringify({ "data" : data.field }), "POST");
                                    var formData = new FormData();
                                    formData.append('downloadFile', $('#downloadFile')[0].files[0]);
                                    $.each(data.field, function (name, value) {
                                        formData.append(name,value);
                                    });
                                    $.ajax({
                                        url: version.baseUrl+"/edit",
                                        type: 'POST',
                                        cache: false,
                                        data: formData,
                                        processData: false,
                                        contentType: false
                                    }).done(function(data) {
                                        var data = JSON.parse(data);
                                        if (data.code==200) {
                                            layerTips.msg('修改成功');
                                            layerTips.close(index);
                                            location.reload();
                                        }
                                    }).fail(function(data) {
                                        layerTips.msg(data.message);
                                    });
                                    return false;
                                    return false;
                                });
                                //这里可以写ajax方法提交表单
                                return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
                            }
                        });
                    });
                }
            }, JSON.stringify({"data":versionCode}), "POST");
        }
    });


    $('#btn_del').on('click', function () {
        if (version.select(layerTips)) {
            var versionCode = version.currentItem.versionCode;
            layer.confirm('确定删除数据吗？', null, function (index) {
                doAjax(version.baseUrl+"/delete", function(data) {
                    if (data.code==200) {
                        layerTips.msg("册除成功！");
                        location.reload();
                    }else{
                        layerTips.msg(data.message);
                        location.reload();
                    }

                }, JSON.stringify({"data":versionCode}), "POST");
                layer.close(index);
            });
        }
    });
});

function showDownloadUrl(fileName){
    console.log(fileName[0].name);
    doAjax(version.baseUrl+"/physicalAddress", function(data) {
        if (data.code==200) {
            var html = data.data+fileName[0].name;
            $('[name=downloadPath]').val(html);
            form.render();
        }
    }, null, "GET");
}