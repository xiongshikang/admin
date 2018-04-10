/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web.enums;

import cn.guludai.api.Code;

/**
 * @author gaopeng
 */
public enum AdminBaseCode implements Code {

        SUCCESS("200", "成功"),
        NO_DATA("201", "没有查到数据"),
        ERROR_INVALID("5000", "DB操作无效"),
        ERROR_SQL("5001", "DB异常"),
        ERROR_REQ_A002("A002", "请求参数缺少"),
        ERROR_SYS("5003", "系统异常"),
        BASE_SHOP_ERP_NOT_EMPTY("5004","安全信息已存在"),
        AES_CREATE_ERROR("5005","AES生成错误"),
        RSA_CREATE_ERROR("5005","rsa生成错误"),
        COPY_PROPERTIES_ERROR("5006","copy属性错误"),
        INVALID_SQL("5007", "DB异常"),
        ERROR_UPLOAD("5008", "文件上传异常"),
        REQ_ERROR_PLUGINNAME("5009", "插件名称太长"),
        ERROR_FILE_DEL("5010", "文件删除异常"),
        ERROR_SNAME_NAME("5011", "店面名称重复");
        private final String code;
        private final String message;

        AdminBaseCode(String code, String message)
        {
                this.code = code;
                this.message = message;
        }

        @Override
        public String getMessage() {
                return message;
        }

        @Override
        public String getCode() {
                return code;
        }


        public static boolean isSignType(String code)
        {
                for (AdminBaseCode s : AdminBaseCode.values())
                {
                        if (s.getCode().equals(code))
                        {
                                return true;
                        }
                }
                return false;
        }
}
