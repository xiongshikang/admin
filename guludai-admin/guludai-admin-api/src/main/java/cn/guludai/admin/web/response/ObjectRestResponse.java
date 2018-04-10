package cn.guludai.admin.web.response;

import java.util.List;

/**
 * 
 * @ClassName: ObjectRestResponse 
 * @Description: 帮助类
 * @author: xiongshikang
 * @date: 2017年11月15日 下午4:15:33 
 * @param <T>
 */
public class ObjectRestResponse<T> {
    boolean rel;
    String msg;
    T result;

	public boolean isRel() {
        return rel;
    }

    public void setRel(boolean rel) {
        this.rel = rel;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public ObjectRestResponse rel(boolean rel) {
        this.setRel(rel);
        return this;
    }

    public ObjectRestResponse msg(String msg) {
        this.setMsg(msg);
        return this;
    }

    public ObjectRestResponse result(T result) {
        this.setResult(result);
        return this;
    }
}
