package cn.oldbaby.sip.common.mapper;

import cn.oldbaby.sip.common.domain.SipPhotoCategory;

import java.util.List;

/**
* @author mickey
* @description 针对表【sip_photo_category(相册分类表)】的数据库操作Mapper
* @createDate 2025-07-07 19:56:23
* @Entity cn.oldbaby.sip.common.SipPhotoCategory
*/
public interface SipPhotoCategoryMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SipPhotoCategory record);

    int insertSelective(SipPhotoCategory record);

    SipPhotoCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SipPhotoCategory record);

    int updateByPrimaryKey(SipPhotoCategory record);

    List<SipPhotoCategory> selectList(SipPhotoCategory record);

}
