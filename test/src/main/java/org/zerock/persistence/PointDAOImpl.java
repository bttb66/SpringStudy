package org.zerock.persistence;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.MessageVO;


@Repository
public class PointDAOImpl implements PointDAO{
	
	@Inject SqlSession session;
	
	private static String namespace = "org.zerock.mapper.pointMapper";
	
	@Override
	public void updatePoint(String uid, int point) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<>();
		
		paramMap.put("uid", uid);
		paramMap.put("point", point);
		
		session.update(namespace+".updatePoint", paramMap);
	}

}
