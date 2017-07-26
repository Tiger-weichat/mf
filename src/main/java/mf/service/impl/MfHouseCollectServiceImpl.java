package mf.service.impl;

import mf.entity.MfHouseInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import mf.dao.MfHouseCollectDao;
import mf.entity.MfHouseCollectEntity;
import mf.service.MfHouseCollectService;



@Service("mfHouseCollectService")
public class MfHouseCollectServiceImpl implements MfHouseCollectService {
	@Autowired
	private MfHouseCollectDao mfHouseCollectDao;
	
	@Override
	public MfHouseCollectEntity queryObject(Integer id){
		return mfHouseCollectDao.queryObject(id);
	}
	
	@Override
	public List<MfHouseCollectEntity> queryList(Map<String, Object> map){
		return mfHouseCollectDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return mfHouseCollectDao.queryTotal(map);
	}
	
	@Override
	public void save(MfHouseCollectEntity mfHouseCollect){
		mfHouseCollectDao.save(mfHouseCollect);
	}
	
	@Override
	public void update(MfHouseCollectEntity mfHouseCollect){
		mfHouseCollectDao.update(mfHouseCollect);
	}
	
	@Override
	public void delete(Integer id){
		mfHouseCollectDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		mfHouseCollectDao.deleteBatch(ids);
	}

	@Override
	public List<MfHouseInfoEntity> queryMyCollect(Map<String, Object> map) {
		return mfHouseCollectDao.queryMyCollect(map);
	}

	@Override
	public void del(MfHouseCollectEntity entity) {
		mfHouseCollectDao.del(entity);
	}
}
