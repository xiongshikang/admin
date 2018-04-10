var baseShop = {
    baseUrl: "/admin/web/baseShop",
    entity: "baseShop",
    tableId: "userTable",
    toolbarId: "toolbar",
    unique: "id",
    order: "asc",
    currentItem: {}
};
baseShop.columns = function () {
    return [{
        checkbox: true
    }, {
        field: 'shopCode',
        title: '门店编号'
    }, {
        field: 'shopName',
        title: '门店名称'
    }, {
        field: 'companyName',
        title: '公司名称'
    }, {
        field: 'companyCode',
        title: '公司id',
        visible:false
    }, {
        field: 'shopLongitude',
        title: '经度'
    }, {
        field: 'shopLatitude',
        title: '纬度'
    }, {
        field: 'provinceNo',
        title: '省份编号',
        visible:false
    }, {
        field: 'cityNo',
        title: '城市编号',
        visible:false
    }, {
        field: 'townNo',
        title: '地区编号',
        visible:false
    }, {
        field: 'contacts',
        title: '联系人'
    }, {
        field: 'phone',
        title: '联系电话'
    }, {
        field: 'shopAddress',
        title: '商铺地址'
    }, {
        field: 'version',
        title: '版本号'
    }, {
        field: 'createTime',
        title: '创建时间'
    }, {
        field: 'updateTime',
        title: '更新时间'
    }];
};
baseShop.queryParams = function (params) {
    if (!params)
        return {
            shopName: $("#shopName").val()
        };
    var temp = { //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
        limit: params.limit, //页面大小
        offset: params.offset, //页码
        shopName: $("#shopName").val()
    };
    var data = {
        data: temp
    }
    return data;
};

baseShop.init = function () {

    baseShop.table = $('#' + baseShop.tableId).bootstrapTable({
        url: baseShop.baseUrl, //请求后台的URL（*）
        method: 'post', //请求方式（*）
        toolbar: '#' + baseShop.toolbarId, //工具按钮用哪个容器
        striped: true, //是否显示行间隔色
        cache: false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: true, //是否显示分页（*）
        sortable: false, //是否启用排序
        sortOrder: baseShop.order, //排序方式
        queryParams: baseShop.queryParams,//传递参数（*）
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
        uniqueId: baseShop.unique, //每一行的唯一标识，一般为主键列
        showToggle: true, //是否显示详细视图和列表视图的切换按钮
        cardView: false, //是否显示详细视图
        detailView: false, //是否显示父子表
        columns: baseShop.columns()
    });
};


baseShop.select = function (layerTips) {
    var rows = baseShop.table.bootstrapTable('getSelections');
    if (rows.length == 1) {
        baseShop.currentItem = rows[0];
        return true;
    } else {
        layerTips.msg("请选中一行");
        return false;
    }
};


layui.use(['form', 'layedit', 'laydate'], function () {
    baseShop.init();
    var editIndex;
    var layerTips = parent.layer === undefined ? layui.layer : parent.layer, //获取父窗口的layer对象
        layer = layui.layer, //获取当前窗口的layer对象
        form = layui.form(),
        layedit = layui.layedit,
        laydate = layui.laydate;
    var addBoxIndex = -1;
    //初始化页面上面的按钮事件
    $('#btn_query').on('click', function () {
        baseShop.table.bootstrapTable('refresh', JSON.stringify({data:baseShop.queryParams()}));
    });


    $('#btn_edit').on('click', function () {
        if (baseShop.select(layerTips)) {
            var shopCode = baseShop.currentItem.shopCode;
            doAjax(baseShop.baseUrl + '/select', function (data) {
                if (data.code == 200) {
                    var result = data.data;
                    $.get(baseShop.entity + '/edit', null, function (form) {
                        layer.open({
                            type: 1,
                            title: '编辑基础店铺信息',
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
                                layero.find(":input[name='shopCode']").attr("disabled", "disabled");
                                form.on('submit(edit)', function (data) {
                                    doAjax(baseShop.baseUrl + "/edit", function (data) {
                                        if (data.code == 200) {
                                            layerTips.msg('修改成功');
                                            layerTips.close(index);
                                            location.reload();
                                        } else {
                                            layerTips.msg(data.message);
                                        }
                                    }, JSON.stringify({data:data.field}), "POST");
                                });
                                initAddressInfo(form, data);
                                //这里可以写ajax方法提交表单
                                return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
                            }

                        });

                    });

                }
            }, JSON.stringify({"data": shopCode}), "POST");
        }
    });


    $('#btn_del').on('click', function () {
        if (baseShop.select(layerTips)) {
            var shopCode = baseShop.currentItem.shopCode;
            layer.confirm('确定删除数据吗？', null, function (index) {
                doAjax(baseShop.baseUrl + "/delete", function (data) {
                    if (data.code == 200) {
                        layerTips.msg("册除成功！");
                        location.reload();
                    } else {
                        layerTips.msg(data.message);
                        location.reload();
                    }
                }, JSON.stringify({"data":shopCode}), "POST");
                layer.close(index);
            });
        }
    });

});


