package cn.oldbaby.sip.common.mapper;

import cn.oldbaby.sip.common.domain.SipMinipUser;

import java.util.List;

/**
* @author mickey
* @description 针对表【sip_minip_user(小程序用户表)】的数据库操作Mapper
* @createDate 2025-07-07 19:56:23
* @Entity cn.oldbaby.sip.common.SipMinipUser
*/
public interface SipMinipUserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SipMinipUser record);

    int insertSelective(SipMinipUser record);

    SipMinipUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SipMinipUser record);

    int updateByPrimaryKey(SipMinipUser record);

    List<SipMinipUser> selectList(SipMinipUser record);

}
