package mf.dao;

import mf.entity.MfHouseClickEntity;
import mf.entity.MfHouseInfoEntity;

import java.util.Map;

/**
 * 
 * 
 * @author dengfan
 * @email 283105211@qq.com
 * @date 2017-03-05 21:40:30
 */
public interface MfHouseClickDao extends BaseDao<MfHouseClickEntity> {

    MfHouseClickEntity queryObjectByOpenId(Map<String, Object> map);

}
