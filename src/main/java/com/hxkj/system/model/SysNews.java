package com.hxkj.system.model;

import com.jfinal.kit.StrKit;
import com.jfinal.plugin.activerecord.Page;
import com.hxkj.system.model.base.BaseSysNews;

/**
*  table name: sys_news   
*/
public class SysNews extends BaseSysNews<SysNews> implements java.io.Serializable{

    private static final long serialVersionUID = 1L;
    public static final SysNews dao = new SysNews().dao();

    public Page<SysNews>  page(int pageNumber,int pageSize,String where ){

        String sqlSelect = " select sn.id,sn.title,sn.create_time,sn.tags, sn.user_id, su.name as user_name ";
        String sqlExceptSelect = " from sys_news sn left join sys_user  su on sn.user_id = su.id";
        if (StrKit.notBlank(where)) {
            sqlExceptSelect += " where " + where;
        }

        return this.paginate(pageNumber,pageSize,sqlSelect,sqlExceptSelect);
    };

}