//初始化省份下拉
function initAddressInfo(form, baseShop) {
    doAjax("/admin/web/province", function (data) {
        if (data.code == 200) {
            console.log(data);
            var provinceList = data.data;
            var htmlProvince = "";
            $.each(provinceList, function (index, val) {
                if(baseShop.data.provinceNo == val.code){
                    htmlProvince += "<option selected value='" + val.code + "'>" + val.name + "</option>";
                }else{
                    htmlProvince += "<option value='" + val.code + "'>" + val.name + "</option>";
                }
            });
            $('[name=provinceNo]').empty();
            $('[name=provinceNo]').append(htmlProvince);
            form.render('select');
        }
    }, null, "GET");

    doAjax("/admin/web/town", function (data) {
        if (data.code == 200) {
            console.log(data);
            var townList = data.data;
            var htmlTown = "";
            $.each(townList, function (index, val) {
                if(baseShop.data.townNo == val.code){
                    htmlTown += "<option selected value='" + val.code + "'>" + val.name + "</option>";
                }else{
                    htmlTown += "<option value='" + val.code + "'>" + val.name + "</option>";
                }
            });
            $('[name=townNo]').empty();
            $('[name=townNo]').append(htmlTown);
            form.render();
        }
    }, {"data": baseShop.data.cityNo}, "GET");


    doAjax("/admin/web/city", function (data) {
        if (data.code == 200) {
            console.log(data);
            var cityList = data.data;
            var htmlCity = "";
            $.each(cityList, function (index, val) {
                if(baseShop.data.cityNo == val.code){
                    htmlCity += "<option selected value='" + val.code + "'>" + val.name + "</option>";
                }else{
                    htmlCity += "<option value='" + val.code + "'>" + val.name + "</option>";
                }

            });
            $('[name=cityNo]').empty();
            $('[name=cityNo]').append(htmlCity);
            form.render();
        }
    }, {"data": baseShop.data.provinceNo}, "GET");


    doAjax("/admin/web/companyAll", function (data) {
        if (data.code == 200) {
            console.log(data);
            var cityList = data.data;
            var htmlCompany = "";
            $.each(cityList, function (index, val) {
                if(baseShop.data.companyCode == val.companyCode){
                    htmlCompany += "<option selected value='" + val.companyCode + "'>" + val.companyName + "</option>";
                }else{
                    htmlCompany += "<option value='" + val.companyCode + "'>" + val.companyName + "</option>";
                }

            });
            $('[name=companyCode]').empty();
            $('[name=companyCode]').append(htmlCompany);
            form.render();
        }
    }, {"data": baseShop.data.provinceNo}, "GET");

    form.on('select(provinceNo)', function (data) {
        var provinceNo = data.value;
        $('[name=cityNo]').empty();
        doAjax("/admin/web/city", function (data) {
            if (data.code == 200) {
                console.log(data);
                var cityList = data.data;
                var html = "";
                $.each(cityList, function (index, val) {
                    html += "<option value='" + val.code + "'>" + val.name + "</option>";
                });
                $('[name=cityNo]').empty();
                $('[name=cityNo]').append(html);
                form.render();
            }
        }, {"data": provinceNo}, "GET");
    });

    form.on('select(cityNo)', function (data) {
        var cityNo = data.value;
        $('[name=townNo]').empty();
        doAjax("/admin/web/town", function (data) {
            if (data.code == 200) {
                console.log(data);
                var townList = data.data;
                var html = "";
                $.each(townList, function (index, val) {
                    html += "<option value='" + val.code + "'>" + val.name + "</option>";
                });
                $('[name=townNo]').empty();
                $('[name=townNo]').append(html);
                form.render();
            }
        }, {"data": cityNo}, "GET");
    });

}

function mm(a) {
    return /(\x0f[^\x0f]+)\x0f[\s\S]*\1/.test("\x0f" + a.join("\x0f\x0f") + "\x0f");
}