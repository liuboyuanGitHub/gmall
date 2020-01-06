package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.vo.GroupVO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.AttrGroupEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;

import java.util.List;


/**
 * 属性分组
 *
 * @author lby
 * @email lxf@atguigu.com
 * @date 2020-01-02 14:53:43
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageVo queryPage(QueryCondition params);


    PageVo queryGroupByCidPage(QueryCondition queryCondition, Long catId);

    GroupVO queryGroupVOByGid(Long gid);

    List<GroupVO> queryGroupVOsByCid(Long catId);
}

