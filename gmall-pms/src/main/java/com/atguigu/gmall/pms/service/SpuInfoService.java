package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.vo.SpuInfoVO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.SpuInfoEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * spu信息
 *
 * @author lby
 * @email lxf@atguigu.com
 * @date 2020-01-02 14:53:43
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageVo queryPage(QueryCondition params);


    PageVo querySpuByCidOrKey(QueryCondition condition, Long catId);

    void bigsave(SpuInfoVO spuInfoVO);
}

