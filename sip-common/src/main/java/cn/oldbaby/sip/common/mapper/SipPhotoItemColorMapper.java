package cn.oldbaby.sip.common.mapper;

import cn.oldbaby.sip.common.domain.SipPhotoItemColor;

import java.util.List;

/**
* @author mickey
* @description 针对表【sip_photo_item_color】的数据库操作Mapper
* @createDate 2025-07-07 19:56:23
* @Entity cn.oldbaby.sip.common.SipPhotoItemColor
*/
public interface SipPhotoItemColorMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SipPhotoItemColor record);

    int insertSelective(SipPhotoItemColor record);

    SipPhotoItemColor selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SipPhotoItemColor record);

    int updateByPrimaryKey(SipPhotoItemColor record);

    List<SipPhotoItemColor> selectList(SipPhotoItemColor record);

}
